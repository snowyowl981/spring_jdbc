package spring.chap02;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chap02.xml");
		Greeter g = ctx.getBean("greeter", Greeter.class);
		System.out.println(g.greet());
		ctx.close();
	}
}