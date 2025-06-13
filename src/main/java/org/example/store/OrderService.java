package org.example.store;

public class OrderService {

    public void placeOrder(){
        var paymentServive = new StripePaymentService();

        paymentServive.processPayment(10);
    }

    public void cancelOrder(){}
}
