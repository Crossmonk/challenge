package com.example.challenge.service;

import com.example.challenge.controller.Response.Advertisement;
import com.example.challenge.controller.Response.Bid;
import com.example.challenge.controller.Response.Bidder;
import com.example.challenge.controller.Response.Slot;
import com.example.challenge.util.SlotList;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@RequiredArgsConstructor
public class SearchTest {

    @Autowired
    private Search search;

    @MockBean
    private SlotList slots;

    @BeforeEach
    void init(){
        Mockito.when(slots.getAdvertisementSlots()).thenReturn(createSlotList());
    }

    @Test
    void shouldFilterBySponsored(){
        //Search is case insensitive
        List<Slot> test = search.sponsoredSearch("Test");
        Assertions.assertEquals(1, test.size(), "Just one slot found");
    }

    private List<Slot> createSlotList() {
        List<Slot> slots = new ArrayList<>();

        Advertisement sponsoredAd = new Advertisement();
        sponsoredAd.setSponsored(true);
        sponsoredAd.setAd("Testing sponsored");
        sponsoredAd.setCurrentBid(new Bid());
        sponsoredAd.setCurrentBidder(new Bidder());
        sponsoredAd.setPrintsQuantity(5000L);

        Slot slot = new Slot();
        slot.setPosition(1);
        slot.setAd(sponsoredAd);

        sponsoredAd = new Advertisement();
        sponsoredAd.setSponsored(false);
        sponsoredAd.setAd("Testing non sponsored");
        sponsoredAd.setCurrentBid(new Bid());
        sponsoredAd.setCurrentBidder(new Bidder());
        sponsoredAd.setPrintsQuantity(5000L);

        slot = new Slot();
        slot.setPosition(2);
        slot.setAd(sponsoredAd);

        sponsoredAd = new Advertisement();
        sponsoredAd.setSponsored(false);
        sponsoredAd.setAd("Testing non sponsored");
        sponsoredAd.setCurrentBid(new Bid());
        sponsoredAd.setCurrentBidder(new Bidder());
        sponsoredAd.setPrintsQuantity(5000L);

        slot = new Slot();
        slot.setPosition(3);
        slot.setAd(sponsoredAd);

        sponsoredAd = new Advertisement();
        sponsoredAd.setSponsored(true);
        sponsoredAd.setAd("Another");
        sponsoredAd.setCurrentBid(new Bid());
        sponsoredAd.setCurrentBidder(new Bidder());
        sponsoredAd.setPrintsQuantity(5000L);

        slot = new Slot();
        slot.setPosition(4);
        slot.setAd(sponsoredAd);

        sponsoredAd = new Advertisement();
        sponsoredAd.setSponsored(false);
        sponsoredAd.setAd("Different");
        sponsoredAd.setCurrentBid(new Bid());
        sponsoredAd.setCurrentBidder(new Bidder());
        sponsoredAd.setPrintsQuantity(5000L);

        slot = new Slot();
        slot.setPosition(5);
        slot.setAd(sponsoredAd);

        return slots;
    }

}
