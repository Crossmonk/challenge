package com.example.challenge.service.implementation;

import com.example.challenge.controller.Response.Slot;
import com.example.challenge.service.Search;
import com.example.challenge.util.SlotList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SearchImpl implements Search {

    private final SlotList currentSlots;

    /**
     * Search in current non sponsored advertisements by query.
     * @param query string to look for
     * @return List of slots with advertisements that have the query string.
     */
    @Override
    public List<Slot> search(String query) {
        return currentSlots.getAdvertisementSlots().stream()
            .filter(slot -> !slot.getAd().isSponsored())
            .filter(slot -> slot.getAd().getAd().toUpperCase().contains(query.toUpperCase()))
            .collect(Collectors.toList());
    }

    /**
     * Search in current sponsored advertisements by query.
     * @param query string to look for
     * @return List of slots with advertisements that have the query string.
     */
    @Override
    public List<Slot> sponsoredSearch(String query) {
        return currentSlots.getAdvertisementSlots().stream()
            .filter(slot -> slot.getAd().isSponsored())
            .filter(slot -> slot.getAd().getAd().toUpperCase().contains(query.toUpperCase()))
            .collect(Collectors.toList());
    }
}
