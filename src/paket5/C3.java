package paket5;

import java.util.HashMap;
import java.util.Map;

public class C3 {
    public static void main(String[] args) {

        // verilen bir String array'de her bir sayinin kacar defa kullanildigini yazdirin
        // Ornek : String[] arr = {"A","C","B","N","A","N","A"}
        // Output : A=3, B=1, C=1, N=2
        String[] arr = {"A","C","B","B","A","N","A"};

        Map<String,Integer> tekrar=new HashMap<>();

        for (int i = 0; i < arr.length ; i++) {
            if(!tekrar.containsKey(arr[i])){
                tekrar.put(arr[i],1);

            }
            else {
                Integer eskvalue=tekrar.get(arr[i]);

                tekrar.put(arr[i],eskvalue+1);


            }


        }
        System.out.println(tekrar);

    }
}
