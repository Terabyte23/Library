package org.example;


import org.example.apphelpers.AppHelper;
import org.example.apphelpers.AppHelperAuthor;
import org.example.input.Input;
import org.example.input.ConsoleInput;
import org.example.apphelpers.AppHelperBook;
import org.example.model.Author;
import org.example.model.Book;
import org.example.services.AuthorService;
import org.example.services.BookService;
import org.example.services.Service;

import java.util.ArrayList;
import java.util.List;


public class NPTV23Library {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        List<Author> authors = new ArrayList<>();
        Input input = new ConsoleInput();
        AppHelper<Author> appHelperAuthor = new AppHelperAuthor(input);
        Service<Author> authorService = new AuthorService(authors, appHelperAuthor);
        AppHelper<Book> appHelperBook = new AppHelperBook(input,authorService);
        Service<Book> bookService = new BookService(books,appHelperBook);
        App app = new App(input, bookService, authorService);
        app.run();
    }

}