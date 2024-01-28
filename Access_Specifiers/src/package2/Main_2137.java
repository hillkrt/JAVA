package package2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import package1.Reading_2137;
import package2.Beverages_2137;
import package2.Cereals_2137;
import package2.Condiments_2137;
import package2.Confections_2137;
import package2.DairyProducts_2137;
import package2.Urun_2137;

public class Main_2137 {

	public static void main(String[] args) throws IOException {
		ArrayList<Beverages_2137> urun1 = new ArrayList<>();
		ArrayList<Condiments_2137> urun2 = new ArrayList<>();
		ArrayList<Confections_2137> urun3 = new ArrayList<>();
		ArrayList<DairyProducts_2137> urun4 = new ArrayList<>();
		ArrayList<Cereals_2137> urun5 = new ArrayList<>();

		Reading_2137.listeOlustur("Urunler.txt", "UrunGrubu.txt", urun1, urun2, urun3, urun4, urun5);

		int secim;
		Scanner tara = new Scanner(System.in);
		System.out.println("1:URUNLERİ FİYATA GÖRE SİL");
		System.out.println("2:URUN KATEGORİK STOK GUNCELLE");
		System.out.println("3:İÇECEK BİRİM AĞIRLIĞI GÜNCELLEME");
		System.out.println("4:ÇEŞNİ BİRİM AĞIRLIĞI GÜNCELLEME");
		System.out.println("5:ŞEKERLEME URUN EKLE");
		System.out.println("6:SÜT ÜRÜNLERİ DETAY EKLE");
		System.out.println("7:HUBUBAT SİL");
		System.out.println("8:ÇIKIŞ");
		System.out.println("LÜTFEN BİR SEÇİM YAPINIZ ");
		secim = tara.nextInt();
		switch (secim) {
		case 1:
			UrunleriFiyataGoreSil(urun1, urun2, urun3, urun4, urun5);
			break;
		case 2:
			UrunKategorikStokGuncelle(urun1, urun2, urun3, urun4, urun5);
			break;
		case 3:
			IcecekBirimAgirlikGuncelle(urun1);
			break;
		case 4:
			CesniStokGuncelle(urun2);
			break;
		case 5:
			SekerlemeUrunEkle(urun3);
			break;
		case 6:
			SutUrunleriDetayEkle(urun4);
			break;
		case 7:
			HububatSil(urun5);
			break;
		case 8:
			System.out.println("ÇIKIŞ İŞLEMİ GERÇEKLEŞTİRİLDİ");
			break;
		}
	}

	private  static void UrunleriFiyataGoreSil(ArrayList<Beverages_2137> urun1, ArrayList<Condiments_2137> urun2,
			ArrayList<Confections_2137> urun3, ArrayList<DairyProducts_2137> urun4, ArrayList<Cereals_2137> urun5) {
		Yazdir(urun1, urun2, urun3, urun4, urun5);

		Scanner tara = new Scanner(System.in);
		System.out.println("\nMinumum ifyatı giriniz  :");
		Double MinFiyat = tara.nextDouble();
		System.out.println("Maksimum fiyatı giriniz : ");
		Double MaxFiyat = tara.nextDouble();
		Urun_2137.FiyataGoreSil(MinFiyat, MaxFiyat, urun1, urun2, urun3, urun4, urun5);

		Yazdir(urun1, urun2, urun3, urun4, urun5);
	}

	private static void UrunKategorikStokGuncelle(ArrayList<Beverages_2137> urun1, ArrayList<Condiments_2137> urun2,
			ArrayList<Confections_2137> urun3, ArrayList<DairyProducts_2137> urun4, ArrayList<Cereals_2137> urun5) {
		Yazdir(urun1, urun2, urun3, urun4, urun5);

		Scanner tara = new Scanner(System.in);
		String kategoriAdi;
		int x;
		System.out.println("STOĞUNU GÜNCELLEMEK İSTEDİĞİNİZ KATEGORİNİ ADINI GİRİNİZ");
		kategoriAdi = tara.next();
		System.out.println("GÜNCEL MİKTARINI GİRİNİZ");
		x = tara.nextInt();
		Urun_2137.KategorikStokGuncelle(kategoriAdi, x, urun1, urun2, urun3, urun4, urun5);
		Yazdir(urun1, urun2, urun3, urun4, urun5);
	}

	private static void IcecekBirimAgirlikGuncelle(ArrayList<Beverages_2137> urun1) {
		for (Beverages_2137 urun : urun1) {
			System.out.println(urun.adi + " " + urun.kategoriIndex + " " + urun.birimAgirligi + " " + urun.birimFiyati
					+ " " + urun.stokMiktari + " " + urun.kategoriAdi + " " + urun.detay);
		}

		Scanner tara = new Scanner(System.in);
		String miktar;
		System.out.println("SATIŞ MİKTARINI GİRİNİZ : ");
		miktar = tara.next();
		Beverages_2137.BirimAgirlikGuncelle(miktar, urun1);

		for (Beverages_2137 urun : urun1) {
			System.out.println(urun.adi + " " + urun.kategoriIndex + " " + urun.birimAgirligi + " " + urun.birimFiyati
					+ " " + urun.stokMiktari + " " + urun.kategoriAdi + " " + urun.detay);
		}

	}

	private static void CesniStokGuncelle(ArrayList<Condiments_2137> urun2) {
		for (Condiments_2137 urun : urun2) {
			System.out.println(urun.adi + " " + urun.kategoriIndex + " " + urun.birimAgirligi + " " + urun.birimFiyati
					+ " " + urun.stokMiktari + " " + urun.kategoriAdi + " " + urun.detay);
		}

		Scanner tara = new Scanner(System.in);
		int yeniAgirlik;
		System.out.println("ÇEŞNİNİN YENİ AĞIRLIĞINI GİRİNİZ ");
		yeniAgirlik = tara.nextInt();
		boolean satisMi;
		System.out.println("Satis ise true yazın, satış değil ise false yazın");
		satisMi=tara.nextBoolean();

		Condiments_2137.StokGuncelle(satisMi,yeniAgirlik, urun2);
		for (Condiments_2137 urun : urun2) {
			System.out.println(urun.adi + " " + urun.kategoriIndex + " " + urun.birimAgirligi + " " + urun.birimFiyati
					+ " " + urun.stokMiktari + " " + urun.kategoriAdi + " " + urun.detay);
		}

	}

	private static void SekerlemeUrunEkle(ArrayList<Confections_2137> urun3) {
		for (Confections_2137 urun : urun3) {
			System.out.println(urun.adi + " " + urun.kategoriIndex + " " + urun.birimAgirligi + " " + urun.birimFiyati
					+ " " + urun.stokMiktari + " " + urun.kategoriAdi + " " + urun.detay);
		}
		String Adi; 
		int KategoriIndex; 
		String BirimAgirligi; 
		Double BirimFiyati;
        int StokMiktari; 
        String kategoriAdi; 
        String detay;
		Scanner tara = new Scanner(System.in);
		System.out.println("YENİ ADİ GİRİNİZ: ");
		Adi = tara.next();
		System.out.println("YENİ KATEGORİ INDEX GİRİNİZ: ");
		KategoriIndex = tara.nextInt();
		System.out.println("YENİ BİRİM AĞIRLIĞI GİRİNİZ: ");
		BirimAgirligi = tara.next();
		System.out.println("YENİ BİRİM FİYATI GİRİNİZ: ");
		BirimFiyati = tara.nextDouble();
		System.out.println("YENİ STOK MİKTARINI GİRİNİZ: ");
		StokMiktari = tara.nextInt();
		System.out.println("YENİ KATEGORİ ADİ GİRİNİZ: ");
		kategoriAdi = tara.next();
		System.out.println("YENİ DETAY GİRİNİZ: ");
		detay = tara.next();
		

		Confections_2137.UrunEkle(Adi,KategoriIndex,BirimAgirligi,BirimFiyati,StokMiktari,kategoriAdi,detay, urun3);
		for (Confections_2137 urun : urun3) {
			System.out.println(urun.adi + " " + urun.kategoriIndex + " " + urun.birimAgirligi + " " + urun.birimFiyati
					+ " " + urun.stokMiktari + " " + urun.kategoriAdi + " " + urun.detay);
		}
	}

	private static void SutUrunleriDetayEkle(ArrayList<DairyProducts_2137> urun4) {
		for (DairyProducts_2137 urun : urun4) {
			System.out.println(urun.adi + " " + urun.kategoriIndex + " " + urun.birimAgirligi + " " + urun.birimFiyati
					+ " " + urun.stokMiktari + " " + urun.kategoriAdi + " " + urun.detay);
		}
		String yeniDetay;
		Scanner tara = new Scanner(System.in);
		System.out.println("EKLEMEK İSTEDİĞİNİZ DETAYI BİLGİSİNİ GİRİNİZ :  ");
		yeniDetay = tara.nextLine();

		DairyProducts_2137.UrunDetayEkle(yeniDetay, urun4);
		for (DairyProducts_2137 urun : urun4) {
			System.out.println(urun.adi + " " + urun.kategoriIndex + " " + urun.birimAgirligi + " " + urun.birimFiyati
					+ " " + urun.stokMiktari + " " + urun.kategoriAdi + " " + urun.detay);
		}

	}

	private static void HububatSil(ArrayList<Cereals_2137> urun5) {
		for (Cereals_2137 urun : urun5) {
			System.out.println(urun.adi + " " + urun.kategoriIndex + " " + urun.birimAgirligi + " " + urun.birimFiyati
					+ " " + urun.stokMiktari + " " + urun.kategoriAdi + " " + urun.detay);
		}
		String ad;
		Scanner tara = new Scanner(System.in);
		System.out.println("SİLMEK İSTEDİĞİNİZ ÜRÜNÜN ADINI GİRİNİZ : ");
		ad=tara.next();

		Cereals_2137.Sil(ad,urun5);

		for (Cereals_2137 urun : urun5) {
			System.out.println(urun.adi + " " + urun.kategoriIndex + " " + urun.birimAgirligi + " " + urun.birimFiyati
					+ " " + urun.stokMiktari + " " + urun.kategoriAdi + " " + urun.detay);
		}
	}

	protected static void Yazdir(ArrayList<Beverages_2137> urun1, ArrayList<Condiments_2137> urun2, ArrayList<Confections_2137> urun3,
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