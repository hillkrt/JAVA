import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class DosyaIslemleri_2137 {

    public static class DosyaOkuma {

        public static void ListeleriOlustur(ArrayList<Urun_2137.Beverages_2137> urun1,
                ArrayList<Urun_2137.Condiments_2137> urun2, ArrayList<Urun_2137.Confections_2137> urun3,
                ArrayList<Urun_2137.DairyProducts_2137> urun4, ArrayList<Urun_2137.Cereals_2137> urun5, String dosya1,
                String dosya2)
                throws IOException {

            FileReader file1 = new FileReader(dosya1);
            BufferedReader reader1 = new BufferedReader(file1);
            FileReader file2 = new FileReader(dosya2);
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

                    Urun_2137.Beverages_2137 urun = new Urun_2137.Beverages_2137(array[0], Integer.valueOf(array[1]),
                            array[2],
                            Double.valueOf(array[3]),
                            Integer.valueOf(array[4]), list.get(1), list.get(2));

                    urun1.add(urun);
                    urun = null;

                } else if (Integer.valueOf(array[1]) == 2) {

                    Urun_2137.Condiments_2137 urun = new Urun_2137.Condiments_2137(array[0], Integer.valueOf(array[1]),
                            array[2],
                            Double.valueOf(array[3]),
                            Integer.valueOf(array[4]), list.get(4), list.get(5));

                    urun2.add(urun);
                    urun = null;

                } else if (Integer.valueOf(array[1]) == 3) {

                    Urun_2137.Confections_2137 urun = new Urun_2137.Confections_2137(array[0],
                            Integer.valueOf(array[1]), array[2],
                            Double.valueOf(array[3]),
                            Integer.valueOf(array[4]), list.get(7), list.get(8));

                    urun3.add(urun);
                    urun = null;

                } else if (Integer.valueOf(array[1]) == 4) {

                    Urun_2137.DairyProducts_2137 urun = new Urun_2137.DairyProducts_2137(array[0],
                            Integer.valueOf(array[1]), array[2],
                            Double.valueOf(array[3]),
                            Integer.valueOf(array[4]), list.get(10), list.get(11));

                    urun4.add(urun);
                    urun = null;

                } else {

                    Urun_2137.Cereals_2137 urun = new Urun_2137.Cereals_2137(array[0], Integer.valueOf(array[1]),
                            array[2],
                            Double.valueOf(array[3]),
                            Integer.valueOf(array[4]), list.get(13), list.get(14));

                    urun5.add(urun);
                    urun = null;

                }
                line1 = reader1.readLine();

            } while (line1 != null);

        }
    }

    public static class DosyayaYazma {

        public static void ListeyiYaz() throws IOException {

            FileWriter fwriter = new FileWriter("Urunler.txt", true);
            BufferedWriter buffwriter = new BufferedWriter(fwriter);

            Scanner input = new Scanner(System.in);
            System.out.println("Cereals listesinde eklemek istediginiz yeni urunun adini giriniz : ");
            String ad2 = input.nextLine();
            System.out.println("Yeni urunun birim agirligini giriniz : ");
            String yeniAgirlik2 = input.nextLine();
            System.out.println("Yeni urunun birim fiyatini giriniz : ");
            Double yeniFiyat = input.nextDouble();
            System.out.println("Yeni urunun stok miktarini giriniz : ");
            int yeniStok = input.nextInt();
            System.out.println(
                    "Eklemek istediginiz urunu hangi kategoriye eklemek istiyorsaniz o kategorinin indexini yazniniz : ");
            int index = input.nextInt();

            Urun_2137 yUrun = new Urun_2137(ad2, index, yeniAgirlik2, yeniFiyat, yeniStok);

            buffwriter.write(ad2 + "\t" + index + "\t" + yeniAgirlik2 + "\t" + yeniFiyat + "\t" + yeniStok);
            buffwriter.close();
            fwriter.close();
        }
    }

}
