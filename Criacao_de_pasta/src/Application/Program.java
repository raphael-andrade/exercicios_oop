package Application;

import Entities.Product;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> productList = new ArrayList<>();

        System.out.println("Enter file path: ");
        String sourcePathString = sc.nextLine();

        File sourceFile = new File(sourcePathString);
        String sourceFolderPath = sourceFile.getParent();

        boolean success = new File(sourceFolderPath + "\\out").mkdir();

        String targetPathFile = sourceFolderPath + "\\out\\sumary.csv";

        try (BufferedReader buffRead = new BufferedReader(new FileReader(sourcePathString))){
            String itemCSV = buffRead.readLine();
            while (itemCSV != null){
                String[] fields = itemCSV.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                productList.add(new Product(name,price,quantity));

                itemCSV = buffRead.readLine();
            }
            Writer out;
            try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter(targetPathFile))){
            for (Product item : productList){
                buffWrite.write(item.getName() + "," + String.format("%.2f",item.total()));
                buffWrite.newLine();
            }
            System.out.println(targetPathFile + " CREATED!");
            }
            catch (IOException e){
                System.out.println("Error writing file: " + e.getMessage());
            }

        }
        catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
        sc.close();
    }
}
