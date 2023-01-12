package paket4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class C3 {


    public static Map<Integer,String> Öğrencimap() {
        Map<Integer,String>öğrencimap=new HashMap<>();
        öğrencimap.put(102,"ali-osman-10-MF");
        öğrencimap.put(103,"mehmet-kitap-11-KT");
        öğrencimap.put(104,"kemal-zaman-10-MF");
        öğrencimap.put(105,"hasan-abdül-11-KT");
        öğrencimap.put(106,"tuğba-berat-12-TR");
        return öğrencimap;
    }

    public static void isimsoyisimsıralı(Map<Integer, String> öğrenci) {
        Set<Map.Entry<Integer, String>> entrim = öğrenci.entrySet();
        Set<String>setim=new TreeSet<>();

        for (Map.Entry<Integer, String> each:entrim
             ) {
            String value=each.getValue();
            String[]arr=value.split("-");

            String format=arr[0]+" "+arr[1]+" "+each.getKey()+" "+arr[2]+" "+arr[3];
            setim.add(format);

        }
        for (String each:setim
             ) {
            System.out.println(each);

        }


    }
}

