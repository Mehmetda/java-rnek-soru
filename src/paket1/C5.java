package paket1;

public class C5 {
    public static void main(String[] args) {
        int []input={2,3,9,5,1,7,4};
        int enküçük=input[0];
        int enbüyük=input[0];
        for (int i = 0; i < input.length ; i++) {
            if(input[i]<enküçük) enküçük=input[i];

        }
        for (int i = 0; i <input.length ; i++) {
            if(input[i]>enbüyük) enbüyük=input[i];

        }
        System.out.println(enbüyük);
        System.out.println(enküçük);

    }
}
