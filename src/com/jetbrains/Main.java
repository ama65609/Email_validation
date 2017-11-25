package com.jetbrains;

public class Main {

    public static void main(String[] args) {
        final String email = "abcdefg@sgh.pl";

        //1) sprawdzamy, czy w adresie e-mail znajduje się "@"
        String znak = "@";

        //jeżeli w adresie nie ma @ to pojawi się wartość -1 (=adres jest nieprawidłowy)
        int wynik;
        wynik = email.indexOf(znak);

        //wprowadzam int ponieważ otrzymamy wartość liczbową
        int a;
        a = -1;
        if (wynik==a) {
            System.out.println("Nieprawidłowy adres e-mail");

        } else {
            System.out.println("Prawidłowy adres e-mail");
        }

        //2) sprawdzam, czy adres e-mail kończy się .pl

        String kropka =".pl";
        boolean koniec = email.endsWith(kropka);
        //jeżeli e-mail nie kończy się ".pl" to system zwróci nam wartość "FAŁSZ" - adres e-mail jest błędny

        if (koniec==false){
            System.out.println("Nieprawidłowy adres e-mail");
        } else {
            System.out.println("Prawidłowy adres e-mail");
        }

        //3) Sprawdzam, czy w adresie e-mail jest spacja

        String spacja= " ";
        // sprawdzam, na którym miejscu jest spacja
        int test;
        test = email.indexOf(spacja);
        // jeżeli nie ma spacji to program zwraca nam wartość -1 (==adres jest prawidłowy)
        int b;
        b = -1;

        if (test==b){
            System.out.println("Prawidłowy adres e-mail");
        } else {
            System.out.println("Nieprawidłowy adres e-mail");
        }

        //4) Sprawdzam, czy adres e-mail ma co najmniej 6 liter (wtedy jest prawidłowy)

        int dlugosc;
        dlugosc = email.length();

        if (dlugosc<6){
            System.out.println("Nieprawidłowy adres e-mail");
        } else {
            System.out.println("Prawidłowy adres e-mail");

        }
    }
}
