package com.example.demo.controllers;

import com.example.demo.services.RatingService;
import org.codehaus.jettison.json.JSONException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatingController {

    RatingService bookService;

    public RatingController(RatingService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/")
    public ResponseEntity<String > home() throws JSONException {
        return ResponseEntity.ok(bookService.getRating());
    }
}
