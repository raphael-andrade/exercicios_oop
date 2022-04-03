package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("PAR");
        }
         else {
             System.out.println("IMPAR");
        }

    sc.close();
    }
}
