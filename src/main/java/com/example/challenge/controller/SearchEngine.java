package com.example.challenge.controller;

import com.example.challenge.controller.Response.Slot;
import com.example.challenge.service.Search;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/search")
public class SearchEngine {
    private final Search searchEngine;

    @GetMapping("/sponsored")
    @ResponseStatus(HttpStatus.OK)
    public List<Slot> sponsoredSearch(@RequestParam(name = "query") String query) {
        return searchEngine.sponsoredSearch(query);
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Slot> normalSearch(@RequestParam(name = "query") String query) {
        return searchEngine.search(query);
    }
}
