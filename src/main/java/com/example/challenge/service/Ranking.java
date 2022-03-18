package com.example.challenge.service;

public interface Ranking {
    /**
     *  the “rank by revenue” mechanism (wj = α1j)
     */
    void rankByRevenue();

    /**
     * the “rank by bid” mechanism
     * (wj = 1)
     */
    void rankByBid();
}
