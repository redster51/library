package by.bntu.ilya.library.service;

import by.bntu.ilya.library.model.Book;

import java.util.List;
import java.util.Set;

public interface BookService {

    Book retrieve(Long id);

    Book retrieveByTags(Set<String> tags);

    List<Book> retrieveAll();

    Book createBook(Book dto);
}
