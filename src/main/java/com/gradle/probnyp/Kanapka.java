package com.gradle.probnyp;

public class Kanapka {
    private String name;
    private double price;

    public Kanapka(String name, double price) {
        this.name = name;
        this.price = price;
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

    public String wyswietlNazwe() {
        String a = name + " ";
        return a;
        //System.out.println("Price: " + price);
    }

    public double wyswietlCene(){
        double b = price;
        return b;
    }

    @Override
    public String toString() {
        return "Kanapka{" +
                "Nazwa kanapki'" + name + '\'' +
                ", price=" + price +
                '}';
    }


}
