import java.util.ArrayList;

public class Condiments_2137 extends Urun_2137 {

    String kategoriAdi;
    String detay;

    public Condiments_2137() {
        super();
        this.kategoriAdi = kategoriAdi;
        this.detay = detay;
    }

    public String getKategoriAdi() {
        return kategoriAdi;
    }

    public void setKategoriAdi(String kategoriAdi) {
        this.kategoriAdi = kategoriAdi;
    }

    public String getDetay() {
        return detay;
    }

    public void setDetay(String detay) {
        this.detay = detay;
    }

    /*
     * Condiments -> CesniBirimAgirlikGuncelle metodu ile listede yer alan en çok
     * stoğa sahip çeşni nesnesine ait ağırlığı
     * güncelleyiniz. CesniBirimAgirlikGuncelle(String yeniAgirlik)
     * CesniBirimAgirlikGuncelle(String yeniAgirlik, int stokMiktarı) : girilen
     * stokMiktarına en yakın olan nesneyi güncelleyiniz.
     */

    public void CesniBirimAgirlikGuncelle(String yeniAgirlik, ArrayList<Condiments_2137> urun2) {
        Condiments_2137 enCokStokluUrun = urun2.get(0);

        for (Condiments_2137 urun : urun2) {
            if (urun.getStokMiktari() > enCokStokluUrun.getStokMiktari()) {
                enCokStokluUrun = urun;
            }
        }

        enCokStokluUrun.setBirimAgirligi(yeniAgirlik);

    }

    public void CesniBirimAgirlikGuncelle(String yeniAgirlik, int stokMiktarı, ArrayList<Condiments_2137> urun2) {
        Condiments_2137 enYakinStokluUrun = urun2.get(0);
        int enYakinFark = Math.abs(enYakinStokluUrun.getStokMiktari() - stokMiktari);

        for (Condiments_2137 urun : urun2) {
            int fark = Math.abs(urun.getStokMiktari() - stokMiktari);
            if (fark < enYakinFark) {
                enYakinFark = fark;
                enYakinStokluUrun = urun;
            }
        }

        enYakinStokluUrun.setBirimAgirligi(yeniAgirlik);

    }

}
