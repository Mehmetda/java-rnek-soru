package paket5;

import java.util.ArrayList;
import java.util.List;

public class C5 {
    static int x;
    static  int y;
    public static void main(String[] args) {

        /*
         * Write a method which accepts an integer as parameter
         * and returns “true” if it is a Fibonacci number
         *
         * Then check the result and print
         * “Fibonacci series contain your number” or
         * “Fibonacci series contain that numbers : X and Y”
         * (X and Y should be the closest Fibonacci numbers to given number X<num<Y)
         */
        //0 1 1 2 3 5 8 13 21
        int input=21;

        System.out.println(fibonaccikontrol(input));



    }

    private static boolean fibonaccikontrol(int sayı) {

        if(sayı<0){
          return false;
        }
        else if(sayı==0||sayı==1){
            return true;

        }
        List<Integer> fibo=new ArrayList<>();
        fibo.add(0);
        fibo.add(1);

        for (int i = 2; i <=sayı ; i++) {
            fibo.add(fibo.get(i-2)+fibo.get(i-1));
            if(fibo.get(i)>=sayı){
                break;
            }

        }
        System.out.println(fibo);
        if(sayı==fibo.get(fibo.size()-1)){
            return true;
        }
        x=fibo.get(fibo.size()-1);

        y=fibo.get(fibo.size()-2);



        return  false;
    }

}
