package paket1;

import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
        //kontrol edin ve sifredeki hatalari yazdirin.
        //Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
        //sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
        //- Sifre kucuk harf icermelidir
        //- Sifre buyuk harf icermelidir
        //- Sifre ozel karakter icermelidir
        //- Sifre en az 8 karakter olmalidir
        int d=0;
        boolean devam = true;
        Scanner scan = new Scanner(System.in);
        while (devam) {
            System.out.println("lutfen bır sıfre gırınız");
            String şifre = scan.nextLine();
            int flag = 0;
            for (int i = 0; i < şifre.length(); i++) {
                if (şifre.charAt(i) >= 'a' && şifre.charAt(i) <= 'z') {
                    break;
                }
                else flag++;
            }

            if (flag == şifre.length()) {
                System.out.println("sıfre kucuk harf ıcermelıdır");
                d++;
            }

           int a = 0;

            for (int i = 0; i < şifre.length(); i++) {
                if (şifre.charAt(i) >= 'A' && şifre.charAt(i) <= 'Z') {

                    break;
                }
                else a++;

            }
            if (a == şifre.length()){
                System.out.println("sıfre buyuk harf ıcermelıdır");
                d++;
            }

             int b = 0;

            for (int i = 0; i < şifre.length(); i++) {
                if (şifre.charAt(i) >= '!' && şifre.charAt(i) <= '/') {

                    break;
                }
                else
                    b++;

            }
            if (b == şifre.length()) {
                System.out.println("şifre ozel karakter ıcermelıdır");
                d++;
            }


            if (şifre.length() < 8){
                System.out.println("sıfre en az 8 karakter olmalıdır");
                d++;
            }

           if( d==0){
                System.out.println("başarılı bir şifre girdiniz");
                devam=false;
            }

        }
    }
}
