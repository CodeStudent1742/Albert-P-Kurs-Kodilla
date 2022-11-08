package com.kodilla.good.patterns.food2door.suppliers;

import com.kodilla.good.patterns.food2door.orderretireve.Order;
import com.kodilla.good.patterns.food2door.reply.EFSReply;
import com.kodilla.good.patterns.food2door.reply.GFSReply;
import com.kodilla.good.patterns.food2door.reply.ReplyReceiver;

public class GlutenFreeShop implements OrderFromShop {
    private Order order;
    private GFSReply replyReceived;

    public GlutenFreeShop(Order order) {
        this.order = order;
    }

    @Override
    public boolean process() {
        boolean isPurchased = replyReceived.reply(order);
        if (isPurchased) {
            System.out.println("Train delivery of order");
            return true;
        } else {
            System.out.println("Delivery impossible");
            return false;
        }
    }
}

