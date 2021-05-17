package com.example.demo.service;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BookService {

    RestTemplate restTemplate;

    public BookService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getBookInfo() throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("bookTitle", "Spring in Action, Fifth Edition");
        jsonObject.put("author", "Craig Walls");
        jsonObject.put("rating", new JSONObject(
                restTemplate.exchange(
                        "http://localhost:8002/", HttpMethod.GET, null, String.class).getBody()));
        return jsonObject.toString();
    }
}
