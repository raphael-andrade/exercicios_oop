package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
         int codigo = sc.nextInt();

         if (codigo == 1){
             System.out.println("OPÇÃO ESCOLHIDA: CACHORRO QUENTE");
             System.out.println("QUANTIDADE");
             int quantidade = sc.nextInt();
             double valor = quantidade * 4.00;
             System.out.printf("VALOR TOTAL = %.2f%n", valor);
         }
         else if (codigo == 2){
             System.out.println("OPÇÃO ESCOLHIDA: X-SALADA");
             System.out.println("QUANTIDADE");
             int quantidade = sc.nextInt();
             double valor = quantidade * 4.50;
             System.out.printf("VALOR TOTAL = %.2f%n", valor);
         }
         else if (codigo == 3) {
             System.out.println("OPÇÃO ESCOLHIDA: X-BACON");
             System.out.println("QUANTIDADE");
             int quantidade = sc.nextInt();
             double valor = quantidade * 5.00;
             System.out.printf("VALOR TOTAL = %.2f%n", valor);
         }
         else if (codigo == 4) {
             System.out.println("OPÇÃO ESCOLHIDA: TORRADA SIMPLES");
             System.out.println("QUANTIDADE");
             int quantidade = sc.nextInt();
             double valor = quantidade * 2.00;
             System.out.printf("VALOR TOTAL = %.2f%n", valor);
         }
         else if (codigo == 5) {
             System.out.println("OPÇÃO ESCOLHIDA: CACHORRO QUENTE");
             System.out.println("QUANTIDADE");
             int quantidade = sc.nextInt();
             double valor = quantidade * 4.00;
             System.out.printf("VALOR TOTAL = %.2f%n", valor);
         }
         else {
             System.out.println("CÓDIGO INVÁLIDO");
         }

        sc.close();

    }
}
