package com.gradle.probnyp;

public class Napoj {
    private String name;
    private double price;
    private int capacity;

    public Napoj(String name, double price, int capacity) {
        this.name = name;
        this.price = price;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String wyswietlNazwe(){
        String a = name + " ";
        return a;
    }

    public double wyswietlCene(){
        double b = price;
        return b;
    }

    public int wyswietlPojemnosc(){
        int c = capacity;
        return c;
    }

    @Override
    public String toString() {
        return "Napoj{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", capacity=" + capacity +
                '}';
    }
}
