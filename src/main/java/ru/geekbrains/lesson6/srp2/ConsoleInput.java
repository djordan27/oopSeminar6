package ru.geekbrains.lesson6.srp2;

import java.util.Scanner;

public class ConsoleInput {
    private  Scanner scanner = new Scanner(System.in);
    private String clientName;
    private String product;
    private int qnt;
    private int price;
    public ConsoleInput(){
        this.clientName = prompt("Имя клиента: ");
        this.product = prompt("Продукт: ");
        this.qnt = Integer.parseInt(prompt("Кол-во: "));
        this.price = Integer.parseInt(prompt("Цена: "));
    }

    private String prompt(String message){
        System.out.println(message);
        return scanner.nextLine();
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
