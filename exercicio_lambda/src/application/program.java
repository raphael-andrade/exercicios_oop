package application;

import entities.employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        try (BufferedReader buffread = new BufferedReader(new FileReader(path))){

            List<employee> employeeList = new ArrayList<>();

            String line = buffread.readLine();
            while (line != null){
                String[] fields = line.split(",");
                employeeList.add(new employee(fields[0],fields[1],Double.parseDouble(fields[2])));
                line = buffread.readLine();
            }
            Comparator<String> comp = (e1,e2) -> e1.toUpperCase().compareTo(e2.toUpperCase());
            List<String> emails = employeeList.stream()
                                 .filter(e -> e.getSalary()>salary)
                                 .map(e -> e.getEmail()).sorted(comp)
                                 .collect(Collectors.toList());
            System.out.println("Email of people whose salary is more than $" + String.format("%.2f",salary));
            emails.forEach(System.out::println);
            double soma = employeeList.stream()
                          .filter(e -> e.getName().toUpperCase().charAt(0) == 'M')
                          .map(e -> e.getSalary())
                          .reduce(0.0, (x,y) -> x+y);
            System.out.println("Sum of salary of people whose name starts with 'M': $" + String.format("%.2f",soma));
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    sc.close();
    }
}
