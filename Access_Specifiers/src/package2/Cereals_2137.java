package package2;

import java.util.ArrayList;

public class Cereals_2137 extends Urun_2137{
	

	public String kategoriAdi;
	public String detay;

	public Cereals_2137(String adi, int kategoriIndex, String birimAgirligi, Double birimFiyati, int stokMiktari,
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
	public static void Sil(String urunAdi,ArrayList<Cereals_2137> urun5) {
		HububatSil(urunAdi, urun5);
		
	}
	protected static void HububatSil(String urunAdi, ArrayList<Cereals_2137> urun5) {
	    for (int i = 0; i < urun5.size(); i++) {
	        Cereals_2137 urun = urun5.get(i);
	        if (urun.getAdi().equals(urunAdi)) {
	            urun5.remove(i);
	            System.out.println(urunAdi + " adlı ürün, listeden silindi.");
	            return;
	        }
	    }
	    System.out.println(urunAdi + " adlı ürün bulunamadı.");
	}

}
