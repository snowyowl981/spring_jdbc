package spring.example;

public class PaymentService {
	MemberDao memberDao;
	
	// property memberDao setter
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void pay() {
		memberDao.getMember();
		System.out.println("지급이 완료되었습니다.");
	}
}