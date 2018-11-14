package pl.entito;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		BookService bookService = context.getBean(BookService.class);
		bookService.showAll();
		bookService.countAll();
		bookService.showBookLikeTitle("ava");
		bookService.showBookLikeTitleByNamedParam("ava");

		context.close();
	}
}
