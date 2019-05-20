package by.bntu.ilya.library.service;

import by.bntu.ilya.library.model.Book;
import by.bntu.ilya.library.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BookServiceImpl implements BookService {

    private BookRepository repository;

    @Override
    public Book retrieve(Long id) {
        return repository.findById(id).orElseThrow(NoResultException::new);
    }

    @Override
    public Book retrieveByTags(Set<String> tags) {
        return repository.findByTagsIn(tags);
    }

    @Override
    public List<Book> retrieveAll() {
        return repository.findAll();
    }

    @Override
    public Book createBook(Book dto) {
        return repository.save(dto);
    }
}
