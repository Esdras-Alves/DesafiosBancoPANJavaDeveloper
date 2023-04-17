package INTERMEDIÁRIO;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strSplit = str.split(" ");
        char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
        int espacosEmBranco = strSplit.length - 1;
        int quantVogais = 0;

        for (char vogal : arrVogais) {
            for (char letra : str.toLowerCase().toCharArray()) {
                if (vogal == letra) {
                    quantVogais++;
                }
            }
        }
        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }
}
