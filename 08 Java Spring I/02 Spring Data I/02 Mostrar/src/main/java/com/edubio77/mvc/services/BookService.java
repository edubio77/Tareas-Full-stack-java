package com.edubio77.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.edubio77.mvc.models.Book;
import com.edubio77.mvc.repositories.BookRepository;

@Service
public class BookService {
    //Agregando el book al repositorio como una dependencia
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    //Devolviendo todos los libros.
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    //Creando un libro.
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    //Obteniendo la información de un libro
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    //Editar un libro
    public Book updateBook(Long id,String title, String description, String language, int pages) {
        Book book = findBook(id);
        book.setTitle(title);
        book.setDescription(description);
        book.setLanguage(language);
        book.setNumberOfPages(pages);
        bookRepository.save(book);
        return book;
    }
    
    public Book updateBook(Book b) {
        return bookRepository.save(b);
    }
    
    //Borrar un libro
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
    }
    
}