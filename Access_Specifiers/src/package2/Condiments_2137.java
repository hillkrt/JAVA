package package2;

import java.util.ArrayList;

public class Condiments_2137 extends Urun_2137 {

	public String kategoriAdi;
	public String detay;

	public Condiments_2137(String adi, int kategoriIndex, String birimAgirligi, Double birimFiyati, int stokMiktari,
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
	public static void StokGuncelle(boolean SatisMi,int miktar,ArrayList<Condiments_2137> urun2) {
		CesniStokGuncelle(SatisMi, miktar, urun2);
	}
	protected static void CesniStokGuncelle(boolean SatisMi, int miktar, ArrayList<Condiments_2137> urun2) {
		for (Condiments_2137 urun : urun2) {
			int yeniStok;
			if (SatisMi == true) {
				yeniStok = urun.stokMiktari - miktar;
			} else {
				yeniStok = urun.stokMiktari + miktar;
			}

		}
	}

}
