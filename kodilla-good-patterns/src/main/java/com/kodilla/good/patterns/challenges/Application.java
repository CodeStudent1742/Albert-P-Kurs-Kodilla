package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        orderRequest orderRequest = orderRequestRetriever.retrieve();


        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(), new BookOrderService(), new EmpikOrderRepository());
        productOrderService.process(orderRequest);
    }
}
