import java.util.ArrayList;

public class Condiments_2137 extends Urun_2137 {
    public int katsayi = 2;
    public String kategoriDetay;
    public String detay;

    public Condiments_2137() {
        super();
        this.katsayi = katsayi;
        this.kategoriDetay = kategoriDetay;
        this.detay = detay;
    }

    public Condiments_2137(String adi, int kategoriIndex, String birimAgirligi, Double birimFiyati,
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
    public void UrunIsimGuncelle(String yeniIsım, String yeniDetay, ArrayList<Beverages_2137> urun1,
            ArrayList<Condiments_2137> urun2,
            ArrayList<Confections_2137> urun3, ArrayList<DairyProducts_2137> urun4, ArrayList<Cereals_2137> urun5) {
        for (Condiments_2137 urun : urun2) {
            urun.setAdi(yeniIsım);
            urun.setDetay(yeniDetay);

        }
    }

    @Override
    public void UrunSil(int katsayi, ArrayList<Beverages_2137> urun1,
            ArrayList<Condiments_2137> urun2,
            ArrayList<Confections_2137> urun3, ArrayList<DairyProducts_2137> urun4, ArrayList<Cereals_2137> urun5) {

        urun2.remove(katsayi);

    }

    @Override
    public void UrunStokGuncelle(int adet, boolean girisMi, ArrayList<Beverages_2137> urun1,
            ArrayList<Condiments_2137> urun2,
            ArrayList<Confections_2137> urun3, ArrayList<DairyProducts_2137> urun4, ArrayList<Cereals_2137> urun5) {
        for (Condiments_2137 urun : urun2) {
            if (girisMi == true) {
                urun.stokMiktari -= adet;
            } else {
                urun.stokMiktari += adet;
            }
        }
    }

    @Override
    public void UrunFiyatGuncelle(int oran, boolean indirimMi, ArrayList<Beverages_2137> urun1,
            ArrayList<Condiments_2137> urun2,
            ArrayList<Confections_2137> urun3, ArrayList<DairyProducts_2137> urun4, ArrayList<Cereals_2137> urun5) {
        for (Condiments_2137 urun : urun2) {
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
        for (Condiments_2137 urun : urun2) {
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
        Condiments_2137 uruny = new Condiments_2137(Adi, KategoriIndex, BirimAgirligi, BirimFiyati,
                KategoriDetay, Detay);
        urun2.add(uruny);

    }
}
