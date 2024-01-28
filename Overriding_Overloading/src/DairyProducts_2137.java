import java.util.ArrayList;

public class DairyProducts_2137 extends Urun_2137 {

    String kategoriAdi;
    String detay;

    public DairyProducts_2137() {
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
     * DairyProducts -> SutUrunuSil en az stoğa sahip ürünü siliniz. SutUrunuSil(int
     * minStok, int MaxStok, double fiyat) girilen iki
     * sayı aralığındaki fiyat >ürünün birim fiyatı kriterini sağlayan ürünleri
     * siliniz.
     * SutUrunuSil(double fiyat): fiyat < ürünün birimFiyatı şartını sağlayan
     * ürünleri siliniz.
     */
    public void SutUrunuSil(ArrayList<DairyProducts_2137> urun4) {
        DairyProducts_2137 enAzStokluUrun = urun4.get(0);

        for (DairyProducts_2137 urun : urun4) {
            if (urun.getStokMiktari() < enAzStokluUrun.getStokMiktari()) {
                enAzStokluUrun = urun;
            }
        }

        urun4.remove(enAzStokluUrun);

        System.out.println("En az stoklu ürün silindi:");

    }

    public void SutUrunuSil(int minStok, int maxStok, double fiyat, ArrayList<DairyProducts_2137> urun4) {
        urun4.removeIf(urun -> urun.getStokMiktari() >= minStok && urun.getStokMiktari() <= maxStok &&
                urun.getBirimFiyati() < fiyat);

        System.out.println("Belirli fiyat aralığındaki ürünler silindi:");

    }

    public void SutUrunuSil(double fiyat, ArrayList<DairyProducts_2137> urun4) {
        urun4.removeIf(urun -> urun.getBirimFiyati() < fiyat);

    }

}
