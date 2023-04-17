package INTERMEDIÁRIO;

import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        double imposto;

        if (salario <= 2000.00) { // isento de imposto de renda
            System.out.println("Isento");
        } else {
            if (salario <= 3000.00) { // faixa de 8% de imposto
                imposto = (salario - 2000.00) * 0.08;
            } else if (salario <= 4500.00) { // faixa de 18% de imposto
                imposto = 1000.00 * 0.08 + (salario - 3000.00) * 0.18;
            } else { // faixa de 28% de imposto
                imposto = 1000.00 * 0.08 + 1500.00 * 0.18 + (salario - 4500.00) * 0.28;
            }
            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}
