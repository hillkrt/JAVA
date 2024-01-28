package package1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import package2.Beverages_2137;
import package2.Cereals_2137;
import package2.Condiments_2137;
import package2.Confections_2137;
import package2.DairyProducts_2137;

public class Reading_2137 {

	public static void listeOlustur(String Urunler, String UrunGrubu, ArrayList<Beverages_2137> urun1,
			ArrayList<Condiments_2137> urun2, ArrayList<Confections_2137> urun3, ArrayList<DairyProducts_2137> urun4,
			ArrayList<Cereals_2137> urun5) throws IOException {
		FileReader file1 = new FileReader("Urunler.txt");
		BufferedReader reader1 = new BufferedReader(file1);
		FileReader file2 = new FileReader("UrunGrubu.txt");
		BufferedReader reader2 = new BufferedReader(file2);

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
				System.out.println(array[2]);
				Beverages_2137 urun = new Beverages_2137 (array[0], Integer.valueOf(array[1]), array[2], Double.valueOf(array[3]),
						Integer.valueOf(array[4]), list.get(1), list.get(2));

				urun1.add(urun);
				urun = null;

			} else if (Integer.valueOf(array[1]) == 2) {

				Condiments_2137 urun = new Condiments_2137(array[0], Integer.valueOf(array[1]), array[2], Double.valueOf(array[3]),
						Integer.valueOf(array[4]), list.get(4), list.get(5));

				urun2.add(urun);
				urun = null;

			} else if (Integer.valueOf(array[1]) == 3) {

				Confections_2137 urun = new Confections_2137(array[0], Integer.valueOf(array[1]), array[2], Double.valueOf(array[3]),
						Integer.valueOf(array[4]), list.get(7), list.get(8));

				urun3.add(urun);
				urun = null;

			} else if (Integer.valueOf(array[1]) == 4) {

				DairyProducts_2137 urun = new DairyProducts_2137(array[0], Integer.valueOf(array[1]), array[2], Double.valueOf(array[3]),
						Integer.valueOf(array[4]), list.get(10), list.get(11));

				urun4.add(urun);
				urun = null;

			} else {

				Cereals_2137 urun = new Cereals_2137(array[0], Integer.valueOf(array[1]), array[2],Double.valueOf(array[3]),
						Integer.valueOf(array[4]), list.get(13), list.get(14));

				urun5.add(urun);
				urun = null;

			}
			line1 = reader1.readLine();

		} while (line1 != null);

	}
}
