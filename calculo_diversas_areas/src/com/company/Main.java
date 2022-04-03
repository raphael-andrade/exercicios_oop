package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double A = sc.nextDouble();
    double B = sc.nextDouble();
    double C = sc.nextDouble();
    double pi = 3.14159;

    double area_triangulo_retangulo = A * C / 2;
    double area_circulo = pi * Math.pow(C,2);
    double area_trapezio = (A + B) * C;
    double area_quadrado = Math.pow(B,2);
    double area_retangulo = A * B;

    System.out.printf("Triangulo: %.3f%n ",area_triangulo_retangulo);
    System.out.printf("Circulo: %.3f%n ",area_circulo);
    System.out.printf("Trapezio: %.3f%n ",area_trapezio);
    System.out.printf("Quadrado: %.3f%n ", area_quadrado);
    System.out.printf("Retangulo: %.3f%n ",area_retangulo);

    sc.close();
    }
}
