package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static Locale locale;

    public static void main(String[] args) {
     locale.setDefault(Locale.US);
     Scanner scanner = new Scanner(System.in);

    int numero_funcionario = scanner.nextInt();
    double horas_trabalhadas = scanner.nextDouble();
    double valor_por_hora = scanner.nextDouble();
    double salary = horas_trabalhadas * valor_por_hora;

    System.out.println("Numero do funcionario:");
    System.out.println(numero_funcionario);
    System.out.println("SALARIO = " + salary);

    scanner.close();
    }
}
