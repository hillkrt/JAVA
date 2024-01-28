import java.util.Scanner;

public class Main_2137 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Bir cümle girin: ");
		String cumle = scanner.nextLine();

		String[] kelimeler = CumlelereAyir_2137(cumle);
		System.out.println("Girilen cümledeki kelimeler:");

		for (String kelime : kelimeler) {
			System.out.println(kelime);
		}

		System.out.println("Hecelere ayrılacak kelimeler:");

		for (String kelime : kelimeler) {
			System.out.println("Kelime: " + kelime);
			String[] heceler = HecelereAyir_2137(kelime);
			System.out.print("Heceler: ");
			for (int i = 0; i < heceler.length; i++) {
				System.out.print(heceler[i]);
				if (i < heceler.length - 1) {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

	public static String[] CumlelereAyir_2137(String cumle) {
		return cumle.split(" ");
	}

	public static String[] HecelereAyir_2137(String kelime) {

		String[] heceler = new String[kelime.length()];
		int heceSayisi = 0;
		int index = 0;

		while (index < kelime.length()) {
			int nextVowelIndex = SonrakiUnluIndeksiBul_2137(kelime, index);

			if (nextVowelIndex == -1) {
				heceler[heceSayisi] = kelime.substring(index);
				break;
			}

			int nextConsonantIndex = SonrakiUnsuzIndeksiBul_2137(kelime, nextVowelIndex + 1);

			if (nextConsonantIndex == -1) {
				heceler[heceSayisi] = kelime.substring(index);
				break;
			}

			heceler[heceSayisi] = kelime.substring(index, nextConsonantIndex + 1);
			index = nextConsonantIndex + 1;
			heceSayisi++;
		}

		if (index < kelime.length()) {
			heceler[heceSayisi] = kelime.substring(index);
			heceSayisi++;
		}

		String[] sonuc = new String[heceSayisi];
		for (int i = 0; i < heceSayisi; i++) {
			sonuc[i] = heceler[i];
		}

		return sonuc;
	}

	public static int SonrakiUnluIndeksiBul_2137(String kelime, int baslangicIndex) {
		for (int i = baslangicIndex; i < kelime.length(); i++) {
			char karakter = kelime.charAt(i);
			if (UnluMu_2137(karakter)) {
				return i;
			}
		}
		return -1;
	}

	public static int SonrakiUnsuzIndeksiBul_2137(String kelime, int baslangicIndex) {
		for (int i = baslangicIndex; i < kelime.length(); i++) {
			char karakter = kelime.charAt(i);
			if (!UnluMu_2137(karakter)) {
				return i;
			}
		}
		return -1;
	}

	public static boolean UnluMu_2137(char karakter) {
		karakter = Character.toLowerCase(karakter);
		return karakter == 'a' || karakter == 'e' || karakter == 'ı' || karakter == 'i' || karakter == 'o'
				|| karakter == 'ö' || karakter == 'u' || karakter == 'ü';
	}
}
