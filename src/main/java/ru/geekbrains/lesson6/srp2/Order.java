package ru.geekbrains.lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order {

    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public Order() {
    }

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public Order(ConsoleInput consoleInput) {
        this.clientName = consoleInput.getClientName();
        this.product = consoleInput.getProduct();
        this.qnt = consoleInput.getQnt();
        this.price = consoleInput.getPrice();
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }
}
