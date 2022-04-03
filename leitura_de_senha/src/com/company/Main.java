package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("PLEASE INSERT THE PASSWORD");
        int senha = sc.nextInt();

        while (senha != 2002){
            System.out.println("SENHA INCORRETA");
            System.out.println("PLEASE INSERT THE PASSWORD");
            senha = sc.nextInt();
        }
        System.out.println("ACESSO PERMITIDO");


        sc.close();
    }
}
