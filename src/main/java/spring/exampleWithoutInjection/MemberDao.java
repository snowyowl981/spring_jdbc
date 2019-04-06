package spring.exampleWithoutInjection;

public class MemberDao {

	public MemberDao() {
		System.out.println("memberDao created.");
	}

	public void getMember() {
		System.out.println("사용자 정보를 가져왔습니다.");
	}
}