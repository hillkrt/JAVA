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
                urun.setBirimAgirligi(array[2]);
                urun.setBirimFiyati(Double.valueOf(array[3]));
                urun.setStokMiktari(Integer.valueOf(array[4]));
                urun.setKategoriDetay(list.get(1));
                urun.setDetay(list.get(2));

                urun1.add(urun);
                urun = null;

            } else if (Integer.valueOf(array[1]) == 2) {

                Condiments_2137 urun = new Condiments_2137();
                urun.setAdi(array[0]);
                urun.setKategoriIndex(Integer.valueOf(array[1]));
                urun.setBirimAgirligi(array[2]);
                urun.setBirimFiyati(Double.valueOf(array[3]));
                urun.setStokMiktari(Integer.valueOf(array[4]));
                urun.setKategoriDetay(list.get(4));
                urun.setDetay(list.get(5));

                urun2.add(urun);
                urun = null;

            } else if (Integer.valueOf(array[1]) == 3) {

                Confections_2137 urun = new Confections_2137();
                urun.setAdi(array[0]);
                urun.setKategoriIndex(Integer.valueOf(array[1]));
                urun.setBirimAgirligi(array[2]);
                urun.setBirimFiyati(Double.valueOf(array[3]));
                urun.setStokMiktari(Integer.valueOf(array[4]));
                urun.setKategoriDetay(list.get(7));
                urun.setDetay(list.get(8));

                urun3.add(urun);
                urun = null;

            } else if (Integer.valueOf(array[1]) == 4) {

                DairyProducts_2137 urun = new DairyProducts_2137();
                urun.setAdi(array[0]);
                urun.setKategoriIndex(Integer.valueOf(array[1]));
                urun.setBirimAgirligi(array[2]);
                urun.setBirimFiyati(Double.valueOf(array[3]));
                urun.setStokMiktari(Integer.valueOf(array[4]));
                urun.setKategoriDetay(list.get(10));
                urun.setDetay(list.get(11));

                urun4.add(urun);
                urun = null;

            } else {

                Cereals_2137 urun = new Cereals_2137();
                urun.setAdi(array[0]);
                urun.setKategoriIndex(Integer.valueOf(array[1]));
                urun.setBirimAgirligi(array[2]);
                urun.setBirimFiyati(Double.valueOf(array[3]));
                urun.setStokMiktari(Integer.valueOf(array[4]));
                urun.setKategoriDetay(list.get(13));
                urun.setDetay(list.get(14));

                urun5.add(urun);
                urun = null;

            }

            line1 = reader1.readLine();

        } while (line1 != null);
        Urun_2137 urunbir = new Beverages_2137();
        Urun_2137 uruniki = new Condiments_2137();
        Urun_2137 urunuc = new Confections_2137();
        Urun_2137 urundort = new DairyProducts_2137();
        Urun_2137 urunbes = new Cereals_2137();
        int secim;
        Scanner tara = new Scanner(System.in);
        System.out.println("YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ ");
        System.out.println("1.URUN STOK GUNCELLE");
        System.out.println("2.URUN İSİM GUNCELLE");
        System.out.println("3.URUN SİL");
        System.out.println("4.YENİ ÜRÜN EKLE");
        System.out.println("5.URUN FİYAT GÜNCELLE");
        System.out.println("6.URUN KATEGORİK ZAM YAP");
        System.out.println("7.ÇIKIŞ");
        secim = tara.nextInt();
        switch (secim) {

            case 1:
                System.out.println("Hangi kategoride güncelleme yapmak istiyorsunuz");
                System.out.println("Beverages : 1\r\n" + "Condiments: 2\r\n" + "Confections : 3\r\n"
                        + "DairyProducts: 4\r\n" + "Cereals: 5");

                secim = tara.nextInt();
                switch (secim) {
                    case 1:
                        for (Beverages_2137 u : urun1) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        int adet;
                        boolean girisMi;
                        System.out.println("Adet bilgisiniz giriniz ");
                        adet = tara.nextInt() + 1;
                        System.out.println("GİRİŞ İŞLEMİ İSE TRUE ,DEĞİLSE FALSE YAZINIZ");
                        girisMi = tara.nextBoolean();
                        urunbir.UrunStokGuncelle(adet, girisMi, urun1, urun2, urun3, urun4, urun5);

                        for (Beverages_2137 u : urun1) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        break;
                    case 2:
                        for (Condiments_2137 u : urun2) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        int adet2;
                        boolean girisMi2;
                        System.out.println("Adet bilgisiniz giriniz ");
                        adet2 = tara.nextInt() + 2;
                        System.out.println("GİRİŞ İŞLEMİ İSE TRUE ,DEĞİLSE FALSE YAZINIZ");
                        girisMi2 = tara.nextBoolean();
                        uruniki.UrunStokGuncelle(adet2, girisMi2, urun1, urun2, urun3, urun4, urun5);
                        for (Condiments_2137 u : urun2) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        break;

                    case 3:
                        for (Confections_2137 u : urun3) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        int adet3;
                        System.out.println("Adet bilgisiniz giriniz ");
                        adet3 = tara.nextInt() + 3;
                        System.out.println("GİRİŞ İŞLEMİ İSE TRUE ,DEĞİLSE FALSE YAZINIZ");
                        boolean girisMi3 = tara.nextBoolean();
                        urunuc.UrunStokGuncelle(adet3, girisMi3, urun1, urun2, urun3, urun4, urun5);

                        for (Confections_2137 u : urun3) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        break;
                    case 4:
                        for (DairyProducts_2137 u : urun4) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        int adet4;
                        System.out.println("Adet bilgisiniz giriniz ");
                        adet4 = tara.nextInt() + 4;
                        System.out.println("GİRİŞ İŞLEMİ İSE TRUE ,DEĞİLSE FALSE YAZINIZ");
                        boolean girisMi4 = tara.nextBoolean();
                        urundort.UrunStokGuncelle(adet4, girisMi4, urun1, urun2, urun3, urun4, urun5);

                        for (DairyProducts_2137 u : urun4) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        break;
                    case 5:
                        for (Cereals_2137 u : urun5) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        int adet5;
                        System.out.println("Adet bilgisiniz giriniz ");
                        adet5 = tara.nextInt() + 5;
                        System.out.println("GİRİŞ İŞLEMİ İSE TRUE ,DEĞİLSE FALSE YAZINIZ");
                        boolean girisMi5 = tara.nextBoolean();
                        urunbes.UrunStokGuncelle(adet5, girisMi5, urun1, urun2, urun3, urun4, urun5);

                        for (Cereals_2137 u : urun5) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        break;
                }
                break;
            case 2:

                break;
            case 3:
                System.out.println("Hangi kategoride silme işlemi yapmak istiyorsuuz ");
                System.out.println("Beverages : 1\r\n" + "Condiments: 2\r\n" + "Confections : 3\r\n"
                        + "DairyProducts: 4\r\n" + "Cereals: 5");
                int katsayi;
                katsayi = tara.nextInt();

                switch (katsayi) {
                    case 1:
                        Yazdir(urun1, urun2, urun3, urun4, urun5);
                        urunbir.UrunSil(katsayi, urun1, urun2, urun3, urun4, urun5);
                        Yazdir(urun1, urun2, urun3, urun4, urun5);
                        break;
                    case 2:
                        Yazdir(urun1, urun2, urun3, urun4, urun5);
                        uruniki.UrunSil(katsayi, urun1, urun2, urun3, urun4, urun5);
                        Yazdir(urun1, urun2, urun3, urun4, urun5);
                        break;
                    case 3:
                        Yazdir(urun1, urun2, urun3, urun4, urun5);
                        urunuc.UrunSil(katsayi, urun1, urun2, urun3, urun4, urun5);
                        Yazdir(urun1, urun2, urun3, urun4, urun5);
                        break;
                    case 4:
                        Yazdir(urun1, urun2, urun3, urun4, urun5);
                        urundort.UrunSil(katsayi, urun1, urun2, urun3, urun4, urun5);
                        Yazdir(urun1, urun2, urun3, urun4, urun5);
                        break;
                    case 5:
                        Yazdir(urun1, urun2, urun3, urun4, urun5);
                        urunbes.UrunSil(katsayi, urun1, urun2, urun3, urun4, urun5);
                        Yazdir(urun1, urun2, urun3, urun4, urun5);
                        break;
                }
                break;

            case 4:
                System.out.println("Hangi kategoriye ekeleme yapmak istiyorsunuz");
                System.out.println("Beverages : 1\r\n" + "Condiments: 2\r\n" + "Confections : 3\r\n"
                        + "DairyProducts: 4\r\n" + "Cereals: 5");

                secim = tara.nextInt();
                switch (secim) {
                    case 1:
                        for (Beverages_2137 u : urun1) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        String yeniIsim1, yeniKategoriDetay1, yeniDetay1;
                        int yeniKategoriIndex1, yeniStokMiktari;
                        String yeniBirimAgirli1;
                        Double yeniBirimFiyati1;
                        tara.nextLine();
                        System.out.println("YENİ İSMİ GİRİNİZ ");
                        yeniIsim1 = tara.nextLine();
                        System.out.println("YENİ KATEGORİ INDEXİNİ GİRİNİZ ");
                        yeniKategoriIndex1 = tara.nextInt();
                        System.out.println("YENİ BİRİM AĞIRLIĞI GİRİNİZ ");
                        yeniBirimAgirli1 = tara.next();
                        System.out.println("YENİ BİRİM FİYATINI GİRİNİZ ");
                        yeniBirimFiyati1 = tara.nextDouble();
                        System.out.println("YENİ STOK MİKTARINI GİRİNİZ ");
                        yeniStokMiktari = tara.nextInt();
                        System.out.println("YENİ KATEGORİ DETAYINI GİRİNİZ ");
                        yeniKategoriDetay1 = tara.nextLine();
                        System.out.println("YENİ DETAY BİLGİSİNİ GİİNİZ ");
                        yeniDetay1 = tara.nextLine();

                        urunbir.YeniUrunEkle(yeniIsim1, yeniKategoriIndex1, yeniBirimAgirli1, yeniBirimFiyati1,
                                yeniStokMiktari,
                                yeniKategoriDetay1, yeniDetay1, urun1, urun2, urun3, urun4, urun5);

                        for (Beverages_2137 u : urun1) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        break;
                    case 2:
                        for (Condiments_2137 u : urun2) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        String yeniIsim2, yeniKategoriDetay2, yeniDetay2;
                        int yeniKategoriIndex2, yeniStokMiktari2;
                        String yeniBirimAgirli2;
                        Double yeniBirimFiyati2;
                        tara.nextLine();
                        System.out.println("YENİ İSMİ GİRİNİZ ");
                        yeniIsim2 = tara.nextLine();
                        System.out.println("YENİ KATEGORİ INDEXİNİ GİRİNİZ ");
                        yeniKategoriIndex2 = tara.nextInt();
                        System.out.println("YENİ BİRİM AĞIRLIĞI GİRİNİZ ");
                        yeniBirimAgirli2 = tara.nextLine();
                        System.out.println("YENİ BİRİM FİYATINI GİRİNİZ ");
                        yeniBirimFiyati2 = tara.nextDouble();
                        System.out.println("YENİ STOK MİKTARINI GİRİNİZ ");
                        yeniStokMiktari2 = tara.nextInt();
                        System.out.println("YENİ KATEGORİ DETAYINI GİRİNİZ ");
                        yeniKategoriDetay2 = tara.nextLine();
                        System.out.println("YENİ DETAY BİLGİSİNİ GİİNİZ ");
                        yeniDetay2 = tara.nextLine();

                        uruniki.YeniUrunEkle(yeniIsim2, yeniKategoriIndex2, yeniBirimAgirli2, yeniBirimFiyati2,
                                yeniStokMiktari2,
                                yeniKategoriDetay2, yeniDetay2, urun1, urun2, urun3, urun4, urun5);

                        for (Condiments_2137 u : urun2) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        break;
                    case 3:
                        for (Confections_2137 u : urun3) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        String yeniIsim3, yeniKategoriDetay3, yeniDetay3;
                        int yeniKategoriIndex3, yeniStokMiktari3;
                        String yeniBirimAgirli3;
                        Double yeniBirimFiyati3;
                        tara.nextLine();
                        System.out.println("YENİ İSMİ GİRİNİZ ");
                        yeniIsim3 = tara.nextLine();
                        System.out.println("YENİ KATEGORİ INDEXİNİ GİRİNİZ ");
                        yeniKategoriIndex3 = tara.nextInt();
                        System.out.println("YENİ BİRİM AĞIRLIĞI GİRİNİZ ");
                        yeniBirimAgirli3 = tara.nextLine();
                        System.out.println("YENİ BİRİM FİYATINI GİRİNİZ ");
                        yeniBirimFiyati3 = tara.nextDouble();
                        System.out.println("YENİ STOK GİRİNİZ ");
                        yeniStokMiktari3 = tara.nextInt();
                        System.out.println("YENİ KATEGORİ DETAYINI GİRİNİZ ");
                        yeniKategoriDetay3 = tara.nextLine();
                        System.out.println("YENİ DETAY BİLGİSİNİ GİİNİZ ");
                        yeniDetay3 = tara.nextLine();

                        urunuc.YeniUrunEkle(yeniIsim3, yeniKategoriIndex3, yeniBirimAgirli3, yeniBirimFiyati3,
                                yeniStokMiktari3,
                                yeniKategoriDetay3, yeniDetay3, urun1, urun2, urun3, urun4, urun5);

                        for (Confections_2137 u : urun3) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        break;
                    case 4:
                        for (DairyProducts_2137 u : urun4) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        String yeniIsim4, yeniKategoriDetay4, yeniDetay4;
                        int yeniKategoriIndex4, yeniStokMiktari4;
                        String yeniBirimAgirli4;
                        Double yeniBirimFiyati4;
                        tara.nextLine();
                        System.out.println("YENİ İSMİ GİRİNİZ ");
                        yeniIsim4 = tara.nextLine();
                        System.out.println("YENİ KATEGORİ INDEXİNİ GİRİNİZ ");
                        yeniKategoriIndex4 = tara.nextInt();
                        System.out.println("YENİ BİRİM AĞIRLIĞI GİRİNİZ ");
                        yeniBirimAgirli4 = tara.nextLine();
                        System.out.println("YENİ BİRİM FİYATINI GİRİNİZ ");
                        yeniBirimFiyati4 = tara.nextDouble();
                        System.out.println("YENİ STOK GİRİNİZ ");
                        yeniStokMiktari4 = tara.nextInt();
                        System.out.println("YENİ KATEGORİ DETAYINI GİRİNİZ ");
                        yeniKategoriDetay4 = tara.nextLine();
                        System.out.println("YENİ DETAY BİLGİSİNİ GİİNİZ ");
                        yeniDetay4 = tara.nextLine();

                        urundort.YeniUrunEkle(yeniIsim4, yeniKategoriIndex4, yeniBirimAgirli4, yeniBirimFiyati4,
                                yeniStokMiktari4,
                                yeniKategoriDetay4, yeniDetay4, urun1, urun2, urun3, urun4, urun5);

                        for (DairyProducts_2137 u : urun4) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        break;
                    case 5:
                        for (Cereals_2137 u : urun5) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        String yeniIsim5, yeniKategoriDetay5, yeniDetay5, yeniBirimAgirli5;
                        int yeniKategoriIndex5, yeniStokMiktari5;
                        Double yeniBirimFiyati5;
                        tara.nextLine();
                        System.out.println("YENİ İSMİ GİRİNİZ ");
                        yeniIsim5 = tara.nextLine();
                        System.out.println("YENİ KATEGORİ INDEXİNİ GİRİNİZ ");
                        yeniKategoriIndex5 = tara.nextInt();
                        System.out.println("YENİ BİRİM AĞIRLIĞI GİRİNİZ ");
                        yeniBirimAgirli5 = tara.nextLine();
                        System.out.println("YENİ BİRİM FİYATINI GİRİNİZ ");
                        yeniBirimFiyati5 = tara.nextDouble();
                        System.out.println("YENİ STOK GİRİNİZ ");
                        yeniStokMiktari5 = tara.nextInt();
                        System.out.println("YENİ KATEGORİ DETAYINI GİRİNİZ ");
                        yeniKategoriDetay5 = tara.nextLine();
                        System.out.println("YENİ DETAY BİLGİSİNİ GİİNİZ ");
                        yeniDetay5 = tara.nextLine();

                        urunbes.YeniUrunEkle(yeniIsim5, yeniKategoriIndex5, yeniBirimAgirli5, yeniBirimFiyati5,
                                yeniStokMiktari5,
                                yeniKategoriDetay5, yeniDetay5, urun1, urun2, urun3, urun4, urun5);

                        for (Cereals_2137 u : urun5) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        break;
                }

            case 5:

                System.out.println("Hangi kategoride silme yapmak istiyorsunuz");
                System.out.println("Beverages : 1\r\n" + "Condiments: 2\r\n" + "Confections : 3\r\n"
                        + "DairyProducts: 4\r\n" + "Cereals: 5");

                secim = tara.nextInt();
                switch (secim) {
                    case 1:
                        for (Beverages_2137 u : urun1) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        int oran;
                        boolean indirimMi;
                        System.out.println("Oran giriniz ");
                        oran = tara.nextInt() + 1;
                        System.out.println("İNDİRİM YAPMAK İSTİYORSANIZ TRUE GİRİNİZ ,İSTEMİYORSANIZ FALSE GİRİNİZ ");
                        indirimMi = tara.nextBoolean();
                        urunbir.UrunFiyatGuncelle(oran, indirimMi, urun1, urun2, urun3, urun4, urun5);
                        for (Beverages_2137 u : urun1) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        break;
                    case 2:
                        for (Condiments_2137 u : urun2) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        int oran2;
                        boolean indirimMi2;
                        System.out.println("Oran giriniz ");
                        oran2 = tara.nextInt() + 2;
                        System.out.println("İNDİRİM YAPMAK İSTİYORSANIZ TRUE GİRİNİZ ,İSTEMİYORSANIZ FALSE GİRİNİZ ");
                        indirimMi2 = tara.nextBoolean();
                        urunbir.UrunFiyatGuncelle(oran2, indirimMi2, urun1, urun2, urun3, urun4, urun5);
                        for (Condiments_2137 u : urun2) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        break;
                    case 3:
                        for (Confections_2137 u : urun3) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        int oran3;
                        boolean indirimMi3;
                        System.out.println("Oran giriniz ");
                        oran3 = tara.nextInt() + 3;
                        System.out.println("İNDİRİM YAPMAK İSTİYORSANIZ TRUE GİRİNİZ ,İSTEMİYORSANIZ FALSE GİRİNİZ ");
                        indirimMi3 = tara.nextBoolean();
                        urunuc.UrunFiyatGuncelle(oran3, indirimMi3, urun1, urun2, urun3, urun4, urun5);
                        for (Confections_2137 u : urun3) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        break;
                    case 4:
                        for (DairyProducts_2137 u : urun4) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        int oran4;
                        boolean indirimMi4;
                        System.out.println("Oran giriniz ");
                        oran4 = tara.nextInt() + 4;
                        System.out.println("İNDİRİM YAPMAK İSTİYORSANIZ TRUE GİRİNİZ ,İSTEMİYORSANIZ FALSE GİRİNİZ ");
                        indirimMi4 = tara.nextBoolean();
                        urundort.UrunFiyatGuncelle(oran4, indirimMi4, urun1, urun2, urun3, urun4, urun5);
                        for (DairyProducts_2137 u : urun4) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        break;
                    case 5:
                        for (Cereals_2137 u : urun5) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        int oran5;
                        boolean indirimMi5;
                        System.out.println("Oran giriniz ");
                        oran5 = tara.nextInt() + 5;
                        System.out.println("İNDİRİM YAPMAK İSTİYORSANIZ TRUE GİRİNİZ ,İSTEMİYORSANIZ FALSE GİRİNİZ ");
                        indirimMi5 = tara.nextBoolean();
                        urunbes.UrunFiyatGuncelle(oran5, indirimMi5, urun1, urun2, urun3, urun4, urun5);
                        for (Cereals_2137 u : urun5) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }

                }
                break;
            case 6:
                System.out.println("Hangi kategoride zam yapmak istiyorsunuz");
                System.out.println("Beverages : 1\r\n" + "Condiments: 2\r\n" + "Confections : 3\r\n"
                        + "DairyProducts: 4\r\n" + "Cereals: 5");

                secim = tara.nextInt();
                switch (secim) {
                    case 1:
                        for (Beverages_2137 u : urun1) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        int X;
                        System.out.println("Zam oranını giriniz ");
                        X = tara.nextInt() + 1;

                        urunbir.UrunKategorikZamYap(X, urun1, urun2, urun3, urun4, urun5);
                        for (Beverages_2137 u : urun1) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        break;
                    case 2:
                        for (Condiments_2137 u : urun2) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        int X2;
                        System.out.println("Zam oranını giriniz ");
                        X2 = tara.nextInt() + 2;
                        uruniki.UrunKategorikZamYap(X2, urun1, urun2, urun3, urun4, urun5);
                        for (Condiments_2137 u : urun2) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        break;
                    case 3:
                        for (Confections_2137 u : urun3) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        int X3;
                        System.out.println("Zam oranını giriniz ");
                        X3 = tara.nextInt() + 3;
                        urunuc.UrunKategorikZamYap(X3, urun1, urun2, urun3, urun4, urun5);
                        for (Confections_2137 u : urun3) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        break;
                    case 4:
                        for (DairyProducts_2137 u : urun4) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        int X4;
                        System.out.println("Zam oranını giriniz ");
                        X4 = tara.nextInt() + 4;
                        urundort.UrunKategorikZamYap(X4, urun1, urun2, urun3, urun4, urun5);
                        for (DairyProducts_2137 u : urun4) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        break;
                    case 5:
                        for (Cereals_2137 u : urun5) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }
                        int X5;
                        System.out.println("Zam oranını giriniz ");
                        X5 = tara.nextInt() + 5;
                        urunbes.UrunKategorikZamYap(X5, urun1, urun2, urun3, urun4, urun5);
                        for (Cereals_2137 u : urun5) {
                            System.out.println(
                                    u.adi + " " + u.kategoriIndex + " " + u.birimAgirligi + " " + u.birimFiyati + " "
                                            + u.stokMiktari + " " + u.kategoriDetay + " " + u.detay);
                        }

                }
                break;
            case 7:
                System.out.println("ÇIKIŞ İŞLEMİ GERÇEKLEŞTİRİLDİ");
                break;
        }
    }

    public static void Yazdir(ArrayList<Beverages_2137> urun1, ArrayList<Condiments_2137> urun2,
            ArrayList<Confections_2137> urun3,
            ArrayList<DairyProducts_2137> urun4, ArrayList<Cereals_2137> urun5) {
        System.out.println();
        for (Beverages_2137 urun : urun1) {
            System.out.println(urun.adi + " " + urun.kategoriIndex + " " + urun.birimAgirligi + " " + urun.birimFiyati
                    + " " + urun.birimAgirligi + " " + urun.kategoriDetay + " " + urun.detay);
        }
        for (Condiments_2137 urun : urun2) {
            System.out.println(urun.adi + " " + urun.kategoriIndex + " " + urun.birimAgirligi + " " + urun.birimFiyati
                    + " " + urun.birimAgirligi + " " + urun.kategoriDetay + " " + urun.detay);
        }
        for (Confections_2137 urun : urun3) {
            System.out.println(urun.adi + " " + urun.kategoriIndex + " " + urun.birimAgirligi + " " + urun.birimFiyati
                    + " " + urun.birimAgirligi + " " + urun.kategoriDetay + " " + urun.detay);
        }
        for (DairyProducts_2137 urun : urun4) {
            System.out.println(urun.adi + " " + urun.kategoriIndex + " " + urun.birimAgirligi + " " + urun.birimFiyati
                    + " " + urun.birimAgirligi + " " + urun.kategoriDetay + " " + urun.detay);
        }
        for (Cereals_2137 urun : urun5) {
            System.out.println(urun.adi + " " + urun.kategoriIndex + " " + urun.birimAgirligi + " " + urun.birimFiyati
                    + " " + urun.birimAgirligi + " " + urun.kategoriDetay + " " + urun.detay);
        }
    }
}
