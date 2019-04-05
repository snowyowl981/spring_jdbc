package spring.chap08;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * p.204 [리스트 8.13]를 Main과 Service로 분리한 Main 부분<br>
 * Spring으로 bean을 관리함
 * 
 * @author Jacob
 */
public class MemberMainUsingSpring {

	/**
	 * main() 메서드
	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chap08.xml");
		MemberService memberService = ctx.getBean(MemberService.class);
		memberService.insertMember();
		memberService.selectAll();
		ctx.close();
	}
}