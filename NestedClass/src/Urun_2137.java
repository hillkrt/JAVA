import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Urun_2137 {

    String adi;
    int kategoriIndex;
    String birimAgirligi;
    double birimFiyati;
    int stokMiktari;

    public Urun_2137(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stokMiktari) {
        this.adi = adi;
        this.kategoriIndex = kategoriIndex;
        this.birimAgirligi = birimAgirligi;
        this.birimFiyati = birimFiyati;
        this.stokMiktari = stokMiktari;
    }

    public Urun_2137() {

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

	public double getBirimFiyati() {
		return birimFiyati;
	}

	public void setBirimFiyati(double birimFiyati) {
		this.birimFiyati = birimFiyati;
	}

	public int getStokMiktari() {
		return stokMiktari;
	}

	public void setStokMiktari(int stokMiktari) {
		this.stokMiktari = stokMiktari;
	}

	/*/ekle cikar durumuna göre mevcut ürünün %50si kadar ekle/çıkar yap.
	 * */

	public void UrunStokGuncelle(String urunAdi, boolean ekleMi, ArrayList<Urun_2137.Beverages_2137> urun1,
            ArrayList<Urun_2137.Condiments_2137> urun2, ArrayList<Urun_2137.Confections_2137> urun3,
            ArrayList<Urun_2137.DairyProducts_2137> urun4, ArrayList<Urun_2137.Cereals_2137> urun5) {

       for (Beverages_2137 urun : urun1) {
    	   if(ekleMi==true) {
    		   urun.setStokMiktari(urun.getStokMiktari()/2+urun.getStokMiktari());
    	   }
    	   else if(ekleMi==false) {
    		   urun.setStokMiktari(urun.getStokMiktari()/2-urun.getStokMiktari());
    	   }
	}

       for (Condiments_2137 urun : urun2) {
    	   if(ekleMi==true) {
    		   urun.setStokMiktari(urun.getStokMiktari()/2+urun.getStokMiktari());
    	   }
    	   else if(ekleMi==false) {
    		   urun.setStokMiktari(urun.getStokMiktari()/2-urun.getStokMiktari());
    	   }
	}
       for (Confections_2137 urun : urun3) {
    	   if(ekleMi==true) {
    		   urun.setStokMiktari(urun.getStokMiktari()/2+urun.getStokMiktari());
    	   }
    	   else if(ekleMi==false) {
    		   urun.setStokMiktari(urun.getStokMiktari()/2-urun.getStokMiktari());
    	   }
	}
       for (DairyProducts_2137 urun : urun4) {
    	   if(ekleMi==true) {
    		   urun.setStokMiktari(urun.getStokMiktari()/2+urun.getStokMiktari());
    	   }
    	   else if(ekleMi==false) {
    		   urun.setStokMiktari(urun.getStokMiktari()/2-urun.getStokMiktari());
    	   }
	}
       for (Cereals_2137 urun : urun5) {
    	   if(ekleMi==true) {
    		   urun.setStokMiktari(urun.getStokMiktari()/2+urun.getStokMiktari());
    	   }
    	   else if(ekleMi==false) {
    		   urun.setStokMiktari(urun.getStokMiktari()/2-urun.getStokMiktari());
    	   }
	}
    }
/*Urun -> UrunKategorikIndirimYap: Nested Urun sınıfına ait fiyatı o kategorinin fiyat ortalamasından 
büyük olan %X indirim yapıp güncelleyiniz. UrunKategorikIndirimYap(String KategoriAdi, int X)*/
    public boolean UrunKategorikIndirimYap(String kategoriAdi, int X, ArrayList<Beverages_2137> urun1,
            ArrayList<Condiments_2137> urun2,
            ArrayList<Confections_2137> urun3,
            ArrayList<DairyProducts_2137> urun4, ArrayList<Cereals_2137> urun5) {

        boolean kontrol = false;
        if (!urun1.isEmpty() && urun1.get(0).kategoriAdi.equals(kategoriAdi)) {
            kontrol = true;
            double kategoriFiyatOrtalamasi = urun1.stream().mapToDouble(Beverages_2137::getBirimFiyati).average().orElse(0);
            urun1.forEach(urun -> urun.setBirimFiyati(urun.getBirimFiyati() - (urun.getBirimFiyati() * X / 100)));
        } 
        else if (!urun2.isEmpty() && urun2.get(0).kategoriAdi.equals(kategoriAdi)) {
            kontrol = true;
            double kategoriFiyatOrtalamasi = urun2.stream().mapToDouble(Condiments_2137::getBirimFiyati).average().orElse(0);
            urun2.forEach(urun -> urun.setBirimFiyati(urun.getBirimFiyati() - (urun.getBirimFiyati() * X / 100)));
        } 
        else if (!urun3.isEmpty() && urun3.get(0).kategoriAdi.equals(kategoriAdi)) {
            kontrol = true;
            double kategoriFiyatOrtalamasi = urun3.stream().mapToDouble(Confections_2137::getBirimFiyati).average().orElse(0);
            urun3.forEach(urun -> urun.setBirimFiyati(urun.getBirimFiyati() - (urun.getBirimFiyati() * X / 100)));
        } 
        else if (!urun4.isEmpty() && urun4.get(0).kategoriAdi.equals(kategoriAdi)) {
            kontrol = true;
            double kategoriFiyatOrtalamasi = urun4.stream().mapToDouble(DairyProducts_2137::getBirimFiyati).average().orElse(0);
            urun4.forEach(urun -> urun.setBirimFiyati(urun.getBirimFiyati() - (urun.getBirimFiyati() * X / 100)));
        } 
        else if (!urun5.isEmpty() && urun5.get(0).kategoriAdi.equals(kategoriAdi)) {
            kontrol = true;
            double kategoriFiyatOrtalamasi = urun5.stream().mapToDouble(Cereals_2137::getBirimFiyati).average().orElse(0);
            urun5.forEach(urun -> urun.setBirimFiyati(urun.getBirimFiyati() - (urun.getBirimFiyati() * X / 100)));
        }


        if (kontrol == false) {
            System.out.println("\nGirdiginiz isimde urun kategorisi bulunamamistir!!");
            return false;
        } else
            return true;

    }

    public static class Beverages_2137 extends Urun_2137 {

        String kategoriAdi;
        String detay;

        public Beverages_2137(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stok,
                String kategoriAdi, String detay) {
            super(adi, kategoriIndex, birimAgirligi, birimFiyati, stok);
            this.kategoriAdi = kategoriAdi;
            this.detay = detay;

        }

        public Beverages_2137() {

        }

        public void IcecekUrunuSil(String urunAdi, ArrayList<Urun_2137.Beverages_2137> urun1) {
        	 Iterator<Urun_2137.Beverages_2137> iterator = urun1.iterator();

             while (iterator.hasNext()) {
                 Urun_2137.Beverages_2137 urun = iterator.next();

                 if (urun.getAdi().equals(urunAdi)) {
                     iterator.remove();
                 }
             }
        }
            
    }

    public static class Condiments_2137 extends Urun_2137 {

        String kategoriAdi;
        String detay;

        public Condiments_2137(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stok,
                String kategoriAdi, String detay) {
            super(adi, kategoriIndex, birimAgirligi, birimFiyati, stok);
            this.kategoriAdi = kategoriAdi;
            this.detay = detay;
        }

        public Condiments_2137() {

        }

        public void CesniUrunEkle(String adi,int kategoriIndex,String birimAgirligi,double birimFiyati,int stokMiktari, String KategoriDetay,String detay,
        		ArrayList<Urun_2137.Condiments_2137> urun2) {

        	Urun_2137.Condiments_2137 yUrun = new Urun_2137.Condiments_2137(adi, 5, birimAgirligi, birimFiyati, stokMiktari,
                    urun2.get(0).kategoriAdi,
                    urun2.get(0).detay);
            urun2.add(yUrun);
        }

    }

    public static class Confections_2137 extends Urun_2137 {

        String kategoriAdi;
        String detay;

        public Confections_2137(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stok,
                String kategoriAdi, String detay) {
            super(adi, kategoriIndex, birimAgirligi, birimFiyati, stok);
            this.kategoriAdi = kategoriAdi;
            this.detay = detay;
        }

        public Confections_2137() {

        }
        /* SekerlemeDetayEkle metodu ile sahip olduğu özelliğe yeni bir detay ekle. 
			SekerlemeDetayEkle(String yeniDetay) : yenidetayı mevcut detay bilgisine ekleyiniz. */

        public void SekerlemeDetayEkle(String yeniDetay, ArrayList<Urun_2137.Confections_2137> urun3) {

            for (Confections_2137 urun : urun3) {
                urun.detay = urun.detay + " ," + yeniDetay;
            }
        }

    }

    public static class DairyProducts_2137 extends Urun_2137 {

        String kategoriAdi;
        String detay;

        public DairyProducts_2137(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stok,
                String kategoriAdi, String detay) {
            super(adi, kategoriIndex, birimAgirligi, birimFiyati, stok);
            this.kategoriAdi = kategoriAdi;
            this.detay = detay;
        }

        public DairyProducts_2137() {

        }
        /*DairyProducts -> SutUrunuStokGuncelle metodu ile ilgili içeceğin stok giriş/çıkışına göre işlemleri yap. 
			SutUrunuStokGuncelle (boolean Satismi, int miktar);*/

        public void SutUrunuStokGuncelle(boolean satisMi,int miktar, ArrayList<Urun_2137.DairyProducts_2137> urun4) {
        	
        	for (DairyProducts_2137 urun : urun4) {
				if(satisMi==true) {
					urun.setStokMiktari(urun.getStokMiktari()-miktar);
				}
				else if(satisMi==false){
					urun.setStokMiktari(urun.getStokMiktari()+miktar);
				}
			}
        	 
        }

    }

    public static class Cereals_2137 extends Urun_2137 {

        String kategoriAdi;
        String detay;

        public Cereals_2137(String adi, int kategoriIndex, String birimAgirligi, double birimFiyati, int stok,
                String kategoriAdi, String detay) {
            super(adi, kategoriIndex, birimAgirligi, birimFiyati, stok);
            this.kategoriAdi = kategoriAdi;
            this.detay = detay;
        }

        public Cereals_2137() {

        }
        /*Cereals -> TahilBirimAgirlikGuncelle metodu ile listede yer alan ortalama ağırlığa en yakın tahıl
			nesnesine ait ağırlığı güncelleyiniz. TahilBirimAgirlikGuncelle(String yeniAgirlik)*/
        public void TahilBirimFiyatGuncelle(int yeniFiyat,ArrayList<Urun_2137.Cereals_2137> urun5) {
        	 double ortalamaAgirlik = 0;
             int toplamAgirlik = 0;
             int urunSayisi = urun5.size();

       
             for (Cereals_2137 urun : urun5) {
                 toplamAgirlik +=(urun.getBirimFiyati());
             }

             if (urunSayisi > 0) {
                 ortalamaAgirlik = (double) toplamAgirlik / urunSayisi;
             }

             Cereals_2137 enYakinFiyatliTahil = null;
             double enKucukFark = Double.MAX_VALUE;

             for (Cereals_2137 urun : urun5) {
                 double urunAgirlik = (urun.getBirimFiyati());
                 double fark = Math.abs(urunAgirlik - ortalamaAgirlik);

                 if (fark < enKucukFark) {
                     enKucukFark = fark;
                     enYakinFiyatliTahil = urun;
                 }
             }

             if (enYakinFiyatliTahil != null) {
            	 enYakinFiyatliTahil.setBirimFiyati(yeniFiyat);
             }
          
        }

    }

}
