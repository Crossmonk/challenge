package com.example.challenge.service;


import com.example.challenge.controller.Response.Advertisement;
import com.example.challenge.controller.Response.Bid;

public interface BidService {
    Bid getHigherWinningBid();
    void placeBid(Advertisement ad);

}
