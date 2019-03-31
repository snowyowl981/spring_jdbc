package spring.chap04;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import spring.chap03.DuplicateMemberException;
import spring.chap03.Member;
import spring.chap03.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberRegisterService {

	@Autowired
	private MemberDao memberDao;

	static Logger logger = LogManager.getLogger();

	public void regist(RegisterRequest req) {
		logger.debug(req);
		Member member = memberDao.selectByEmail(req.getEmail());

		if (member != null) {
			throw new DuplicateMemberException("email overlap" + req.getEmail());
		}

		Member newMember = new Member(req.getEmail(), req.getPassword(),
				req.getName());
		memberDao.insert(newMember);
		logger.debug("Membership information has been saved.");
	}
}