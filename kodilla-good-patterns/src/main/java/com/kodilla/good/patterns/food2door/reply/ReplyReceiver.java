package com.kodilla.good.patterns.food2door.reply;

import com.kodilla.good.patterns.food2door.orderretireve.Order;

public interface ReplyReceiver {
    boolean reply(Order order);
}
