package package2;

import java.util.ArrayList;

public class Confections_2137 extends Urun_2137 {
    public String kategoriAdi;
    public String detay;

    public Confections_2137(String adi, int kategoriIndex, String birimAgirligi, Double birimFiyati, int stokMiktari,
            String kategoriAdi, String detay) {
        super(adi, kategoriIndex, birimAgirligi, birimFiyati, stokMiktari);
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
    public static void UrunEkle(String Adi, int KategoriIndex, String BirimAgirligi, Double BirimFiyati,
            int StokMiktari, String kategoriAdi, String detay,ArrayList<Confections_2137> urun3) {
    	SekerlemeUrunEkle(Adi, KategoriIndex, BirimAgirligi, BirimFiyati, StokMiktari, kategoriAdi, detay, urun3);
    	
    }
    protected static void SekerlemeUrunEkle(String Adi, int KategoriIndex, String BirimAgirligi, Double BirimFiyati,
            int StokMiktari, String kategoriAdi, String detay, ArrayList<Confections_2137> urun3) {
        Confections_2137 urun = new Confections_2137(Adi, KategoriIndex, BirimAgirligi, BirimFiyati, StokMiktari,
                kategoriAdi, detay);
        urun.setAdi(Adi);
        urun.setKategoriIndex(KategoriIndex);
        urun.setBirimAgirligi(BirimAgirligi);
        urun.setBirimFiyati(BirimFiyati);
        urun.setStokMiktari(StokMiktari);
        urun.setKategoriAdi(kategoriAdi);
        urun.setDetay(detay);
        

        urun3.add(urun);
    }
}
