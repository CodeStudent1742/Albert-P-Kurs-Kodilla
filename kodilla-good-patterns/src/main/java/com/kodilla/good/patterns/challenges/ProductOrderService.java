package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private SendService sendService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService, final SendService sendService, final OrderRepository orderRepository){
        this.informationService = informationService;
        this.sendService = sendService;
        this.orderRepository = orderRepository;

    }
    public  OrderDto process ( final orderRequest orderRequest){
        boolean isOrdered = sendService.send(orderRequest.getUser(),orderRequest.getFromShop(),orderRequest.getToLocation());

        if (isOrdered){
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(),orderRequest.getFromShop(),orderRequest.getToLocation());
            return new OrderDto(orderRequest.getUser(), true);
        }else{
            return new OrderDto(orderRequest.getUser(),false);
        }
    }

}
