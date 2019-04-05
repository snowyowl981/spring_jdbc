package spring.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExampleMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("example.xml");
		ArticleService articleService = ctx.getBean("articleService", ArticleService.class);
		PaymentService paymentService = ctx.getBean("paymentService", PaymentService.class);
		
		articleService.addArticle();
		paymentService.pay();
	}

}