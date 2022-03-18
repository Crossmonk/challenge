package com.example.challenge.service;

import com.example.challenge.controller.Response.Slot;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

public interface Search {

    List<Slot> search(String query);

    List<Slot> sponsoredSearch(String query);


}
