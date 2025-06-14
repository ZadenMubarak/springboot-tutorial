package org.example.store;

public class OrderService {

    PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void placeOrder(){

        var paymentServive = new StripePaymentService();
        paymentServive.processPayment(10);

    }

    public void cancelOrder(){}
}
