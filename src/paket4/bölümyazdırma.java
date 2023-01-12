package paket4;

import java.util.Map;
import java.util.Set;

public class bölümyazdırma {
    public static void main(String[] args) {

        Set<Map.Entry<Integer,String>> setimiz=C3.Öğrencimap().entrySet();
        bilgiyazdır(setimiz,"KT");
    }

    private static void bilgiyazdır(Set<Map.Entry<Integer, String>> setimiz, String mf) {
        for (Map.Entry<Integer,String> each:setimiz
             ) {
            String bilgiler= each.getValue();
            String[]array=bilgiler.split("-");
            if(array[3].equalsIgnoreCase(mf)){
                System.out.println(each.getKey()+" "+array[0]+" "+array[1]+" "+array[2]);
            }

        }
    }
}
