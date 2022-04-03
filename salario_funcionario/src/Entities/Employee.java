package Entities;

public class Employee {
    public String employee;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }
    public void increaseSalary(double percentage){
      grossSalary += grossSalary * percentage / 100.0;
    }
    public String toString(){
        return employee + ", $ " + String.format("%.2f", netSalary());
    }
}
