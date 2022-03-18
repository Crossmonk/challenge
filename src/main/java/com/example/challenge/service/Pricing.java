package com.example.challenge.service;

public interface Pricing {

    /**
     * when the bidder who secures a slot pays
     * their bid amount per click
     */
    void generalizedFirstPriceAuction();

    /**
     * when the bidder pays per click the
     * lowest bid necessary to retain his position, so that the bidder in slot j pays Sj+1/w
     */
    void generalizedSecondPriceAuction();
}
