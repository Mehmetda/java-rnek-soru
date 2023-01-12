package paket4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C5 {
    public static void main(String[] args) {

        // verilen bir cumlede kullanilan her bir harfi
        // ve kacar kez kullanildigini yazdirin

        // Ornek : Java candir
        // output :  J=1, a=3, v=1, c=1, n=1, d=1, i=1, r=1
        String cümle="java cok guzel";

        Map<String,Integer>tekrar=new TreeMap<>();

        cümle=cümle.replaceAll("\\W","");

        String[]array=cümle.split("");

        for (int i = 0; i < array.length ; i++) {
            if(!tekrar.containsKey(array[i])){
                tekrar.put(array[i],1);

            }
            else {
                int eskivalue=tekrar.get(array[i]);
                tekrar.put(array[i],eskivalue+1);
            }

        }
        System.out.println(tekrar);



    }
}
