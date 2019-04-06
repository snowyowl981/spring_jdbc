package spring.exampleWithoutInjection;

public class ArticleService {

	MemberDao memberDao = null;

	public ArticleService() {
		// memberDao를 만들어서 초기화
		memberDao = new MemberDao();
	}

	public void addArticle() {
		memberDao.getMember();
		System.out.println("글을 등록했습니다.");
	}
}