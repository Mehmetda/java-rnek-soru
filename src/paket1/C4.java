package paket1;

import java.util.Scanner;

public class C4 {
    public static void main(String[] args) {
        //Bir top belirli yükseklikten atılmaktadır.
// Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
// Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
// Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan method create ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yukseklıgı cm cinsinden gırınız");
        double yükseklik=scan.nextInt();
        topZıplama(yükseklik);
    }

    private static void topZıplama(double yükseklik) {
        double yol=0;
        int vurmasayısı=0;
        while(yükseklik>=1000){
            yükseklik=(yükseklik*3)/4;
            yol+=yükseklik;
            vurmasayısı++;
        }
        System.out.println(yol);
        System.out.println(vurmasayısı);

    }
}
