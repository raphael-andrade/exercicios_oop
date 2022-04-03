package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        while ( x != 0 && y != 0) {
            if (x > 0 &&  y > 0) {
                System.out.println("PRIMEIRO");
            }
            else if ( x < 0 && y > 0) {
                System.out.println("SEGUNDO");
            }
            else if ( x < 0 && y < 0){
                System.out.println("TERCEIRO");
            }
            else {
                System.out.println("QUARTO");
            }
             x = sc.nextDouble();
             y = sc.nextDouble();
        }







        sc.close();
    }
}
