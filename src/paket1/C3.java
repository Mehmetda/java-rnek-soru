package paket1;

import java.util.Scanner;

public class C3 {
    public static void main(String[] args) {
        // Kullanicidan 4 basamakli pozitif bir tamsayi alin
        // sayinin rakamlar toplamini bulun
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 basamaklı bır sayı gırınız");
        String sayı= scan.next();
        rakamlarTopla(sayı);
    }

    private static void rakamlarTopla(String sayı) {
       int a=Integer.parseInt(sayı.substring(0,1));
       int b=Integer.parseInt(sayı.substring(1,2));
       int c=Integer.parseInt(sayı.substring(2,3));
       int d=Integer.parseInt(sayı.substring(3,4));
        System.out.println((a + b + c + d));
    }
}
