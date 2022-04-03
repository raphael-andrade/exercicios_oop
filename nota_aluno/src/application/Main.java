package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

        Student student = new Student();
        student.estudante = sc.nextLine();
        student.notas1 = sc.nextDouble();
        student.notas2 = sc.nextDouble();
        student.notas3 = sc.nextDouble();

        System.out.printf("Results: %.2f%n", student.finalGrade());
        System.out.printf("Missing Points: %.2f%n", student.missingPoints());
        System.out.println("Status: " + student.status());

        sc.close();
    }
}
