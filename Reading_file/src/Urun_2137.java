import java.util.List;


	public class Urun_2137 {
	    String Adi;
	    int KategoriIndex;
	    String BirimAgirligi;
	    double BirimFiyati;
	    int StokMiktari; 

	    public Urun_2137() {

	    }

	    public String getAdi() {
	        return Adi;
	    }

	    public void setAdi(String adi) {
	        Adi = adi;
	    }

	    public int getKategoriIndex() {
	        return KategoriIndex;
	    }

	    public void setKategoriIndex(int kategoriIndex) {
	        KategoriIndex = kategoriIndex;
	    }

	    public String getBirimAgirligi() {
	        return BirimAgirligi;
	    }

	    public void setBirimAgirligi(String birimAgirligi2) {
	        BirimAgirligi = birimAgirligi2;
	    }

	    public double getBirimFiyati() {
	        return BirimFiyati;
	    }

	    public void setBirimFiyati(double birimFiyati) {
	        BirimFiyati = birimFiyati;
	    }

	    public int getStokMiktari() {
	        return StokMiktari;
	    }

	    public void setStokMiktari(int stokMiktari) {
	        StokMiktari = stokMiktari;
	    }
	    
	public static void StokMiktarinaGoreUrunFiyatlariGuncelle(int stokAdedi, int guncelFiyat,
			List<Beverages_2137> urun1, List<Cereals_2137> urun2, List<Condiments_2137> urun3,
			List<Confections_2137> urun4, List<DairyProdcts_2137> urun5) {
		for (Beverages_2137 urun : urun1) {
			if (urun.StokMiktari < stokAdedi) {
				guncelFiyat = guncelFiyat * (1 + (stokAdedi - urun.getStokMiktari()) / 100);
				urun.setBirimFiyati(guncelFiyat);
			}
		}

		for (Cereals_2137 urun : urun2) {
			if (urun.StokMiktari < stokAdedi) {
				guncelFiyat = guncelFiyat * (1 + (50 - stokAdedi) / 100);
				urun.setBirimFiyati(guncelFiyat);
			}
		}

		for (Condiments_2137 urun : urun3) {
			if (urun.StokMiktari < stokAdedi) {
				guncelFiyat = guncelFiyat * (1 + (50 - stokAdedi) / 100);
				urun.setBirimFiyati(guncelFiyat);
			}
		}

		for (Confections_2137 urun : urun4) {
			if (urun.StokMiktari < stokAdedi) {
				guncelFiyat = guncelFiyat * (1 + (50 - stokAdedi) / 100);
				urun.setBirimFiyati(guncelFiyat);
			}
		}

		for (DairyProdcts_2137 urun : urun5) {
			if (urun.StokMiktari < stokAdedi) {
				guncelFiyat = guncelFiyat * (1 + (50 - stokAdedi) / 100);
				urun.setBirimFiyati(guncelFiyat);
			}

		}

	}

	public static void UrunZamYap(int x, List<Beverages_2137> urun1, List<Cereals_2137> urun2,
			List<Condiments_2137> urun3, List<Confections_2137> urun4, List<DairyProdcts_2137> urun5) {

		Urun_2137 enDusukFiyatliUrun = null;
		double enDusukFiyat = Integer.MAX_VALUE;

		for (Beverages_2137 urun : urun1) {
			if (urun.BirimFiyati < enDusukFiyat) {
				enDusukFiyat = urun.BirimFiyati;
				enDusukFiyatliUrun = urun;
			}
		}

		for (Cereals_2137 urun : urun2) {
			if (urun.BirimFiyati < enDusukFiyat) {
				enDusukFiyat = urun.BirimFiyati;
				enDusukFiyatliUrun = urun;
			}
		}

		for (Condiments_2137 urun : urun3) {
			if (urun.BirimFiyati < enDusukFiyat) {
				enDusukFiyat = urun.BirimFiyati;
				enDusukFiyatliUrun = urun;
			}
		}

		for (Confections_2137 urun : urun4) {
			if (urun.BirimFiyati < enDusukFiyat) {
				enDusukFiyat = urun.BirimFiyati;
				enDusukFiyatliUrun = urun;
			}
		}

		for (DairyProdcts_2137 urun : urun5) {
			if (urun.BirimFiyati < enDusukFiyat) {
				enDusukFiyat = urun.BirimFiyati;
				enDusukFiyatliUrun = urun;
			}
		}

		if (enDusukFiyatliUrun != null) {
			enDusukFiyatliUrun.BirimFiyati = (enDusukFiyatliUrun.BirimFiyati * (1 + x / 100.0));
			System.out.println(enDusukFiyatliUrun.Adi+"En düşük fiyatlı ürüne %" + x + " zam yapıldı. Yeni fiyat: " + enDusukFiyatliUrun.BirimFiyati);
		} else {
			System.out.println("Ürün bulunamadı.");
		}

	}
}
