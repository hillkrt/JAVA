import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main_2137 {

    public static void main(String[] args) throws IOException {

        ArrayList<Urun_2137.Beverages_2137> urun1 = new ArrayList<>();
        ArrayList<Urun_2137.Condiments_2137> urun2 = new ArrayList<>();
        ArrayList<Urun_2137.Confections_2137> urun3 = new ArrayList<>();
        ArrayList<Urun_2137.DairyProducts_2137> urun4 = new ArrayList<>();
        ArrayList<Urun_2137.Cereals_2137> urun5 = new ArrayList<>();

        DosyaIslemleri_2137.DosyaOkuma.ListeleriOlustur(urun1, urun2, urun3, urun4, urun5, "Urunler.txt",
                "UrunGrubu.txt");

        Scanner input = new Scanner(System.in);
        int secim1;
        do {

            System.out.print("1: UrunStokGuncelle\r\n"
            		+ "2: UrunKategorikIndirimYap\r\n"
            		+ "3. IcecekUrunuSil\r\n"
            		+ "4. CesniUrunEkle\r\n"
            		+ "5. SekerlemeDetayEkle\r\n"
            		+ "6. SutUrunuStokGuncelle\r\n"
            		+ "7. TahilBirimAgirlikGuncelle\r\n"
            		+ "8. DosyayaYaz\r\n"
            		+ "9. Çıkış ");
            boolean sonuc = true;
            secim1 = input.nextInt();
            System.out.println();
            Urun_2137 yUrun = new Urun_2137();
            switch (secim1) {
                case 1:
                    Yazdir(urun1, urun2, urun3, urun4, urun5);
                    String urunAdi;
                    boolean ekleMi;
                    System.out.println("STOĞUNU GÜNCELLEMEK İSTEDİĞİNİZ ÜRÜNÜN ADINI GİRİNİZ :  ");
                    urunAdi=input.next();
                    System.out.println("EKLEME YAPMAK İSTİYORSANIZ TRUE YAZINIZ ÇIKARMA YAPMAK İSTİYORSANIZ FALSE YAZINIZ :" );
                    ekleMi=input.nextBoolean();
                    yUrun.UrunStokGuncelle(urunAdi,ekleMi,urun1,urun2,urun3,urun4,urun5);
                    Yazdir(urun1, urun2, urun3, urun4, urun5);
                    break;

                case 2:
                	Yazdir(urun1, urun2, urun3, urun4, urun5);
    				System.out.print("\nKategorik indirim yapmak istediginiz kategorinin adini giriniz : ");
    				input.nextLine();
    				String kategoriAdi = input.nextLine();
    				System.out.print("% kac indirim yapmak istiyorsunuz : ");
    				int X = input.nextInt();
    				sonuc = yUrun.UrunKategorikIndirimYap(kategoriAdi, X, urun1, urun2, urun3, urun4, urun5);
    				if(sonuc == true) Yazdir(urun1, urun2, urun3, urun4, urun5);
    				break;
             
                case 3:
                    String UrunAdi;
                    System.out.println("SİLMEK İSTEDİĞİNİZ ÜRÜNÜN ADINI GİRİNİZ : ");
                    UrunAdi=input.next();
                    Urun_2137.Beverages_2137 yUrun1 = new Urun_2137.Beverages_2137();
                    yUrun1.IcecekUrunuSil(UrunAdi, urun1);
                    TekliYazdir(1, urun1, urun2, urun3, urun4, urun5);

                    break;

                case 4:
                	TekliYazdir(2, urun1, urun2, urun3, urun4, urun5);
                	String Adi,BirimAgirligi,KategoriDetay,Detay;
                	int StokMiktari;
                	double BirimFiyati;
                	System.out.println("ÜRÜN ADINI GİRİNİZ : ");
                	Adi=input.next();
                	System.out.println("BİRİM AĞIRLIĞINI GİRİNİZ : ");
                	BirimAgirligi=input.next();
                	System.out.println("BİRİM FİYATI GİRİNİZ : ");
                	BirimFiyati=input.nextDouble();
                	System.out.println("STOK MİKTARINI GİRİNİZ : ");
                	StokMiktari=input.nextInt();
                	System.out.println("KATEGORİ DETAYI GİRİNİZ :");
                	KategoriDetay=input.next();
                	System.out.println("DETAY GİRİNİZ : ");
                	Detay=input.next();
                	Urun_2137.Condiments_2137 yUrun2 = new Urun_2137.Condiments_2137();
                	yUrun2.CesniUrunEkle(Adi, secim1, BirimAgirligi, BirimFiyati, StokMiktari, KategoriDetay, Detay, urun2);
                	TekliYazdir(2, urun1, urun2, urun3, urun4, urun5);
                    break;

                case 5:
                	TekliYazdir(2, urun1, urun2, urun3, urun4, urun5);
                	String detayEkle;
                	System.out.println("EKLEMEK İSTEDİĞİNİZ DETAYI YAZINIZ : ");
                	detayEkle=input.next();
                	Urun_2137.Confections_2137 yUrun3 = new Urun_2137.Confections_2137();
                	yUrun3.SekerlemeDetayEkle(detayEkle,urun3);
                	TekliYazdir(3, urun1, urun2, urun3, urun4, urun5);
                    break;

                case 6:
                	TekliYazdir(4, urun1, urun2, urun3, urun4, urun5);
                	boolean satisMi;
                	int miktar;
                	System.out.println("SATIŞ İSE TRUE YAZIN DEĞİLSE FALSE YAZIN");
                	satisMi=input.nextBoolean();
                	System.out.println("MİKTARI GİRİNİZ : ");
                	miktar=input.nextInt();
                	Urun_2137.DairyProducts_2137 yUrun4 = new Urun_2137.DairyProducts_2137();
                	yUrun4.SutUrunuStokGuncelle(satisMi,miktar,urun4);
                	TekliYazdir(4, urun1, urun2, urun3, urun4, urun5);
                    break;

                case 7:
                    TekliYazdir(5, urun1, urun2, urun3, urun4, urun5);
                    int yeniFiyat;
                    System.out.println("YENİ FİYATİ GİRİNİZ : ");
                    yeniFiyat=input.nextInt();
                    Urun_2137.Cereals_2137 yUrun5 = new Urun_2137.Cereals_2137();
                    yUrun5.TahilBirimFiyatGuncelle(yeniFiyat, urun5);
                    TekliYazdir(5, urun1, urun2, urun3, urun4, urun5);
                    break;

                case 8:
                    DosyaIslemleri_2137.DosyayaYazma.ListeyiYaz();
                    System.out.println("Dosyaya yazma islemi tamamlandi.");
                    break;

                default:
                    if (secim1 != 9)
                        System.out.println("Gecersiz islem numarasi girdiniz !!");
                    else {
                        System.out.println("Cikis yaptiniz !!");
                        Yazdir(urun1, urun2, urun3, urun4, urun5);

                    }
                    break;
            }
        } while (secim1 != 9);
    }

    private static void TekliYazdir(int secim1, ArrayList<Urun_2137.Beverages_2137> urun1,
            ArrayList<Urun_2137.Condiments_2137> urun2, ArrayList<Urun_2137.Confections_2137> urun3,
            ArrayList<Urun_2137.DairyProducts_2137> urun4, ArrayList<Urun_2137.Cereals_2137> urun5) {

        System.out.println();
        if (secim1 == 1) {
            int sayac1 = 1;
            for (Urun_2137.Beverages_2137 urun : urun1) {
                System.out.println(sayac1 + ". " + urun.adi + "\t" + urun.kategoriIndex + "\t" + urun.birimAgirligi
                        + "\t" + urun.birimFiyati +
                        "\t" + urun.stokMiktari + "\t" + urun.kategoriAdi + "\t" + urun.detay);
                sayac1++;
            }
        }

        else if (secim1 == 2) {
            int sayac2 = 1;
            for (Urun_2137.Condiments_2137 urun : urun2) {
                System.out.println(sayac2 + " \t" + urun.adi + "\t" + urun.kategoriIndex + "\t" + urun.birimAgirligi
                        + "\t" + urun.birimFiyati +
                        "\t" + urun.stokMiktari + "\t" + urun.kategoriAdi + "\t" + urun.detay);
                sayac2++;
            }
        }

        else if (secim1 == 3) {
            int sayac3 = 1;
            for (Urun_2137.Confections_2137 urun : urun3) {
                System.out.println(sayac3 + ". " + urun.adi + "\t" + urun.kategoriIndex + "\t" + urun.birimAgirligi
                        + "\t" + urun.birimFiyati +
                        "\t" + urun.stokMiktari + "\t" + urun.kategoriAdi + "\t" + urun.detay);
                sayac3++;
            }
        }

        else if (secim1 == 4) {
            int sayac4 = 1;
            for (Urun_2137.DairyProducts_2137 urun : urun4) {
                System.out.println(sayac4 + ". " + urun.adi + "\t" + urun.kategoriIndex + "\t" + urun.birimAgirligi
                        + "\t" + urun.birimFiyati +
                        "\t" + urun.stokMiktari + "\t" + urun.kategoriAdi + "\t" + urun.detay);
                sayac4++;
            }
        }

        else {
            int sayac5 = 1;
            for (Urun_2137.Cereals_2137 urun : urun5) {
                System.out.println(sayac5 + ". " + urun.adi + "\t" + urun.kategoriIndex + "\t" + urun.birimAgirligi
                        + "\t" + urun.birimFiyati +
                        "\t" + urun.stokMiktari + "\t" + urun.kategoriAdi + "\t" + urun.detay);
                sayac5++;
            }
        }

        System.out.println();
    }

    protected static void Yazdir(ArrayList<Urun_2137.Beverages_2137> urun1,
            ArrayList<Urun_2137.Condiments_2137> urun2, ArrayList<Urun_2137.Confections_2137> urun3,
            ArrayList<Urun_2137.DairyProducts_2137> urun4, ArrayList<Urun_2137.Cereals_2137> urun5) {
        System.out.println();
        for (Urun_2137.Beverages_2137 urun : urun1) {
            System.out.println(
                    urun.adi + "\t" + urun.kategoriIndex + "\t" + urun.birimAgirligi + "\t" + urun.birimFiyati +
                            "\t" + urun.stokMiktari + "\t" + urun.kategoriAdi + "\t" + urun.detay);
        }

        for (Urun_2137.Condiments_2137 urun : urun2) {
            System.out.println(
                    urun.adi + "\t" + urun.kategoriIndex + "\t" + urun.birimAgirligi + "\t" + urun.birimFiyati +
                            "\t" + urun.stokMiktari + "\t" + urun.kategoriAdi + "\t" + urun.detay);
        }

        for (Urun_2137.Confections_2137 urun : urun3) {
            System.out.println(
                    urun.adi + "\t" + urun.kategoriIndex + "\t" + urun.birimAgirligi + "\t" + urun.birimFiyati +
                            "\t" + urun.stokMiktari + "\t" + urun.kategoriAdi + "\t" + urun.detay);
        }

        for (Urun_2137.DairyProducts_2137 urun : urun4) {
            System.out.println(
                    urun.adi + "\t" + urun.kategoriIndex + "\t" + urun.birimAgirligi + "\t" + urun.birimFiyati +
                            "\t" + urun.stokMiktari + "\t" + urun.kategoriAdi + "\t" + urun.detay);
        }

        for (Urun_2137.Cereals_2137 urun : urun5) {
            System.out.println(
                    urun.adi + "\t" + urun.kategoriIndex + "\t" + urun.birimAgirligi + "\t" + urun.birimFiyati +
                       "\t" + urun.stokMiktari + "\t" + urun.kategoriAdi + "\t" + urun.detay);
        }
    }
}
