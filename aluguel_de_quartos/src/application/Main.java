package application;

import entities.rent;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int numberRent = sc.nextInt();
        rent[] vector = new rent[numberRent];

        for (int i=0;i<vector.length; i++ ) {
            sc.nextLine();
            String name = sc.nextLine();
            String email = sc.nextLine();
            int room = sc.nextInt();
            vector[i] = new rent(name,email,room);
                    }
        for (int i=0; i< vector.length; i++){
            if (vector[i] != null){
                System.out.println(vector[i]);
            }
        }
    }
}
