package paket3;

public class C2 {
    String isim;
    String soyisim;
    int yas;
    char cinsiyet;
    String okul;
    public static void main(String[] args) {
        // Soru 45-)
        // StudentMaın adında bir class olusturun, ögrenci bilgilerini alın. (ad soyad yas cınsiyet okul)
        // Ardından Student adlı bir class olusturun ve
        // içine parametreli constructor koyun, bu parametreler Maın classdaki bılgılerı ıstesın.
        // Bu parametreli constructor icinde kullanıcıya ögrenci bilgilerini doldurtun.
        // Ardından consolda giriilen bilgileri yazdırın
        // Ipucu:
        // Bu soruda iki classa ihtiyacımız olacak.
        // Birinci main classda, ögrenci bilgilerini tanımlayacagımız variablerı olusturacagız.
        // String isim, int yas, char cinsiyet gibi...
        // Ardından baska bir class olusturacagız ve bu classa parametrelı bir constructor koyacagız,
        // bu parametrelı constructor az önce olusturdugumuzo
        // classdaki parametreleri kabul edecek sekılde olmalı.
        // Ardından Main classda, parametreli constructoru olan classtan bir obje olusturacagız ve
        // tabi ki constructor parametrelı oldugu ıcın bızden parametre   azmamızı ısteyecek,
        // bızde yukarıda olusturdugumuz variable adlarını ekleyecegız.


    }

    @Override
    public String toString() {
        return "C2{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", yas=" + yas +
                ", cinsiyet=" + cinsiyet +
                ", okul='" + okul + '\'' +
                '}';
    }

    C2(String ism, String soyısm, int ys, char cnsyt, String okl){
        this.isim=ism;
        this.soyisim=soyısm;
        this.yas=ys;
        this.cinsiyet=cnsyt;
        this.okul=okl;
    }
}
