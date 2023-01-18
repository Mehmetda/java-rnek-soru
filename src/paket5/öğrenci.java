package paket5;

public class öğrenci {
    private String ad;
    private String soyad;
    private String kimlik;

    @Override
    public String toString() {
        return "öğrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", kimlik='" + kimlik + '\'' +
                ", yaş='" + yaş + '\'' +
                ", sınıf='" + sınıf + '\'' +
                '}';
    }

    public öğrenci(String ad, String soyad, String kimlik, String yaş, String sınıf) {
        this.ad = ad;
        this.soyad = soyad;
        this.kimlik = kimlik;
        this.yaş = yaş;
        this.sınıf = sınıf;
    }

    public öğrenci() {
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getKimlik() {
        return kimlik;
    }

    public void setKimlik(String kimlik) {
        this.kimlik = kimlik;
    }

    public String getYaş() {
        return yaş;
    }

    public void setYaş(String yaş) {
        this.yaş = yaş;
    }

    public String getSınıf() {
        return sınıf;
    }

    public void setSınıf(String sınıf) {
        this.sınıf = sınıf;
    }

    private String yaş;
    private String sınıf;

    public static void main(String[] args) {
       /* ÖĞRENCİ YÖNETİM PLATFORMU KODLAYINIZ.
        1. BU PROGRAMDA ÖĞRENCİ KAYITLARI İLE İLGİLİ İŞLEMLER
         YAPILABİLMEKTEDİR. KAYITLARDA ŞU BİLGİLER OLMALIDIR:
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
                NOT: PROJEYİ YAPARKEN MÜMKÜN OLAN EN KISA KODLARI YAZMAK İÇİN
                 NESNE YÖNELİMLİ PROGRAMLAMANIN BİZE SAĞLADIĞI İMKANLARI KULLANMAYA DİKKAT EDİNİZ.*/


    }
}
