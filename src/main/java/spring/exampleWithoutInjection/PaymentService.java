package spring.exampleWithoutInjection;

public class PaymentService {
	MemberDao memberDao = null;

	public PaymentService() {
		this.memberDao = new MemberDao();
	}

	public void pay() {
		memberDao.getMember();
		System.out.println("지급이 완료되었습니다.");
	}
}