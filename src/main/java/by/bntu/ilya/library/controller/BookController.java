package by.bntu.ilya.library.controller;

import by.bntu.ilya.library.model.Book;
import by.bntu.ilya.library.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("book")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BookController {

    private BookService service;

    @ResponseStatus(OK)
    @GetMapping("/{uuid}")
    public Book retrieve(@PathVariable(name = "uuid") Long id) {
        return service.retrieve(id);
    }

    @ResponseStatus(OK)
    @PostMapping("/byTags")
    public Book retrieveByTags(Set<String> tags) {
        return service.retrieveByTags(tags);
    }

    @ResponseStatus(OK)
    @GetMapping("all")
    public List<Book> retrieveAll() {
        return service.retrieveAll();
    }

    @ResponseStatus(CREATED)
    @PutMapping
    public Book createBook(Book dto) {
        return service.createBook(dto);
    }
}
