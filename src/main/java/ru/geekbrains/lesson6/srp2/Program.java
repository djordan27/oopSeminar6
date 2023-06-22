package ru.geekbrains.lesson6.srp2;

public class Program {


    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     *  Консольный ввод
     *  Загрузка в и из файла
     * @param args
     */
    public static void main(String[] args) {
        Order order = new Order(new ConsoleInput());
        SaveFile saveFile = new SaveFile();
        saveFile.saveToJson(order);
    }

}
