
package com.example.demo.services;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RatingService {

    RestTemplate restTemplate;

    public RatingService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getRating() throws JSONException {
        // Instead of query to DB
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("bookRating", "4.5");
        return jsonObject.toString();
    }
}