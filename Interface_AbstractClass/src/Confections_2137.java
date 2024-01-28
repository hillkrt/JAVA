import java.util.ArrayList;

public class Confections_2137 extends Urun_2137 {
    public int katsayi = 1;
    public String kategoriDetay;
    public String detay;

    public Confections_2137() {
        super();

        this.katsayi = katsayi;
        this.kategoriDetay = kategoriDetay;
        this.detay = detay;
    }

    public Confections_2137(String adi, int kategoriIndex, String birimAgirligi, Double birimFiyati,
            String kategoriDetay2, String detay2) {

    }

    public int getKatsayi() {
        return katsayi;
    }

    public void setKatsayi(int katsayi) {
        this.katsayi = katsayi;
    }

    public String getKategoriDetay() {
        return kategoriDetay;
    }

    public void setKategoriDetay(String kategoriDetay) {
        this.kategoriDetay = kategoriDetay;
    }

    public String getDetay() {
        return detay;
    }

    public void setDetay(String detay) {
        this.detay = detay;
    }

    @Override
    public void UrunStokGuncelle(int adet, boolean girisMi, ArrayList<Beverages_2137> urun1,
            ArrayList<Condiments_2137> urun2,
            ArrayList<Confections_2137> urun3, ArrayList<DairyProducts_2137> urun4, ArrayList<Cereals_2137> urun5) {
        for (Confections_2137 urun : urun3) {
            if (girisMi == true) {
                urun.stokMiktari -= adet;
            } else {
                urun.stokMiktari += adet;
            }
        }
    }

    @Override
    public void UrunIsimGuncelle(String yeniIsım, String yeniDetay, ArrayList<Beverages_2137> urun1,
            ArrayList<Condiments_2137> urun2,
            ArrayList<Confections_2137> urun3, ArrayList<DairyProducts_2137> urun4, ArrayList<Cereals_2137> urun5) {
        for (Confections_2137 urun : urun3) {
            urun1.get(katsayi).adi = yeniIsım;
            urun1.get(katsayi).detay = yeniDetay;

        }

    }

    @Override
    public void UrunSil(int katsayi, ArrayList<Beverages_2137> urun1,
            ArrayList<Condiments_2137> urun2,
            ArrayList<Confections_2137> urun3, ArrayList<DairyProducts_2137> urun4, ArrayList<Cereals_2137> urun5) {

        urun3.remove(katsayi);

    }

    @Override
    public void UrunFiyatGuncelle(int oran, boolean indirimMi, ArrayList<Beverages_2137> urun1,
            ArrayList<Condiments_2137> urun2,
            ArrayList<Confections_2137> urun3, ArrayList<DairyProducts_2137> urun4, ArrayList<Cereals_2137> urun5) {
        for (Confections_2137 urun : urun3) {
            if (indirimMi == true) {
                urun.birimFiyati -= urun.birimFiyati * (oran / 100);
            } else {
                urun.birimFiyati += urun.birimFiyati * (oran / 100);
            }
        }

    }

    @Override
    public void UrunKategorikZamYap(int X, ArrayList<Beverages_2137> urun1,
            ArrayList<Condiments_2137> urun2,
            ArrayList<Confections_2137> urun3, ArrayList<DairyProducts_2137> urun4, ArrayList<Cereals_2137> urun5) {
        for (Confections_2137 urun : urun3) {
            urun.birimFiyati += urun.birimFiyati * (X / 100);
        }

    }

    @Override
    public void YeniUrunEkle(String Adi, int KategoriIndex, String BirimAgirligi, Double BirimFiyati,
            int StokMiktari,
            String KategoriDetay, String Detay, ArrayList<Beverages_2137> urun1,
            ArrayList<Condiments_2137> urun2,
            ArrayList<Confections_2137> urun3, ArrayList<DairyProducts_2137> urun4,
            ArrayList<Cereals_2137> urun5) {
        Confections_2137 uruny = new Confections_2137(Adi, KategoriIndex, BirimAgirligi, BirimFiyati,
                KategoriDetay, Detay);
        urun3.add(uruny);

    }

}
