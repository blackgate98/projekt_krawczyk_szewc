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
        Napoj n1 = new Napoj("Herbata", 3.0,200);
        Napoj n2 = new Napoj("Kawa",5.0,300);
        Napoj n3 = new Napoj("Cola",7.0,500);

        System.out.println("--------------Menu----------");
        System.out.println(k1.wyswietlNazwe() + " | " + k1.wyswietlCene() + "PLN");
        System.out.println(k2.wyswietlNazwe() + " | " + k2.wyswietlCene() + "PLN");
        System.out.println(k3.wyswietlNazwe() + " | " + k3.wyswietlCene() + "PLN");
        System.out.println(n1.wyswietlNazwe() + " | " + n1.wyswietlCene() + "PLN" + " | " + n1.wyswietlPojemnosc() + "ml");
        System.out.println(n2.wyswietlNazwe() + " | " + n2.wyswietlCene() + "PLN" + " | " + n2.wyswietlPojemnosc() + "ml");
        System.out.println(n3.wyswietlNazwe() + " | " + n3.wyswietlCene() + "PLN" + " | " + n3.wyswietlPojemnosc() + "ml");
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

        if(b == 1){
            System.out.println("Wybrany napoj: " + n1.wyswietlNazwe() + " " + n1.wyswietlCene() + "ZL" + " | " + n1.wyswietlPojemnosc()+"ml");
            kwota2 = n1.getPrice();
        }
        else if(b == 2){
            System.out.println("Wybrany napoj: " + n2.wyswietlNazwe() + " " + n2.wyswietlCene() + "ZL" + " | " + n2.wyswietlPojemnosc()+"ml");
            kwota2 = n2.getPrice();
        }
        else
        {
            System.out.println("Wybrany napoj: " + n3.wyswietlNazwe() + " " + n3.wyswietlCene() + "ZL" + " | " + n3.wyswietlPojemnosc()+"ml");
            kwota2 = n3.getPrice();
        }



        double wynik = kwota1 + kwota2;

        System.out.println("Do zaplaty: " + wynik);

        System.out.println("Podaj kwote ktora dajesz sprzedawcy i sprawdz ile reszty powinienes otrzymac: ");
        zaplata = sc.nextDouble();

        double reszta = zaplata - wynik;

        System.out.println("Dales sprzedawcy: " + zaplata + " " + "Powinienes otrzymac: " + reszta + "zl reszty");



    }

}
