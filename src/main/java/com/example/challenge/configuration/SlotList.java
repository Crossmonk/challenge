package com.example.challenge.configuration;

import com.example.challenge.controller.Response.Slot;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SlotList {

    private List<Slot> inMemorySlotList;

    /**
     * Using an in memory variable that spring will instantiate during its runtime.
     * @return List from memory.
     */
    @Bean
    public List<Slot> getAdvertisementSlots(){
        if(inMemorySlotList == null){
            inMemorySlotList = new ArrayList<>();
        }
        return inMemorySlotList;
    }

}
