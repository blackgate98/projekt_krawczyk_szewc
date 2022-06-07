package com.gradle.probnyp;

import java.util.Scanner;

public class Posilek {



    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        double kwota1;//na cene kanapki
        double kwota2;//na cene napoju
        double zaplata;
        System.out.println("Witamy w naszej restauracji. Oto nasze menu: ");

        Kanapka k1 = new Kanapka("Kanapka 1",5.0);
        Kanapka k2 = new Kanapka("Kanapka 2",7.0);
        Kanapka k3 = new Kanapka("Kanapka 3",6.0);

        System.out.println("--------------Menu----------");
        System.out.println(k1.wyswietlNazwe() + " | " + k1.wyswietlCene() + "PLN");
        System.out.println(k2.wyswietlNazwe() + " | " + k2.wyswietlCene() + "PLN");
        System.out.println(k3.wyswietlNazwe() + " | " + k3.wyswietlCene() + "PLN");
        System.out.println("-------------------");
        System.out.println("Zloz zamowienie:");
        System.out.println("Wybierz kanapke: ");
        do {
            do {
                System.out.println("Podaj liczbe od 1 do 3");
                a = sc.nextInt();
            } while (a > 3);
        }while (a == 0);


        System.out.println();
        System.out.println("Wybierz napoj: ");
        do {
            do {
                System.out.println("Podaj liczbe od 1 do 3");
                b = sc.nextInt();
            } while (b > 3);
        }while (b == 0);

        System.out.println("Podsumowanie zamowienia");
        if(a == 1){
            System.out.println("Wybrana kanapka: " + k1.wyswietlNazwe() + " | " + k1.wyswietlCene() + "ZL");
            kwota1 = k1.getPrice();}

        else if(a == 2){
            System.out.println("Wybrana kanapka: " + k2.wyswietlNazwe() + " | " + k2.wyswietlCene() + "ZL");
            kwota1 = k2.getPrice();
        }
        else{
            System.out.println("Wybrana kanapka: " + k3.wyswietlNazwe() + " | " + k3.wyswietlCene() + "ZL");
            kwota1 = k3.getPrice();
        }




    }

}
