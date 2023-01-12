package paket4;

import java.util.Map;
import java.util.Set;

public class C7 {
    public static void main(String[] args) {
        Set<Map.Entry<Integer,String>> setim=C3.Öğrencimap().entrySet();
        System.out.println(setim);

        System.out.println(büyükyap(setim));
    }

    private static Set<Map.Entry<Integer, String>> büyükyap(Set<Map.Entry<Integer, String>> setim) {
        for (Map.Entry<Integer, String> each:setim
             ) {
            String value= each.getValue();
            String[]array=value.split("-");
            array[1]=array[1].toUpperCase();
            each.setValue(array[0]+"-"+array[1]+"-"+array[2]+"-"+array[3]+"-");


        }
        return setim;


    }
}
