package application;

import entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Student> setStudent = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        for (int i=0; i< n; i++){
            String course = "A";
            int codeStudent = sc.nextInt();
            setStudent.add(new Student(course,codeStudent));
        }
        System.out.print("How many students for course B? ");
         n = sc.nextInt();
        for (int i=0; i< n; i++){
            String course = "B";
            int codeStudent = sc.nextInt();
            setStudent.add(new Student(course,codeStudent));
        }
        System.out.print("How many students for course C? ");
         n = sc.nextInt();
        for (int i=0; i< n; i++){
            String course = "C";
            int codeStudent = sc.nextInt();
            setStudent.add(new Student(course,codeStudent));
        }

        System.out.print("Total Students: " + setStudent.size());

        sc.close();
    }
}
