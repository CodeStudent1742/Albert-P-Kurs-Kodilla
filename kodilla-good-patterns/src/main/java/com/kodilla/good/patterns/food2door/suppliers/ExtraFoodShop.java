package com.kodilla.good.patterns.food2door.suppliers;

import com.kodilla.good.patterns.food2door.orderretireve.Order;
import com.kodilla.good.patterns.food2door.reply.EFSReply;

public class ExtraFoodShop implements OrderFromShop {
    private Order order;
    private EFSReply replyReceived;

    public ExtraFoodShop(Order order) {
        this.order = order;
    }

    @Override
    public boolean process() {
        boolean isPurchased = replyReceived.reply(order);
        if (isPurchased) {
            System.out.println("Delivery by supply company bus");
            return true;
        } else {
            System.out.println("Delivery impossible");
            return false;
        }
    }
}
