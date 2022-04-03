package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int soma;
        int A;
        int B;

        A = sc.nextInt();
        B = sc.nextInt();
        soma = A + B;
        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
