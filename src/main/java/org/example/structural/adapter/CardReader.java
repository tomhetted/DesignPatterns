package org.example.structural.adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CardReader implements USB {

    private MemoryCard memoryCard;

    @Override
    public void connectWithUsbCable() {
        this.memoryCard.insert();
        this.memoryCard.copyData();
    }
}
