import java.util.ArrayList;

public class Confections_2137 extends Urun_2137 {

    String kategoriAdi;
    String detay;

    public Confections_2137() {
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
     * Confections -> UrunStokGuncelle(int stokMiktarı, bool GirisMi) metodunda adet
     * bilgisi > 10 ise ve çıkış işlemi ise işlemi gerçekleştiriniz
     * veya adet <20 ve girisMi ise işlemi gerçekleştiriniz. Diğer durumlarda işlem
     * yapmayınız
     */
    @Override
    public void UrunStokGuncelle(int stokMiktari, boolean GirisMi, ArrayList<Beverages_2137> urun1,
            ArrayList<Condiments_2137> urun2,
            ArrayList<Confections_2137> urun3,
            ArrayList<DairyProducts_2137> urun4, ArrayList<Cereals_2137> urun5) {

        for (Confections_2137 urun : urun3) {
            if (urun.getStokMiktari() > 10 && GirisMi == false) {
                urun.setStokMiktari(urun.getStokMiktari() - stokMiktari);
            } else if (urun.getStokMiktari() < 20 && GirisMi == true) {
                urun.setStokMiktari(urun.getStokMiktari() + stokMiktari);

            }
        }
    }

}
