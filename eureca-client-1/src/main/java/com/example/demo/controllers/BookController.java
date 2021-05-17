package com.example.demo.controllers;

import com.example.demo.service.BookService;
import org.codehaus.jettison.json.JSONException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/")
    public ResponseEntity<String > home() throws JSONException {
        return ResponseEntity.ok(bookService.getBookInfo());
    }
}
