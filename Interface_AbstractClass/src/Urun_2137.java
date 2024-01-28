import java.util.ArrayList;

public abstract class Urun_2137 implements IUrun_2137 {
    public String adi;
    public int kategoriIndex;
    public String birimAgirligi;
    public Double birimFiyati;
    public int stokMiktari;

    public Urun_2137() {
        super();
        this.adi = adi;
        this.kategoriIndex = kategoriIndex;
        this.birimAgirligi = birimAgirligi;
        this.birimFiyati = birimFiyati;
        this.stokMiktari = stokMiktari;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getKategoriIndex() {
        return kategoriIndex;
    }

    public void setKategoriIndex(int ktegoriIndex) {
        this.kategoriIndex = ktegoriIndex;
    }

    public String getBirimAgirligi() {
        return birimAgirligi;
    }

    public void setBirimAgirligi(String birimAgirligi) {
        this.birimAgirligi = birimAgirligi;
    }

    public Double getBirimFiyati() {
        return birimFiyati;
    }

    public void setBirimFiyati(Double birimFiyati) {
        this.birimFiyati = birimFiyati;
    }

    public int getStokMiktari() {
        return stokMiktari;
    }

    public void setStokMiktari(int stokMiktari) {
        this.stokMiktari = stokMiktari;
    }

    public abstract void UrunFiyatGuncelle(int oran, boolean indirimMi, ArrayList<Beverages_2137> urun1,
            ArrayList<Condiments_2137> urun2, ArrayList<Confections_2137> urun3,
            ArrayList<DairyProducts_2137> urun4, ArrayList<Cereals_2137> urun5);

    public abstract void UrunKategorikZamYap(int X, ArrayList<Beverages_2137> urun1, ArrayList<Condiments_2137> urun2,
            ArrayList<Confections_2137> urun3,
            ArrayList<DairyProducts_2137> urun4, ArrayList<Cereals_2137> urun5);
}
