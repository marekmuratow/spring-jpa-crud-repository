package pl.entito;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends CrudRepository<Book, Long> {

	// custom Repository methods
	Book findByTitle(String title);

	@Query("select count(b) from Book b")
	long countBooks();

	@Query("select b from Book b where b.title like %?1%")
	List<Book> showBookLikeTitle(String title);

	@Query("select b from Book b where b.title like %:title%")
	List<Book> showBookLikeTitleByNamedParam(@Param("title") String title);
}