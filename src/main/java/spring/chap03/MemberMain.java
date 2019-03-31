package spring.chap03;

public class MemberMain {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		MemberRegisterService regService = new MemberRegisterService(memberDao);

		RegisterRequest req = new RegisterRequest();
		req.setEmail("dragon9813@gmail.com");
		req.setPassword("8870");
		req.setName("owl");

		regService.regist(req);
	}
}