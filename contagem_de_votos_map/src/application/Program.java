package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path ");
        String path = sc.nextLine();

        File file;
        try ( BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){

            Map<String,Integer> count = new HashMap<>();
            String line = bufferedReader.readLine();
            while ( line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                int vote = Integer.parseInt(fields[1]);

                if(count.containsKey(name)){
                    int votesSoFar = count.get(name);
                    count.put(name,vote + votesSoFar);
                }
                else{
                    count.put(name,vote);
                }
                line = bufferedReader.readLine();
            }
            for ( String key : count.keySet()){
                System.out.println(key + ": " + count.get(key));
            }

        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    sc.close();
    }
}
