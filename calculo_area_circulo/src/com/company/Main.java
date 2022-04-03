package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

    double R = sc.nextDouble();
    double pi = 3.14159;
    double area;

    area = pi * Math.pow(R,2);

    System.out.println("AREA = " + area);
    sc.close();

    }
}
