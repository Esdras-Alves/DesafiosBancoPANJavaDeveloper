package BÁSICO;

import java.io.IOException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double media;
        double x;
        double soma = 0;

        //TODO: Implemente as condições adequadas para obter a quantidade
        //de valores positivos e a média dos valores positivos:
        for (int i = 0; i < 6; i++) {
            x = leitor.nextDouble();
            if (x > 0) {
                soma += x;
                cont++;
            }
        }

        media = soma / cont;
        System.out.println(cont + " valores positivos");
        System.out.printf("%.1f%n", media);
    }

}
