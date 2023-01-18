package paket5;

import paket4.C3;

import java.util.Map;
import java.util.Set;

public class C1 {
    public static void main(String[] args) {
        // verilen ismin ogrenciMap'de olup olmadigini kontrol edip
        // true veya false donen bir method olusturun
        Map<Integer,String> öğrenci=C3.Öğrencimap();
        System.out.println(varmısınyokmu(öğrenci, "hayat"));

    }

    private static boolean varmısınyokmu(Map<Integer, String> öğrenci, String ali) {
        Set<Map.Entry<Integer, String>> entrim = öğrenci.entrySet();
        for (Map.Entry<Integer, String> each:entrim
             ) {
            String bilgi= each.getValue();
            String[]array=bilgi.split("-");
            if(ali.equalsIgnoreCase(array[0])){
                return true;
            }

        }
        return false;

    }
}
