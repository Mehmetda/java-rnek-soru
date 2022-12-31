package paket2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C1 {
    public static void main(String[] args) {
       /* Parametre olarak 2 Int Array kabul eden ve 2 Array listesini yeni bir Arraye ekleyen ve yazdıran bir method yazın.
                * Input1={1,2,3,4}
                * Input2={5,6}
                * Çıktı={1,2,3,4,5,6}*/

        int[]input1={1,2,3,4};

        int[]input={5,6};

        List<Integer> array=new ArrayList<>();


        for (int i = 0; i <input1.length ; i++) {
            array.add(input1[i]);

        }
        for (int i = 0; i <input.length ; i++) {
            array.add(input[i]);

        }
        System.out.println(array);

    }
}
