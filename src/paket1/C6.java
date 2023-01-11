package paket1;

public class C6 {
    private String isim;
    private String soyisim;
    private int tc;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getTc() {
        return tc;
    }

    public void setTc(int tc) {
        this.tc = tc;
    }

    @Override
    public String toString() {
        return "C6{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", tc=" + tc +
                '}';
    }

    /*ÖĞRENCİ YÖNETİM PLATFORMU KODLAYINIZ.

        1. BU PROGRAMDA ÖĞRENCİ KAYITLARI İLE İLGİLİ İŞLEMLER YAPILABİLMEKTEDİR. KAYITLARDA ŞU BİLGİLER OLMALIDIR:
        -AD SOYAD
                -KİMLİK NO
                -YAŞ
                -NUMARA
                -SINIF  BİLGİLERİNİ İÇERMELİDİR.

        2. ============= İŞLEMLER =============
        1-EKLEME
        2-ARAMA
        3-LİSTELEME
        4-SİLME
        Q-ÇIKIŞ

        SEÇİMİNİZ:

        ŞEKLİNDE BİR MENÜ OLUŞTURULMALI.

        3. ARAMA VE SİLME İŞLEMLERİ KİMLİK NO YA GÖRE YAPILMALIDIR.

            NOT: PROJEYİ YAPARKEN MÜMKÜN OLAN EN KISA KODLARI YAZMAK
         İÇİN NESNE YÖNELİMLİ PROGRAMLAMANIN BİZE SAĞLADIĞI İMKANLARI KULLANMAYA DİKKAT EDİNİZ.*/

    public C6() {
    }

    public C6(String isim, String soyisim, int tc) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.tc = tc;
    }
}
