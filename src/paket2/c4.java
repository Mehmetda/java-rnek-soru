package paket2;

import java.util.ArrayList;
import java.util.List;

public class c4 {
    public static void main(String[] args) {
        /*Soru 41-)
    Parametre olarak 2 Int Array kabul eden ve 2 Array listesini yeni bir Arraye ekleyen ve yazdıran bir method yazın.
		 * Input1={1,2,3,4}
		 * Input2={5,6}
		 * Çıktı={1,2,3,4,5,6}*/

            int []arr1={1,2,3,4,5};
            int []arr2= {6, 7, 8, 9, 10};
            arrayeYeniArrayListesiEkleme(arr1,arr2);

        }
        public static  void arrayeYeniArrayListesiEkleme(int[]arr1,int[]arr2){

            List<Integer> yeniList1=new ArrayList<>();


            for (int i = 0; i <arr1.length ; i++) {
                yeniList1.add(arr1[i]);

            }
            for (int i = 0; i <arr2.length ; i++) {
                yeniList1.add(arr2[i]);

            }

            System.out.println(yeniList1);




    }

}
