package pl.entito;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	BookRepository repo;

	public void showAll() {
		System.out.println(repo.findAll());
	}

	public void countAll() {
		System.out.println("Book counter: " + repo.count());
	}

	public void showBookLikeTitle(String title) {
		System.out.println("Books: " + repo.showBookLikeTitle(title));
	}

	public void showBookLikeTitleByNamedParam(String title) {
		System.out.println("Books: " + repo.showBookLikeTitleByNamedParam(title));
	}

}
