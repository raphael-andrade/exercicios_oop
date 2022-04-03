package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int quantidadeDeNumeros = sc.nextInt();
    int dentro = 0;
    int fora = 0;
    for (int i=1; i<=quantidadeDeNumeros; i++) {
        int x = sc.nextInt();
        if (x >=10 && x<=20){
            dentro = dentro + 1;
        }
        else {
            fora = fora + 1;
        }
    }
    System.out.println(dentro + " in");
    System.out.println(fora + " out");





    sc.close();
    }
}
