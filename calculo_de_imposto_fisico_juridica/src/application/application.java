package application;

import entities.Contribuinte;
import entities.pessoaFisica;
import entities.pessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Contribuinte> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int numberOfTaxPayers = sc.nextInt();

        for (int i=1; i<=numberOfTaxPayers;i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char answer = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual Income: ");
            double anualIncome = sc.nextDouble();
            if (answer == 'i'){
                System.out.print("Health expenditures: ");
                double health = sc.nextDouble();
                list.add(new pessoaFisica(name,anualIncome,health));
            }
            else {
                System.out.print("Number of employees: ");
                int employee = sc.nextInt();
                list.add(new pessoaJuridica(name,anualIncome,employee));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");
        double soma = 0;
        for (Contribuinte tax : list) {
            System.out.println(tax.getName() + ": $ " + String.format("%.2f",tax.totalTax()));
            soma += tax.totalTax();
        }
        System.out.println();
        System.out.print("TOTAL TAXES: $" + String.format("%.2f",soma));

        sc.close();
        }
    }

