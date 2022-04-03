package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    for ( int i = 0; i < N; i++) {
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if ( b == 0) {
            System.out.println("Divisão Impossivel");
        }
        else {
           double divisao = a / b;
           System.out.println(divisao);
        }
    }

    sc.close();
    }
}
