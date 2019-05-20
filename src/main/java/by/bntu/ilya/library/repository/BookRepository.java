package by.bntu.ilya.library.repository;

import by.bntu.ilya.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByTagsIn(Set<String> tags);
}
