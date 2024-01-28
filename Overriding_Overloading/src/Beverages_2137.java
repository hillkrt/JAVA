
import java.util.ArrayList;

public class Beverages_2137 extends Urun_2137 {

    String kategoriAdi;
    String detay;

    public Beverages_2137() {
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
     * Beverages -> UrunFiyatGuncelle(int oran) : ürünün stokMiktarı < 20 ise oran/2
     * ile işlem yap. 20<stokMiktarı<50 ise oran ile
     * stokMiktarı >50 ise oran^2 ile işlem yaparak override ediniz
     */
    @Override
    public void UrunFiyatGuncelle(Double oran, ArrayList<Beverages_2137> urun1, ArrayList<Condiments_2137> urun2,
            ArrayList<Confections_2137> urun3,
            ArrayList<DairyProducts_2137> urun4, ArrayList<Cereals_2137> urun5) {
        for (Beverages_2137 urun : urun1) {
            if (urun.getStokMiktari() < 20) {
                urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * ((oran / 2) / 100)));
            } else if (20 < urun.getStokMiktari() && urun.getStokMiktari() < 50) {
                urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * (oran / 100)));
            } else if (urun.getStokMiktari() > 50) {
                urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * ((Math.pow(oran, 2) / 100))));
            }
        }

    }

}
