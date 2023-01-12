package paket3;

import paket4.C3;

import java.util.Map;
import java.util.Set;

public class entryset {
    public static void main(String[] args) {
        // tum ogrencileri 101=Ali-Can-11-H-MF  seklinde yazdirin
        C3 obje=new C3();
        Map<Integer,String> öğrenci=C3.Öğrencimap();
        Set<Integer>keydeğer =öğrenci.keySet();
        for (Integer each:keydeğer
             ) {
            System.out.println(each+"="+öğrenci.get(each));

        }
        Set<Map.Entry<Integer,String>>entrimiz=öğrenci.entrySet();
        for (Map.Entry<Integer,String> each:entrimiz
             ) {
            System.out.println(each);

        }
    }
}
