package com.example.challenge.controller;

import com.example.challenge.controller.Response.Advertisement;
import com.example.challenge.controller.Response.Slot;
import com.example.challenge.util.SlotList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/advertisement")
public class RegisterAdvertisement {

    private final SlotList currentSlots;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void addAdvertisement(@RequestBody Advertisement ad){
        Slot slot = new Slot();

        slot.setAd(ad);
        slot.setPosition(currentSlots.getAdvertisementSlots().size()+1);

        currentSlots.getAdvertisementSlots().add(slot);
    }

}
