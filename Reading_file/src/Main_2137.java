import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_2137 {

	public static void main(String[] args) throws IOException {

		List<Beverages_2137> urun1 = new ArrayList<>();
		List<Cereals_2137> urun2 = new ArrayList<>();
		List<Condiments_2137> urun3 = new ArrayList<>();
		List<Confections_2137> urun4 = new ArrayList<>();
		List<DairyProdcts_2137> urun5 = new ArrayList<>();

		FileReader file = new FileReader("Urunler.txt");
		BufferedReader bReader = new BufferedReader(file);
		FileReader file2 = new FileReader("UrunGrubu.txt");
		BufferedReader bReader2 = new BufferedReader(file2);

		String satir;

		ArrayList<String> list = new ArrayList<>();

		String line2 = bReader2.readLine();
		line2 = bReader2.readLine();
		String[] array2 = null;
		String[] temp = null;

		while (line2 != null) {
			temp = line2.split("\t");
			list.add(temp[0]);
			list.add(temp[1]);
			list.add(temp[2]);
			line2 = bReader2.readLine();
		}

		String line1 = bReader.readLine();
		line1 = bReader.readLine();

		do {
			String[] array = line1.split("\t");

			if (Integer.valueOf(array[1]) == 1) {
				Beverages_2137 urun = new Beverages_2137();
				urun.setAdi(array[0]);
				urun.setKategoriIndex(Integer.valueOf(array[1]));
				urun.setBirimFiyati(Double.valueOf(array[3]));
				urun.setStokMiktari(Integer.valueOf(array[4]));
				urun.setBirimAgirligi(array[2]);
				urun.setKategoriAdi(list.get(1));
				urun.setDetay(list.get(2));
				urun1.add(urun);
				urun = null;
			} else if (Integer.valueOf(array[1]) == 2) {

				Cereals_2137 urun = new Cereals_2137();
				urun.setAdi(array[0]);
				urun.setKategoriIndex(Integer.valueOf(array[1]));
				urun.setBirimFiyati(Double.valueOf(array[3]));
				urun.setStokMiktari(Integer.valueOf(array[4]));
				urun.setBirimAgirligi(array[2]);
				urun.setKategoriAdi(list.get(3));
				urun.setDetay(list.get(4));

				urun2.add(urun);
				urun = null;

			} else if (Integer.valueOf(array[1]) == 3) {

				Condiments_2137 urun = new Condiments_2137();
				urun.setAdi(array[0]);
				urun.setKategoriIndex(Integer.valueOf(array[1]));
				urun.setBirimFiyati(Double.valueOf(array[3]));
				urun.setStokMiktari(Integer.valueOf(array[4]));
				urun.setBirimAgirligi(array[2]);
				urun.setKategoriAdi(list.get(5));
				urun.setDetay(list.get(6));

				urun3.add(urun);
				urun = null;

			} else if (Integer.valueOf(array[1]) == 4) {

				Confections_2137 urun = new Confections_2137();
				urun.setAdi(array[0]);
				urun.setKategoriIndex(Integer.valueOf(array[1]));
				urun.setBirimFiyati(Double.valueOf(array[3]));
				urun.setStokMiktari(Integer.valueOf(array[4]));
				urun.setBirimAgirligi(array[2]);
				urun.setKategoriAdi(list.get(7));
				urun.setDetay(list.get(8));

				urun4.add(urun);
				urun = null;

			} else {

				DairyProdcts_2137 urun = new DairyProdcts_2137();
				urun.setAdi(array[0]);
				urun.setKategoriIndex(Integer.valueOf(array[1]));
				urun.setBirimFiyati(Double.valueOf(array[3]));
				urun.setStokMiktari(Integer.valueOf(array[4]));
				urun.setBirimAgirligi(array[2]);
				urun.setKategoriAdi(list.get(9));
				urun.setDetay(list.get(10));

				urun5.add(urun);
				urun = null;

			}

			line1 = bReader.readLine();

		} while (line1 != null);
		ListeOlustur(urun1, urun2, urun3, urun4, urun5);

		System.out.println();
		System.out.println("*******************************************************");
		System.out.println();

		int secim;
		Scanner input = new Scanner(System.in);
		System.out.println("1: StokMiktarina Gore Urun Fiyatlari Guncelle\r\n" + "2: Urun Zam Yap\r\n"
				+ "3. Icecek Stoklarini Guncelle\r\n" + "4. Cesni Birim Agirlik Guncelle\r\n" + "5. Sekerleme Detay Ekle\r\n"
				+ "6. Sut Urunlerini Sil\r\n" + "7. Tahil Urun Ekle\r\n" + "8. Çıkış\n");
		while (true) {
			System.out.println("********LÜTFEN BİR SEÇİM YAPINIZ*********");
			secim = input.nextInt();

			switch (secim) {
			case 1:
				System.out.println("Stok Miktarını giriniz : ");
				int stokMiktari = input.nextInt();
				Urun_2137.StokMiktarinaGoreUrunFiyatlariGuncelle(stokMiktari, secim, urun1, urun2, urun3, urun4, urun5);
				ListeOlustur(urun1, urun2, urun3, urun4, urun5);
				break;

			case 2:
				System.out.println("Ne Kadar Zam Yapmak İstiyorsunuz : ");
				int zamx = input.nextInt();
				Urun_2137.UrunZamYap(zamx, urun1, urun2, urun3, urun4, urun5);
				ListeOlustur(urun1, urun2, urun3, urun4, urun5);
				break;

			case 3:
				System.out.println("Stok Miktarını Yazınız :");
				int stok = input.nextInt();
				Beverages_2137.TumIceceklerStokGuncelle(stok, urun1);
				for (Beverages_2137 urun : urun1) {
					System.out.println(urun.Adi + " " + urun.KategoriIndex + " " + urun.BirimAgirligi + " "
							+ urun.BirimFiyati + " " + urun.StokMiktari + " " + urun.KategoriAdi + " " + urun.Detay);
				}
				break;

			case 4:
				for (Condiments_2137 urun : urun3) {
					System.out.println(urun.Adi + " " + urun.KategoriIndex + " " + urun.BirimAgirligi + " "
							+ urun.BirimFiyati + " " + urun.StokMiktari + " " + urun.KategoriAdi + " " + urun.Detay);
				}
				System.out.println("Güncellemek istediğinz çeşni indexini giriniz : ");
				int cesniIndex = input.nextInt();
				System.out.println("Yeni Ağırlığı Giriniz  : ");
				String yeniAgirlik = input.next();
				Condiments_2137.CesniBirimAgirlikGuncelle(cesniIndex, yeniAgirlik, urun3);
				break;

			case 5:
				/* ? */
				for (Confections_2137 urun : urun4) {
					System.out.println(urun.Adi + " " + urun.KategoriIndex + " " + urun.BirimAgirligi + " "
							+ urun.BirimFiyati + " " + urun.StokMiktari + " " + urun.KategoriAdi + " " + urun.Detay);
				}
				System.out.println("Eklemek istediğiniz detayı giriniz : ");
				String yeniDetay = input.next();
				System.out.println("Hangi ürüne detay ekleyeceksiniz : ");
				String detayAd = input.next();
				Confections_2137.SekerlemeDetayEkle(detayAd, yeniDetay, urun4);
				for (Confections_2137 urun : urun4) {
					System.out.println(urun.Adi + " " + urun.KategoriIndex + " " + urun.BirimAgirligi + " "
							+ urun.BirimFiyati + " " + urun.StokMiktari + " " + urun.KategoriAdi + " " + urun.Detay);
				}
				break;

			case 6:
				for (DairyProdcts_2137 urun : urun5) {
					System.out.println(urun.Adi + " " + urun.KategoriIndex + " " + urun.BirimAgirligi + " "
							+ urun.BirimFiyati + " " + urun.StokMiktari + " " + urun.KategoriAdi + " " + urun.Detay);
				}
				System.out.println("Minimum değeri giriniz : ");
				int min = input.nextInt();
				System.out.println("Maximum değerini giriniz : ");
				int max = input.nextInt();
				DairyProdcts_2137.SutUrunuSil(min, max, urun5);
				for (DairyProdcts_2137 urun : urun5) {
					System.out.println(urun.Adi + " " + urun.KategoriIndex + " " + urun.BirimAgirligi + " "
							+ urun.BirimFiyati + " " + urun.StokMiktari + " " + urun.KategoriAdi + " " + urun.Detay);
				}
				break;

			case 7:
				System.out.println("Ekleme Yapmak İçin Ürün Bilgilerini Giriniz :");
				String eklemeAd = input.next();
				String ekelemeBirimAgirligi = input.next();
				int eklemeBirimFiyati = input.nextInt();
				int eklemeStokMiktari = input.nextInt();
				Cereals_2137.TahilUrunEkle(eklemeAd, ekelemeBirimAgirligi, eklemeBirimFiyati, eklemeStokMiktari, urun2);
				for (Cereals_2137 urun : urun2) {
					System.out.println(urun.Adi + " " + urun.KategoriIndex + " " + urun.BirimAgirligi + " "
							+ urun.BirimFiyati + " " + urun.StokMiktari + " " + urun.KategoriAdi + " " + urun.Detay);
				}
				break;
			case 8:
				break;
			}
		}
	}

	public static void ListeOlustur(List<Beverages_2137> urun1, List<Cereals_2137> urun2, List<Condiments_2137> urun3,
			List<Confections_2137> urun4, List<DairyProdcts_2137> urun5) {

		for (Beverages_2137 urun : urun1) {
			System.out.println(urun.Adi + " " + urun.KategoriIndex + " " + urun.BirimAgirligi + " " + urun.BirimFiyati
					+ " " + urun.StokMiktari + " " + urun.KategoriAdi + " " + urun.Detay);
		}
		System.out.println("\n -------------------------------------------------------------------------");
		for (Cereals_2137 urun : urun2) {
			System.out.println(urun.Adi + " " + urun.KategoriIndex + " " + urun.BirimAgirligi + " " + urun.BirimFiyati
					+ " " + urun.StokMiktari + " " + urun.KategoriAdi + " " + urun.Detay);
		}
		System.out.println("\n -------------------------------------------------------------------------");
		for (Condiments_2137 urun : urun3) {
			System.out.println(urun.Adi + " " + urun.KategoriIndex + " " + urun.BirimAgirligi + " " + urun.BirimFiyati
					+ " " + urun.StokMiktari + " " + urun.KategoriAdi + " " + urun.Detay);
		}
		System.out.println("\n -------------------------------------------------------------------------");
		for (Confections_2137 urun : urun4) {
			System.out.println(urun.Adi + " " + urun.KategoriIndex + " " + urun.BirimAgirligi + " " + urun.BirimFiyati
					+ " " + urun.StokMiktari + " " + urun.KategoriAdi + " " + urun.Detay);
		}
		System.out.println("\n -------------------------------------------------------------------------");
		for (DairyProdcts_2137 urun : urun5) {
			System.out.println(urun.Adi + " " + urun.KategoriIndex + " " + urun.BirimAgirligi + " " + urun.BirimFiyati
					+ " " + urun.StokMiktari + " " + urun.KategoriAdi + " " + urun.Detay);
		}
	}
}