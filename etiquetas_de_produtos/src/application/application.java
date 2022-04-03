package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UserProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class application {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat padrao = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i=1; i<= n; i++){
            System.out.println("Product #" + i + " data: ");
            System.out.print("Commom, used or imported ( c/u/i)? ");
            char anwser = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if (anwser == 'u'){
                System.out.print("Manufacture Date: ");
                Date date = padrao.parse(sc.next());
                list.add(new UserProduct(name,price,date));
            }
            else if (anwser == 'i'){
                System.out.print("Custom fee: ");
                Double taxa = sc.nextDouble();
                list.add(new ImportedProduct(name,price,taxa));
            }
            else {
                list.add(new Product(name,price));
            }

        }
        System.out.println("Price Tags: ");
        for ( Product pro : list) {
        System.out.println(pro.priceTag() );
        }

    sc.close();
    }
}

