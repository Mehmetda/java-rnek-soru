package paket6;

import java.util.*;

public class yıyecek_otomat {

    static Scanner scan=new Scanner(System.in);
    /*
Merhaba arkadaşlar, javadan proje yapmak isteyen arkadaşlar vardı...
projemizin adı YIYECEK OTOMATI

--15 adet ürün ve bu ürünlerin fiyatlarını belirleyiniz.
Bu ürünler ekranda listelensin

--Ürün seçip, para miktarı giriniz
--girdiğiniz para fazla ise üstünü versin,
eksik ise ekleme yapmanızı istesin
--Ek ürün seçme seçeneği olsun, siz devam ettiğiniz sürece,
para kontrolünü de yaparak işlem yapmaya devam etsin...
NOT: Otomat sadece 1 tl , 5 tl, 10 tl, 20 tl miktarlarını kabul etsin
oop concepte ait öğrendiklerimizi kullanmaya çalışalım...

iyi çalışmalar
Kolay gelsin...
*/
    public static void main(String[] args) {
        Map<String,Integer> otomatım=new HashMap<>();
        List<String>ürünlerim=new ArrayList<>();

        otomatım.put("kola",10);
        otomatım.put("fanta",15);
        otomatım.put("limonata",5);
        otomatım.put("şalgam",20);
        otomatım.put("çay",25);
        otomatım.put("kahve",30);
        Set<Map.Entry<String,Integer>>setim=otomatım.entrySet();


        for (Map.Entry<String,Integer> each:setim
             ) {
            System.out.println(each);

        }
        while(true){
            System.out.println("lutfen ıstediğiniz urunu yazınız çıkmak istiyorsanız da Q ya basınız:");

            String ürün=scan.next();
            if(ürün.equalsIgnoreCase("q")){
                break;
            }
            int miktar1=paramiktarı();


            for (Map.Entry<String,Integer> each:setim
            ) {
                if(ürün.equalsIgnoreCase(each.getKey())){
                    if(miktar1> each.getValue()) {
                        System.out.println(miktar1 - each.getValue() + " tl para ustunuzu alınız");
                        ürünlerim.add(ürün);
                    }

                    else if(miktar1< each.getValue()){
                        System.out.println(each.getValue()-miktar1+" tl daha vermeniz lazım");

                        miktar1+=paramiktarı();

                        if(miktar1>= each.getValue()){
                            ürünlerim.add(ürün);
                        }
                    }
                    else{
                        System.out.println("paranız tam olarak yetiyor ürünü alabilirsiniz:");
                        ürünlerim.add(ürün);
                    }
                }




            }







        }
        System.out.println(ürünlerim);

    }




    private static int  paramiktarı() {
        int miktar;
        while (true) {
            System.out.println("lutfen para mıktarını gırınız:");
            miktar = scan.nextInt();
            if (!(miktar == 1 || miktar == 5 || miktar == 10 || miktar == 20)) {
                System.out.println("otomat sadece 1 5 10 ve 20 tl kabul etmektedir!!!");
            } else {
                break;

            }

        }
        return miktar;
    }

}
