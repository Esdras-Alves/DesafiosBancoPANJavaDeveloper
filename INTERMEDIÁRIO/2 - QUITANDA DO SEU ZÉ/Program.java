package INTERMEDIÁRIO;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();
        double vMorango = 0;
        double vMacas = 0;
        double soma = 0;

        if (morangos > 5) {
            vMorango = 2.20;
        }else {
            vMorango = 2.50;
        }
        double totalMorango = morangos * vMorango;

        if (macas > 5) {
            vMacas = 1.50;
        }else {
            vMacas = 1.80;
        }
        double totalMaca = macas * vMacas;

        soma = totalMaca + totalMorango;

        if (morangos + macas > 8 || soma > 25) {
            soma -= soma/10;
        }
        System.out.println(soma);
    }
}
