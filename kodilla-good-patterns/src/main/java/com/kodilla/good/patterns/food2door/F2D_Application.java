package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.orderretireve.EFSOrder;
import com.kodilla.good.patterns.food2door.orderretireve.GFSOrder;
import com.kodilla.good.patterns.food2door.orderretireve.HSOrder;
import com.kodilla.good.patterns.food2door.orderretireve.Order;
import com.kodilla.good.patterns.food2door.reply.EFSReply;
import com.kodilla.good.patterns.food2door.reply.GFSReply;
import com.kodilla.good.patterns.food2door.reply.ReplyReceiver;
import com.kodilla.good.patterns.food2door.suppliers.ExtraFoodShop;
import com.kodilla.good.patterns.food2door.suppliers.GlutenFreeShop;
import com.kodilla.good.patterns.food2door.suppliers.HealthyShop;

public class F2D_Application {

    public static void main(String[] args) {

        EFSOrder eFSOrder = new EFSOrder();
        Order orderEFS = eFSOrder.retrieve();
        ExtraFoodShop eFS = new ExtraFoodShop(orderEFS);
        eFS.process();

        GFSOrder gFSOrder = new GFSOrder();
        Order gorderGFS = gFSOrder.retrieve();
        GlutenFreeShop gFS = new GlutenFreeShop(gorderGFS);
        gFS.process();


        HSOrder hSOrder = new HSOrder();
        Order orderHS = hSOrder.retrieve();
        HealthyShop hS = new HealthyShop(orderHS);
        hS.process();


    }
}
