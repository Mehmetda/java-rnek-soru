package paket4;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class doğalsıralıliste {
    public static void main(String[] args) {
        // 101=Ali-Can-11-H-MF
        // 11 H Ali Can 101

        // tum ogrenci listesini
        // sinif sube isim soyisim no seklinde
        // dogal sirali olarak
        // Yazdiran bir method olusturun
        Set<Map.Entry<Integer, String>> entrim = C3.Öğrencimap().entrySet();
        doğalsıralı(entrim);





    }

    private static void doğalsıralı(Set<Map.Entry<Integer, String>> entrim) {
        Set<String>doğal=new TreeSet<>();

        for (Map.Entry<Integer, String> each:entrim
             ) {
            String value=each.getValue();
            String[]arr=value.split("-");
            String yenivalue=arr[2]+" "+arr[3]+" "+arr[0]+" "+arr[1]+" "+each.getKey();
            doğal.add(yenivalue);

        }
        for (String each:doğal
             ) {
            System.out.println(each);

        }
    }
}
