package com.example.challenge.controller.Response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Advertisement {
    private Bid currentBid;
    private Slot currentSlot;
    private String ad;
    private boolean sponsored;
    private Bidder currentBidder;
    private Long printsQuantity;
}
