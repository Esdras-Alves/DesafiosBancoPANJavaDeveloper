package INTERMEDIÁRIO;

import java.io.IOException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String AN1, AN2, AN3;

        AN1 = sc.nextLine();
        AN2 = sc.nextLine();
        AN3 = sc.nextLine();

        //TODO: Implemente as condição necessária para que seja verificado que tipo de animal é:
        //Dica: Você pode utilizar o método equals para realizar comparações.

        if (AN1.equalsIgnoreCase("vertebrado")) {
            if (AN2.equalsIgnoreCase("ave")) {
                if (AN3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("aguia");
                }
                if (AN3.equalsIgnoreCase("onivoro")) {
                    System.out.println("pomba");
                }
            }
            if (AN2.equalsIgnoreCase("mamifero")) {
                if (AN3.equalsIgnoreCase("onivoro")) {
                    System.out.println("homem");
                }
                if (AN3.equalsIgnoreCase("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        }

        if (AN1.equalsIgnoreCase("invertebrado")) {
            if (AN2.equalsIgnoreCase("inseto")) {
                if (AN3.equalsIgnoreCase("hematofago")) {
                    System.out.println("pulga");
                }
                if (AN3.equalsIgnoreCase("herbivoro")) {
                    System.out.println("lagarta");
                }
            }
            if (AN2.equalsIgnoreCase("anelideo")) {
                if (AN3.equalsIgnoreCase("hematofago")) {
                    System.out.println("sanguessuga");
                }
                if (AN3.equalsIgnoreCase("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
    }
}
