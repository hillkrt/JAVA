import java.util.ArrayList;

public class Cereals_2137 extends Urun_2137 {

    String kategoriAdi;
    String detay;

    public Cereals_2137() {
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
     * Cereals -> TahilUrunEkle metodu ile yeni ürün ekleyiniz ve mevcut listeye
     * ekleyip gösteriniz.
     * TahilUrunEkle(Adi, BirimFiyatı, StokMiktari) Birim Ağırlığını default 10
     * alınız.
     * TahilUrunEkle(Adi, BirimAgirligi, BirimFiyatı, Detay) StokMiktarını default
     * 20 alınız.
     */
    public void TahilUrunEkle(String adi, double birimFiyati, int stokMiktari, ArrayList<Cereals_2137> urun5) {
        Cereals_2137 yeniUrun = new Cereals_2137();
        yeniUrun.setAdi(adi);
        yeniUrun.setBirimFiyati(birimFiyati);
        yeniUrun.setStokMiktari(stokMiktari);
        yeniUrun.setBirimAgirligi("10"); // Default birim ağırlığı 10
        urun5.add(yeniUrun);

        System.out.println("Yeni tahıl ürünü eklendi:");

    }

    public void TahilUrunEkle(String adi, String birimAgirligi, double birimFiyati, String detay,
            ArrayList<Cereals_2137> urun5) {
        Cereals_2137 yeniUrun = new Cereals_2137();
        yeniUrun.setAdi(adi);
        yeniUrun.setBirimAgirligi(birimAgirligi);
        yeniUrun.setBirimFiyati(birimFiyati);
        yeniUrun.setStokMiktari(20); // Default stok miktarı 20
        yeniUrun.setDetay(detay);
        urun5.add(yeniUrun);

        System.out.println("Yeni tahıl ürünü eklendi:");
    }

}
