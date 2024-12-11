package com.josipsoric.zadatak_3;

import java.util.List;

public class Purchase {
    private User user;
    private List<Item> items;
    private String paymentMethod;

    public Purchase(User user, List<Item> items, String paymentMethod) {
        this.user = user;
        this.items = items;
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(user.toString()).append("\n");
        sb.append("Payment Method: ").append(paymentMethod).append("\n");
        sb.append("Items Purchased: \n");

        for (Item item : items) {
            sb.append(" - ").append(item.toString()).append("\n");
        }

        return sb.toString();
    }
}
