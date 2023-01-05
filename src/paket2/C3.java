package paket2;

public class C3 {
    public static void main(String[] args) {
        /*Parametre olarak birden fazla tamsayı (integer) kabul eden ve bu integer sayıların toplamını yazdıran bir
        dönüş methodu (void) yazın*/
        toplam(3,5,6,1,2,3);

    }
    public static void toplam(int...a){
        int toplam=0;
        for (int each:a
             ) {
            toplam+=each;

        }
        System.out.println(toplam);
    }
}
