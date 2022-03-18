package com.example.challenge.service;

import com.example.challenge.controller.Response.Slot;
import java.util.List;

public interface Search {

    List<Slot> search(String query);

    List<Slot> sponsoredSearch(String query);


}
