package paket4;

import java.util.Map;
import java.util.Set;

public class sınıfartırma {
    public static void main(String[] args) {
        Set<Map.Entry<Integer, String>> setim=C3.Öğrencimap().entrySet();
        System.out.println(sınıfartır(setim));


    }

    private static Set<Map.Entry<Integer, String>> sınıfartır(Set<Map.Entry<Integer, String>> setim) {

        for (Map.Entry<Integer, String> each:setim
             ) {
            String ifade=each.getValue();
            String[]array=ifade.split("-");
            int sınıf=Integer.parseInt(array[2]);

            if(sınıf==12){
                array[2]="mezun";
            }
            else{
                array[2]=sınıf+1+"";
            }
            each.setValue(array[0]+"-"+array[1]+"-"+array[2]+"-"+array[3]+"-");


        }
        return setim;
    }
}
