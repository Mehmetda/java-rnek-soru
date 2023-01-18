package paket6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class primenumbers {
    public static void main(String[] args) {
        /*
         * Write a program that accepts an integer as input and prints first 10 prime
         * numbers greater than input
         *
         * Check numbers if they are even or not in a return method
         */
        List<Integer>asalsayılarım=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bır sayı gırınız:");
        int sayı= scan.nextInt();
        int count=0;
        while(count<10){
           sayı++;
           if(asalmı(sayı)){
               count++;
               asalsayılarım.add(sayı);

            }

        }
        System.out.println(asalsayılarım);


    }

    private static boolean asalmı(int sayı) {
        boolean kontrol=true;
        for (int i = 2; i <sayı ; i++) {
            if(sayı%i==0){
                kontrol=false;
                return false;

            }

        }

        return true;
    }
}
