import java.util.ArrayList;

public class Cereals_2137 extends Urun_2137 {
    public int katsayi = 1;
    public String kategoriDetay;
    public String detay;

    public Cereals_2137() {
        super();

        this.katsayi = katsayi;
        this.kategoriDetay = kategoriDetay;
        this.detay = detay;
    }

    public Cereals_2137(String adi, int kategoriIndex, String birimAgirligi, Double birimFiyati,
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
        for (Cereals_2137 urun : urun5) {
            urun.setAdi(yeniIsım);
            urun.setDetay(yeniDetay);

        }
    }

    @Override
    public void UrunSil(int katsayi, ArrayList<Beverages_2137> urun1,
            ArrayList<Condiments_2137> urun2,
            ArrayList<Confections_2137> urun3, ArrayList<DairyProducts_2137> urun4, ArrayList<Cereals_2137> urun5) {

        urun5.remove(katsayi);

    }

    @Override
    public void UrunStokGuncelle(int adet, boolean girisMi, ArrayList<Beverages_2137> urun1,
            ArrayList<Condiments_2137> urun2,
            ArrayList<Confections_2137> urun3, ArrayList<DairyProducts_2137> urun4, ArrayList<Cereals_2137> urun5) {
        for (Cereals_2137 urun : urun5) {
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
        for (Cereals_2137 urun : urun5) {
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
        for (Cereals_2137 urun : urun5) {
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
        Cereals_2137 uruny = new Cereals_2137(Adi, KategoriIndex, BirimAgirligi, BirimFiyati,
                KategoriDetay, Detay);
        urun5.add(uruny);

    }
}
