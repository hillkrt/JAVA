package package2;

import java.util.ArrayList;

import package2.Beverages_2137;
import package2.Cereals_2137;
import package2.Condiments_2137;
import package2.Confections_2137;
import package2.DairyProducts_2137;

public class Beverages_2137 extends Urun_2137{


	public String kategoriAdi;
	public String detay;

	public Beverages_2137(String adi, int kategoriIndex, String birimAgirligi, Double birimFiyati, int stokMiktari,
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

	public static void BirimAgirlikGuncelle(String yeniAgirlik, ArrayList<Beverages_2137> urun1) {
		IcecekBirimAgirlikGuncelle(yeniAgirlik, urun1);
	}
	
	protected static void IcecekBirimAgirlikGuncelle(String yeniAgirlik, ArrayList<Beverages_2137> urun1) 
	{
		
	    if (urun1 != null && !urun1.isEmpty()) {
	        Beverages_2137 enSonUrun = urun1.get(urun1.size() - 1);
	        enSonUrun.setBirimAgirligi(yeniAgirlik);
	        System.out.println("En son ürünün güncellenmiş ağırlığı: " + enSonUrun.getBirimAgirligi());
	    } 
	    else {
	        System.out.println("Liste boş veya null.");
	    }
	}
}

