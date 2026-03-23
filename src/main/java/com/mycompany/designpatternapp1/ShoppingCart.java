/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpatternapp1;

public class ShoppingCart {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public String checkout(double amount) {
        if (strategy == null) {
            return "No payment method selected.";
        }

        String paymentMessage = strategy.pay(amount);
        String logMessage = Logger.getInstance().log("Payment completed successfully.");

        return paymentMessage + "\n" + logMessage;
    }
    
}
