package com.kodilla.good.patterns.food2door.reply;

import com.kodilla.good.patterns.food2door.orderretireve.Order;

public class EFSReply implements ReplyReceiver {

    public EFSReply() {
    }

  public  boolean reply(Order order){
        return true;
    } // For simulation always true
}
