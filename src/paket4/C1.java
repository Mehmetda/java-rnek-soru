package paket4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        List<Integer>liste1=new LinkedList<>();
        List<Integer>liste2=new LinkedList<>();
        /*Soru : Kullanicidan deger alarak iki String liste olusturun. Kullanici deger girmeyi
        birakmak icin 0’a basmalidir.
        Iki liste olustuktan sonra asagidaki sekilde bir output hazirlayin
        liste1 : …….
        liste2 : …….
        ortak elementler : …….*/
        boolean devam=true;
        while(devam){
            System.out.println("eleman gırın:");
            int eleman=scan.nextInt();
            if(eleman==0){
                devam=false;
            }
            liste1.add(eleman);

        }
        devam=true;
        while(devam){
            System.out.println("eleman gırın:");
            int eleman=scan.nextInt();
            if(eleman==0){
                devam=false;
            }
            liste2.add(eleman);

        }
        System.out.println(liste1);
        System.out.println(liste2);
        liste1.retainAll(liste2);
        System.out.println("ortak elemanlar:");
        System.out.println(liste1);
    }
}
