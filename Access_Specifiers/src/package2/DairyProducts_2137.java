package package2;

import java.util.ArrayList;

public class DairyProducts_2137 extends Urun_2137{
	
	public String kategoriAdi;
	public String detay;

	public DairyProducts_2137(String adi, int kategoriIndex, String birimAgirligi, Double birimFiyati, int stokMiktari,
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
	public static void UrunDetayEkle(String yeniDetay,ArrayList<DairyProducts_2137> urun4) {
		SutUrunleriDetayEkle(yeniDetay, urun4);
		
	}
	protected static void SutUrunleriDetayEkle(String yeniDetay,ArrayList<DairyProducts_2137> urun4) {
		for (DairyProducts_2137 urun : urun4) {
	        String mevcutDetay = urun.getDetay();
	        if (mevcutDetay == null) {
	            mevcutDetay = ""; // Eğer mevcut detay null ise bir hata almamak için boş bir string olarak alır
	        }
	        urun.setDetay(mevcutDetay + " " + yeniDetay);
	    }
		
	}

	

}
