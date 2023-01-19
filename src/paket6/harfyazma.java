package paket6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class harfyazma {
    public static void main(String[] args) {
        /*
         * Interview question
         *
         * write a return method that can find the frequency of characters (with case
         * sensitivity)
         *
         * Input = AAABBCDD output = A3B2C1D2
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz:");
        String cümle=scan.nextLine();

        cümle=cümle.toUpperCase().replaceAll("\\s","");

        String[]array=cümle.split("");
        List<String> listem=new ArrayList<>();

        for (int i = 0; i < array.length ; i++) {
            listem.add(array[i]);

        }


        String output="";
        int count=0;
        for (int i = 0; i < listem.size() ; i++) {
            for (int j = 0; j < listem.size()-i ; j++) {
                if (listem.get(i).equalsIgnoreCase(listem.get(j+i))){
                    count++;

                }

            }

            if(!output.contains(listem.get(i))){
                output+=listem.get(i)+count;


            }
            count=0;

        }
        System.out.println(output);


    }




}
