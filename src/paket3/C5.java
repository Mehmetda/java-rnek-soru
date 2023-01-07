package paket3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        boolean devam=true;
        List<Integer>toplanacak=new ArrayList<>();
        while (devam){

            System.out.println("toplamak için sayı giriniz çıkmak isterseniz X e basınız:");
            try {
                int sayımız=scan.nextInt();
                toplanacak.add(sayımız);
            } catch (Exception e) {
                System.out.println("sayılar alındı bizi tercih ettiğiniz için teşekkür ederiz");
                devam=false;
            }

        }
        System.out.println(toplanacak);
        System.out.println(varargs(2, 3, 4, 4, 3, 2, 2, 1, 3, 5, 6, 7, 8, 9, 8, 6));


    }

    private static int varargs(int...sayı) {
        int toplam=0;
        for (int each:sayı
             ) {
            toplam+=each;

        }
        return toplam;
    }
}
