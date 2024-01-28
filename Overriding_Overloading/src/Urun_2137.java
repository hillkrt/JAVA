import java.util.ArrayList;

public class Urun_2137 {
    String adi;
    int kategoriIndex;
    String birimAgirligi;
    Double birimFiyati;
    int stokMiktari;

    public Urun_2137() {

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

    /*
     * Urun -> UrunFiyatGuncelle: Urun sınıfına ait birim fiyatı %oran kadar zamlı
     * olarak güncelleyiniz. UrunFiyatGuncelle(int oran)
     * UrunFiyatGuncelle(int oran, int stokMiktari) girilen stokMiktarı >
     * mevcutStokMiktari ise işlem gerçekleştirilecek, aksi durumda ise
     * işlem yapılmayacaktır.
     */
    public void UrunFiyatGuncelle(Double oran, ArrayList<Beverages_2137> urun1, ArrayList<Condiments_2137> urun2,
            ArrayList<Confections_2137> urun3,
            ArrayList<DairyProducts_2137> urun4, ArrayList<Cereals_2137> urun5) {
        for (Beverages_2137 urun : urun1) {
            urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * (oran / 100)));
        }
        for (Condiments_2137 urun : urun2) {
            urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * (oran / 100)));
        }
        for (Confections_2137 urun : urun3) {
            urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * (oran / 100)));
        }
        for (DairyProducts_2137 urun : urun4) {
            urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * (oran / 100)));
        }
        for (Cereals_2137 urun : urun5) {
            urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * (oran / 100)));
        }
    }

    public void UrunFiyatGuncelle(Double oran, int stokMiktari, ArrayList<Beverages_2137> urun1,
            ArrayList<Condiments_2137> urun2,
            ArrayList<Confections_2137> urun3,
            ArrayList<DairyProducts_2137> urun4, ArrayList<Cereals_2137> urun5) {

        for (Beverages_2137 urun : urun1) {
            if (stokMiktari < urun.stokMiktari) {
                urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * (oran / 100)));
            }
        }
        for (Condiments_2137 urun : urun2) {
            if (stokMiktari < urun.stokMiktari) {
                urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * (oran / 100)));
            }
        }
        for (Confections_2137 urun : urun3) {
            if (stokMiktari < urun.stokMiktari) {
                urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * (oran / 100)));
            }
        }
        for (DairyProducts_2137 urun : urun4) {
            if (stokMiktari < urun.stokMiktari) {
                urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * (oran / 100)));
            }
        }
        for (Cereals_2137 urun : urun5) {
            if (stokMiktari < urun.stokMiktari) {
                urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * (oran / 100)));
            }
        }
    }

    /*
     * Urun-> UrunStokGuncelle(int stokMiktarı, bool GirisMi): giriş çıkışa göre
     * ekleme/çıkarma yapınız.
     */
    public void UrunStokGuncelle(int stokMiktarı, boolean GirisMi, ArrayList<Beverages_2137> urun1,
            ArrayList<Condiments_2137> urun2,
            ArrayList<Confections_2137> urun3,
            ArrayList<DairyProducts_2137> urun4, ArrayList<Cereals_2137> urun5) {

        for (Beverages_2137 urun : urun1) {
            if (GirisMi == true) {
                urun.setStokMiktari(urun.getStokMiktari() + stokMiktarı);
            } else {
                urun.setStokMiktari(urun.getStokMiktari() - stokMiktarı);
            }
        }
        for (Condiments_2137 urun : urun2) {
            if (GirisMi == true) {
                urun.setStokMiktari(urun.getStokMiktari() + stokMiktarı);
            } else {
                urun.setStokMiktari(urun.getStokMiktari() - stokMiktarı);
            }
        }
        for (Confections_2137 urun : urun3) {
            if (GirisMi == true) {
                urun.setStokMiktari(urun.getStokMiktari() + stokMiktarı);
            } else {
                urun.setStokMiktari(urun.getStokMiktari() - stokMiktarı);
            }
        }
        for (DairyProducts_2137 urun : urun4) {
            if (GirisMi == true) {
                urun.setStokMiktari(urun.getStokMiktari() + stokMiktarı);
            } else {
                urun.setStokMiktari(urun.getStokMiktari() - stokMiktarı);
            }
        }
        for (Cereals_2137 urun : urun5) {
            if (GirisMi == true) {
                urun.setStokMiktari(urun.getStokMiktari() + stokMiktarı);
            } else {
                urun.setStokMiktari(urun.getStokMiktari() - stokMiktarı);
            }
        }
    }
    /*
     * Urun -> UrunKategorikZamYap: Alt Urun sınıfına ait tüm birim fiyatları ürünün
     * ad uzunluğu kadar (L) zam ekleyip güncelleyiniz.
     * UrunKategorikZamYap (String KategoriAdi)
     * UrunKategorikZamYap (String KategoriAdi, int stokKontrol) stokKontrol >10 ise
     * %L kadar, değilse %2L kadar zam yapınız.
     */

    public static void UrunKategorikZamYap(String KategoriAdi, ArrayList<Beverages_2137> urun1,
            ArrayList<Condiments_2137> urun2,
            ArrayList<Confections_2137> urun3,
            ArrayList<DairyProducts_2137> urun4, ArrayList<Cereals_2137> urun5) {

        double zamOrani = KategoriAdi.length();
        for (Beverages_2137 urun : urun1) {
            urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * zamOrani / 100));
        }
        for (Condiments_2137 urun : urun2) {
            urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * zamOrani / 100));
        }
        for (Confections_2137 urun : urun3) {
            urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * zamOrani / 100));
        }
        for (DairyProducts_2137 urun : urun4) {
            urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * zamOrani / 100));
        }
        for (Cereals_2137 urun : urun5) {
            urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * zamOrani / 100));
        }
    }

    public static void UrunKategorikZamYap(String KategoriAdi, int stokKontrol, ArrayList<Beverages_2137> urun1,
            ArrayList<Condiments_2137> urun2,
            ArrayList<Confections_2137> urun3,
            ArrayList<DairyProducts_2137> urun4, ArrayList<Cereals_2137> urun5) {

        double zamOrani = KategoriAdi.length();
        for (Beverages_2137 urun : urun1) {
            if (urun.getStokMiktari() > stokKontrol) {
                urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * zamOrani / 100));
            } else {
                urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * ((zamOrani * 2) / 100)));
            }
        }
        for (Condiments_2137 urun : urun2) {
            if (urun.getStokMiktari() > stokKontrol) {
                urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * zamOrani / 100));
            } else {
                urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * ((zamOrani * 2) / 100)));
            }
        }
        for (Confections_2137 urun : urun3) {
            if (urun.getStokMiktari() > stokKontrol) {
                urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * zamOrani / 100));
            } else {
                urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * ((zamOrani * 2) / 100)));
            }
        }
        for (DairyProducts_2137 urun : urun4) {
            if (urun.getStokMiktari() > stokKontrol) {
                urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * zamOrani / 100));
            } else {
                urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * ((zamOrani * 2) / 100)));
            }
        }
        for (Cereals_2137 urun : urun5) {
            if (urun.getStokMiktari() > 10) {
                urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * zamOrani / 100));
            } else {
                urun.setBirimFiyati(urun.getBirimFiyati() + (urun.getBirimFiyati() * ((zamOrani * 2) / 100)));
            }
        }
    }
}
