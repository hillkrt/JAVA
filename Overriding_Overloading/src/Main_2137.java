import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_2137 {

    public static void main(String[] args) throws IOException {
        FileReader file1 = new FileReader("Urunler.txt");
        BufferedReader reader1 = new BufferedReader(file1);
        FileReader file2 = new FileReader("UrunGrubu.txt");
        BufferedReader reader2 = new BufferedReader(file2);

        ArrayList<Beverages_2137> urun1 = new ArrayList<>();
        ArrayList<Condiments_2137> urun2 = new ArrayList<>();
        ArrayList<Confections_2137> urun3 = new ArrayList<>();
        ArrayList<DairyProducts_2137> urun4 = new ArrayList<>();
        ArrayList<Cereals_2137> urun5 = new ArrayList<>();

        ArrayList<String> list = new ArrayList<>();

        String line2 = reader2.readLine();
        line2 = reader2.readLine();
        String[] array2 = null;
        String[] temp = null;

        while (line2 != null) {
            temp = line2.split("\t");
            list.add(temp[0]);
            list.add(temp[1]);
            list.add(temp[2]);
            line2 = reader2.readLine();
        }

        String line1 = reader1.readLine();
        line1 = reader1.readLine();

        do {
            String[] array = line1.split("\t");

            if (Integer.valueOf(array[1]) == 1) {

                Beverages_2137 urun = new Beverages_2137();
                urun.setAdi(array[0]);
                urun.setKategoriIndex(Integer.valueOf(array[1]));
                urun.setBirimAgirligi(String.valueOf(array[2]));
                urun.setBirimFiyati(Double.valueOf(array[3]));
                urun.setStokMiktari(Integer.valueOf(array[4]));
                urun.setKategoriAdi(list.get(1));
                urun.setDetay(list.get(2));

                urun1.add(urun);
                urun = null;

            } else if (Integer.valueOf(array[1]) == 2) {

                Condiments_2137 urun = new Condiments_2137();
                urun.setAdi(array[0]);
                urun.setKategoriIndex(Integer.valueOf(array[1]));
                urun.setBirimAgirligi(String.valueOf(array[2]));
                urun.setBirimFiyati(Double.valueOf(array[3]));
                urun.setStokMiktari(Integer.valueOf(array[4]));
                urun.setKategoriAdi(list.get(4));
                urun.setDetay(list.get(5));

                urun2.add(urun);
                urun = null;

            } else if (Integer.valueOf(array[1]) == 3) {

                Confections_2137 urun = new Confections_2137();
                urun.setAdi(array[0]);
                urun.setKategoriIndex(Integer.valueOf(array[1]));
                urun.setBirimAgirligi(String.valueOf(array[2]));
                urun.setBirimFiyati(Double.valueOf(array[3]));
                urun.setStokMiktari(Integer.valueOf(array[4]));
                urun.setKategoriAdi(list.get(7));
                urun.setDetay(list.get(8));

                urun3.add(urun);
                urun = null;

            } else if (Integer.valueOf(array[1]) == 4) {

                DairyProducts_2137 urun = new DairyProducts_2137();
                urun.setAdi(array[0]);
                urun.setKategoriIndex(Integer.valueOf(array[1]));
                urun.setBirimAgirligi(String.valueOf(array[2]));
                urun.setBirimFiyati(Double.valueOf(array[3]));
                urun.setStokMiktari(Integer.valueOf(array[4]));
                urun.setKategoriAdi(list.get(10));
                urun.setDetay(list.get(11));

                urun4.add(urun);
                urun = null;

            } else {

                Cereals_2137 urun = new Cereals_2137();
                urun.setAdi(array[0]);
                urun.setKategoriIndex(Integer.valueOf(array[1]));
                urun.setBirimAgirligi(String.valueOf(array[2]));
                urun.setBirimFiyati(Double.valueOf(array[3]));
                urun.setStokMiktari(Integer.valueOf(array[4]));
                urun.setKategoriAdi(list.get(13));
                urun.setDetay(list.get(14));

                urun5.add(urun);
                urun = null;

            }

            line1 = reader1.readLine();

        } while (line1 != null);
        Yazdir(urun1, urun2, urun3, urun4, urun5);
        while (true) {
            int secim;
            Scanner tara = new Scanner(System.in);
            System.out.println("Ürün Fiyat Güncelle : 1");
            System.out.println("Ürün Kategorik Zam Yap : 2");
            System.out.println("Ürün Fiyat Güncelle (Beverages): 3");
            System.out.println("Cesni Birim Agirlik Guncelle : 4");
            System.out.println("Ürün Stok Güncelle : 5");
            System.out.println("Süt Ürünü Sil : 6");
            System.out.println("Tahil Ürün Ekle : 7");
            System.out.println("ÇIKIŞ:8");
            System.out.println("Bir Seçim Yapınız : ");
            secim = tara.nextInt();

            switch (secim) {
                case 1:
                    System.out.println(
                            "Ürüne stok miktarına göre zam yapmak istiyorsanız 'A' ya basınız, direkt zam yapmak istiyorsanız 'B' ye basınız :");
                    char zam = tara.next().charAt(0);

                    int stokMiktari;
                    Double oran;
                    Urun_2137 yeniUrun = new Urun_2137();
                    if (zam == 'A') {
                        System.out.println("Stok miktarını giriniz : ");
                        stokMiktari = tara.nextInt();
                        tara.nextLine();
                        System.out.println("Zam oranını giriniz :");
                        oran = tara.nextDouble();
                        tara.nextLine();
                        yeniUrun.UrunFiyatGuncelle(oran, stokMiktari, urun1, urun2, urun3, urun4, urun5);
                        Yazdir(urun1, urun2, urun3, urun4, urun5);
                    } else if (zam == 'B') {
                        System.out.println("Zam oranını giriniz : ");
                        oran = tara.nextDouble();
                        tara.nextLine();
                        yeniUrun.UrunFiyatGuncelle(oran, urun1, urun2, urun3, urun4, urun5);
                        Yazdir(urun1, urun2, urun3, urun4, urun5);
                    } else {
                        System.out.println("Yanlış seçim yaptınız. Lütfen tekrar seçim yapınız.");
                    }
                    break;
                case 2:
                    System.out.println(
                            "Ürüne stok miktarına göre zam yapmak istiyorsanız 'A' ya basınız, direkt zam yapmak istiyorsanız 'B' ye basınız :");
                    char kategorikZam = tara.next().charAt(0);
                    int stokKontrol = 10;
                    String kategriAdi;

                    if (kategorikZam == 'A') {
                        System.out.println("Kategori adını giriniz : ");
                        kategriAdi = tara.next();
                        Urun_2137.UrunKategorikZamYap(kategriAdi, stokKontrol, urun1, urun2, urun3, urun4, urun5);
                        Yazdir(urun1, urun2, urun3, urun4, urun5);
                    } else if (kategorikZam == 'B') {
                        System.out.println("Kategori adını giriiz ");
                        kategriAdi = tara.next();
                        Urun_2137.UrunKategorikZamYap(kategriAdi, urun1, urun2, urun3, urun4, urun5);
                        Yazdir(urun1, urun2, urun3, urun4, urun5);
                    } else {
                        System.out.println("Yanlış seçim yaptınız. Lütfen tekrar seçim yapınız.");
                    }
                    break;
                case 3:
                    System.out.println("Zam oranını giriniz : ");
                    oran = tara.nextDouble();
                    Beverages_2137 yeniUrun2 = new Beverages_2137();
                    yeniUrun2.UrunFiyatGuncelle(oran, urun1, urun2, urun3, urun4, urun5);
                    break;
                case 4:
                    System.out.println(
                            "Ürüne stok miktarini göre güncelleme yapmak istiyorsaniz 'A' ya basiniz, direkt güncelleme yapmak istiyorsaniz 'B' ye basiniz :");
                    char guncelleme = tara.next().charAt(0);
                    if (guncelleme == 'A') {
                        System.out.println("Yeni agirligini giriniz : ");
                        String agirlik;
                        agirlik = tara.next();
                        System.out.println("Stok miktarini giriniz ");
                        int guncelStok;
                        guncelStok = tara.nextInt();
                        Condiments_2137 yeniUrun3 = new Condiments_2137();
                        yeniUrun3.CesniBirimAgirlikGuncelle(agirlik, guncelStok, urun2);

                    } else if (guncelleme == 'B') {
                        System.out.println("Yeni agirligi giriniz : ");
                        String agirlik;
                        agirlik = tara.next();
                        Condiments_2137 yeniUrun3 = new Condiments_2137();
                        yeniUrun3.CesniBirimAgirlikGuncelle(agirlik, urun2);

                    } else {
                        System.out.println("Yanliş seçim yaptiniz. Lütfen tekrar seçim yapiniz.");
                    }
                    break;
                case 5:
                    Confections_2137 yeniUrun4 = new Confections_2137();
                    System.out.println("Stok miktarıı giriniz : ");
                    int yeniStok;
                    yeniStok = tara.nextInt();
                    System.out.println("giriş işlemi ise true yazin cikis islemi iste false yaziniz : ");
                    Boolean girisMi;
                    girisMi = tara.nextBoolean();
                    yeniUrun4.UrunStokGuncelle(yeniStok, girisMi, urun1, urun2, urun3, urun4, urun5);

                    break;
                case 6:
                    DairyProducts_2137 yeniUrun5 = new DairyProducts_2137();
                    int sec;
                    int minStok, maxStok;
                    double fiyat;
                    System.out.println(
                            "EN AZ STOKLU ÜRÜNÜ SİLMEK İÇİN 1'E BASINIZ \n STOK DEĞERLERİNE GÖRE SİLME YAPMAK İÇİN 2'YE BASINIZ \n FİYAT DEGERİNE GÖRRE SİLME YAPMAK İÇİN 3'E BASINIZ \n");
                    sec = tara.nextInt();
                    if (sec == 1) {
                        yeniUrun5.SutUrunuSil(urun4);
                        Yazdir(urun1, urun2, urun3, urun4, urun5);
                    } else if (sec == 2) {
                        System.out.println("MİNUMUM STOK MİKTARINI GİRİNİZ : ");
                        minStok = tara.nextInt();
                        System.out.println("MAKSİMUM STOK MİKTARINI GİRİNİZ : ");
                        maxStok = tara.nextInt();
                        System.out.println("FİYAT DEĞERİNİ GİRİNİZ : ");
                        fiyat = tara.nextDouble();
                        yeniUrun5.SutUrunuSil(minStok, maxStok, fiyat, urun4);
                        Yazdir(urun1, urun2, urun3, urun4, urun5);
                    } else if (sec == 3) {
                        System.out.println("FİYAT DEĞERİNİ GİRİNİZ : ");
                        fiyat = tara.nextDouble();
                        yeniUrun5.SutUrunuSil(fiyat, urun4);
                        Yazdir(urun1, urun2, urun3, urun4, urun5);
                    }
                    break;
                case 7:
                    Cereals_2137 yeniUrun6 = new Cereals_2137();
                    System.out.println(
                            "STOK MİKTARI EKLEMEDEN DEVAM ETMEK İÇİN 1'E BASINIZ \nBİRİM AĞIRLIĞI GİRMEDEN DEVAM ETMEK İÇİN 2'YE BASINIZ :");
                    int deger;
                    deger = tara.nextInt();
                    if (deger == 1) {
                        String adi;
                        String birimAgirligi;
                        double birimFiyati;
                        String detay;
                        System.out.println("ÜRÜN ADINI GİRİNİZ ");
                        adi = tara.next();
                        System.out.println("BİRİM AGIRLIGI GİRİNİZ ");
                        birimAgirligi = tara.next();
                        System.out.println("BİRİM FİYATI GİRİNİZ ");
                        birimFiyati = tara.nextDouble();
                        System.out.println("DETAY GİRİNİZ ");
                        detay = tara.next();

                        yeniUrun6.TahilUrunEkle(adi, birimAgirligi, birimFiyati, detay, urun5);
                        Yazdir(urun1, urun2, urun3, urun4, urun5);
                    } else if (deger == 2) {
                        String adi;
                        int StokMiktari;
                        double birimFiyati;

                        System.out.println("ÜRÜN ADINI GİRİNİZ ");
                        adi = tara.next();
                        System.out.println("STOK MİKTARINI DIGİRİNİZ ");
                        StokMiktari = tara.nextInt();
                        System.out.println("BİRİM FİYATI GİRİNİZ ");
                        birimFiyati = tara.nextDouble();

                        yeniUrun6.TahilUrunEkle(adi, birimFiyati, StokMiktari, urun5);
                        Yazdir(urun1, urun2, urun3, urun4, urun5);
                    }
                    break;

                case 8:
                	System.out.println("ÇIKIŞ İŞLEMİ YAPILDI");
                	return;
                   

            }
        }

    }

    protected static void Yazdir(ArrayList<Beverages_2137> urun1, ArrayList<Condiments_2137> urun2,
            ArrayList<Confections_2137> urun3,
            ArrayList<DairyProducts_2137> urun4, ArrayList<Cereals_2137> urun5) {
        System.out.println();
        for (Beverages_2137 urun : urun1) {
            System.out.println(urun.adi + "\t" + urun.kategoriIndex + "\t" + urun.birimAgirligi + "\t"
                    + urun.birimFiyati + "\t" + urun.stokMiktari + "\t" + urun.kategoriAdi + "\t" + urun.detay);
        }

        for (Condiments_2137 urunx : urun2) {
            System.out.println(urunx.adi + "\t" + urunx.kategoriIndex + "\t" + urunx.birimAgirligi + "\t"
                    + urunx.birimFiyati + "\t" + urunx.stokMiktari + "\t" + urunx.kategoriAdi + "\t" + urunx.detay);
        }

        for (Confections_2137 urun : urun3) {
            System.out.println(urun.adi + "\t" + urun.kategoriIndex + "\t" + urun.birimAgirligi + "\t"
                    + urun.birimFiyati + "\t" + urun.stokMiktari + "\t" + urun.kategoriAdi + "\t" + urun.detay);
        }

        for (DairyProducts_2137 urun : urun4) {
            System.out.println(urun.adi + "\t" + urun.kategoriIndex + "\t" + urun.birimAgirligi + "\t"
                    + urun.birimFiyati + "\t" + urun.stokMiktari + "\t" + urun.kategoriAdi + "\t" + urun.detay);
        }

        for (Cereals_2137 urun : urun5) {
            System.out.println(urun.adi + "\t" + urun.kategoriIndex + "\t" + urun.birimAgirligi + "\t"
                    + urun.birimFiyati + "\t" + urun.stokMiktari + "\t" + urun.kategoriAdi + "\t" + urun.detay);
        }

    }

}
