package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    int number = sc.nextInt();

    if (number < 0) {
        System.out.println("NEGATIVO");
    }
    else {
        System.out.println("POSITIVO");
    }

    sc.close();
    }
}
