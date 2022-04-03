package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();

        if (valor <= 25 && valor > 0) {
            System.out.println("INTERVALO (0:25)");
        }
        else if (valor <= 50 && valor > 25) {
            System.out.println("INTERVALO (25:50)");
        }
        else if (valor <= 75 && valor > 50) {
            System.out.println("INTERVALO (50:75");
        }
        else if (valor <= 100 && valor > 75) {
            System.out.println("INTERVALO (75:100");
        }
        else {
            System.out.println("FORA DE INTERVALO");
        }
        sc.close();
    }
}
