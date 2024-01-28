package package2;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

import package2.Beverages_2137;
import package2.Cereals_2137;
import package2.Condiments_2137;
import package2.Confections_2137;
import package2.DairyProducts_2137;

public class Urun_2137 {
	public String adi;
	public int kategoriIndex;
	public String birimAgirligi;
	public Double birimFiyati;
	public int stokMiktari;

	public Urun_2137(String adi, int kategoriIndex, String birimAgirligi, Double birimFiyati, int stokMiktari) {
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

	public void setKategoriIndex(int kategoriIndex) {
		this.kategoriIndex = kategoriIndex;
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
	public static void KategorikStokGuncelle(String kategoriAdi, int x,ArrayList<Beverages_2137>urun1,ArrayList<Condiments_2137>urun2,ArrayList<Confections_2137>urun3
			,ArrayList<DairyProducts_2137>urun4,ArrayList<Cereals_2137>urun5) {
		UrunKategorikStokGuncelle(kategoriAdi,x,urun1,urun2,urun3,urun4,urun5);
	}
	protected static void UrunKategorikStokGuncelle(String kategoriAdi, int x,ArrayList<Beverages_2137>urun1,ArrayList<Condiments_2137>urun2,ArrayList<Confections_2137>urun3
			,ArrayList<DairyProducts_2137>urun4,ArrayList<Cereals_2137>urun5) {
		
		for (Beverages_2137 urun : urun1) {
			if(urun.kategoriAdi.equals(kategoriAdi)) {
				urun.birimFiyati += urun.birimFiyati*(x/100);
			}
		}
		for (Condiments_2137 urun : urun2) {
			if(urun.kategoriAdi.equals(kategoriAdi)) {
				urun.birimFiyati += urun.birimFiyati*(x/100);
			}
		}
		for (Confections_2137 urun : urun3) {
			if(urun.kategoriAdi.equals(kategoriAdi)) {
				urun.birimFiyati += urun.birimFiyati*(x/100);
			}
		}
		for (DairyProducts_2137 urun : urun4) {
			if(urun.kategoriAdi.equals(kategoriAdi)) {
				urun.birimFiyati += urun.birimFiyati*(x/100);
			}
		}
		for (Cereals_2137 urun : urun5) {
			if(urun.kategoriAdi.equals(kategoriAdi)) {
				urun.birimFiyati += urun.birimFiyati*(x/100);
			}
		}
	}
	public static void FiyataGoreSil(Double MinFiyat,Double MaxFiyat,ArrayList<Beverages_2137>urun1,ArrayList<Condiments_2137>urun2,ArrayList<Confections_2137>urun3
			,ArrayList<DairyProducts_2137>urun4,ArrayList<Cereals_2137>urun5) {
		UrunleriFiyataGoreSil(MinFiyat,MaxFiyat,urun1,urun2,urun3,urun4,urun5);
	}
	protected static void UrunleriFiyataGoreSil(Double MinFiyat,Double MaxFiyat,ArrayList<Beverages_2137>urun1,ArrayList<Condiments_2137>urun2,ArrayList<Confections_2137>urun3
			,ArrayList<DairyProducts_2137>urun4,ArrayList<Cereals_2137>urun5) {
		 for (int i = urun1.size() - 1; i >= 0; i--) {
		        Beverages_2137 urun = urun1.get(i);
		        if (urun.birimFiyati >= MinFiyat && urun.birimFiyati <= MaxFiyat) {
		            urun1.remove(i);
		            System.out.println(urun.getAdi() + " adlı ürün, belirtilen fiyat aralığından dolayı silindi.");
		        }
		    }
		 for (int i = urun1.size() - 1; i >= 0; i--) {
		        Condiments_2137 urun = urun2.get(i);
		        if (urun.birimFiyati >= MinFiyat && urun.birimFiyati <= MaxFiyat) {
		            urun1.remove(i);
		            System.out.println(urun.getAdi() + " adlı ürün, belirtilen fiyat aralığından dolayı silindi.");
		        }
		    }
		 for (int i = urun1.size() - 1; i >= 0; i--) {
			 Confections_2137 urun = urun3.get(i);
		        if (urun.birimFiyati >= MinFiyat && urun.birimFiyati <= MaxFiyat) {
		            urun1.remove(i);
		            System.out.println(urun.getAdi() + " adlı ürün, belirtilen fiyat aralığından dolayı silindi.");
		        }
		    }
		 for (int i = urun1.size() - 1; i >= 0; i--) {
			 DairyProducts_2137 urun = urun4.get(i);
		        if (urun.birimFiyati >= MinFiyat && urun.birimFiyati <= MaxFiyat) {
		            urun1.remove(i);
		            System.out.println(urun.getAdi() + " adlı ürün, belirtilen fiyat aralığından dolayı silindi.");
		        }
		    }
		 for (int i = urun1.size() - 1; i >= 0; i--) {
			 Cereals_2137 urun = urun5.get(i);
		        if (urun.birimFiyati >= MinFiyat && urun.birimFiyati <= MaxFiyat) {
		            urun1.remove(i);
		            System.out.println(urun.getAdi() + " adlı ürün, belirtilen fiyat aralığından dolayı silindi.");
		        }
		    }
	}
}
