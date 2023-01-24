package proje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class adamasmaca {
    public static void main(String[] args) {
         /*
    1- Kullaniciya kelimenin uzunlugu kadar hak tani
    2- Eger kelimedeki bir harf birden fazla varsa tahmini kelimedeki tum ayni harfler icin gecerli olsun
    3- That's it bro. Let's begin
   */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz:");
        String kelime=scan.next();

        String[]Array=kelime.split("");
        List<String> kelimelerim=new ArrayList<>();
        for (int i = 0; i <Array.length ; i++) {
            kelimelerim.add(Array[i]);

        }
        boolean devam=true;
        int hak=kelimelerim.size();
        while(hak>0){
            System.out.println("toplam hakkınız "+ hak + " tanedir!!");
            System.out.println("lütfen tahmini harfi söyleyiniz veya kelimeyi bulduysanız kelimeyide söyleyebilirsiniz!!!");
            String harf=scan.next();
            if(harf.equalsIgnoreCase(kelime)){
                System.out.println("oyunu kazandınız tebrikler!!!");
                break;
            }
            if(!(kelimelerim.contains(harf))){
                System.out.println("harfiniz kelimede yoktur!!!");
            }
            else{
                for (int i = 0; i <kelimelerim.size() ; i++) {
                    if(harf.equalsIgnoreCase(kelimelerim.get(i))){
                        System.out.println("harfiniz kelimede"+(i+1)+"inci sıradadır!!!");
                    }

                }




            }
            hak--;
        }
        if(hak==0){
            System.out.println("oyunu kaybettiniz güle güle!!!");
        }

    }
}
