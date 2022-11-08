package com.kodilla.good.patterns.food2door.suppliers;

import com.kodilla.good.patterns.food2door.orderretireve.Order;
import com.kodilla.good.patterns.food2door.reply.EFSReply;
import com.kodilla.good.patterns.food2door.reply.HSReply;
import com.kodilla.good.patterns.food2door.reply.ReplyReceiver;

public class HealthyShop implements OrderFromShop {

    private Order order;
    private HSReply replyReceived;

    public HealthyShop(Order order) {
        this.order = order;

    }

    @Override
    public boolean process() {
        boolean isPurchased = replyReceived.reply(order);
        if (isPurchased) {
            System.out.println(" Delivered by DPD Courier company");
            return true;
        } else {
            System.out.println("Delivery impossible");
            return false;
        }
    }
}