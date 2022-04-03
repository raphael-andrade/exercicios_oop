package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Código da peça 1");
    int codigo_peca_1 = sc.nextInt();
    System.out.println("Quantidade");
    int numero_peca_1 = sc.nextInt();
    System.out.println("Valor unitário");
    double valor_unitario_peca_1 = sc.nextDouble();

        System.out.println("Código da peça 2");
        int codigo_peca_2 = sc.nextInt();
        System.out.println("Quantidade");
        int numero_peca_2 = sc.nextInt();
        System.out.println("Valor unitário");
        double valor_unitario_peca_2 = sc.nextDouble();

        double valor_total = (numero_peca_1 * valor_unitario_peca_1) + (numero_peca_2 * valor_unitario_peca_2);

        System.out.printf("VALOR TOTAL = R$ %.2f%n ",valor_total);

    sc.close();
    }
}
