package com.company;

import java.util.Scanner;  // Importerar klassen Scanner

import org.junit.jupiter.api.test;

import static org.junit.assert.assertEquals;

public class Junittest {}

public class Inlamning1 {

    public static void main(String[] args) {

        Scanner tangentbord = new Scanner(System.in);  // Skapar ett Scanner objekt som jag kallar för tangentbord
        System.out.println("Skriv in text och när du är klar skriv stop");
        String textstycke = tangentbord.nextLine();  // Läser in text från tangentbordet och sparar den i variabeln textstycke
        System.out.println(textstycke);  // Skriver ut den texten som du skriver in

        while (!textstycke.equals("stop")) { // Fortsätter att loopa tills textstycket är ekvivalent med stop
            textstycke = tangentbord.nextLine(); // Läser in ny text från tangentbordet
            System.out.println(textstycke); // Skriver ut ny text från tangentbortdet

        }
        System.out.println("Programmet avslutas"); // Programmet har hoppat ur while loopen och avslutas
    }
}

