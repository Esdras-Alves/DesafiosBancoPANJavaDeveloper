package BÁSICO;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int custoFabrica = scan.nextInt();
        int porcentagemDistribuidor = scan.nextInt();
        int PercentualImpostos = scan.nextInt();

        int custoConsumidor;

        int distribuidor;
        int valorImpostos;

        // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:

        distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        valorImpostos = (custoFabrica * PercentualImpostos) / 100;
        custoConsumidor = (custoFabrica + (distribuidor + valorImpostos));


        System.out.println(custoConsumidor);
    }
}