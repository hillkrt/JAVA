import java.util.ArrayList;

public interface IUrun_2137 {

        public void UrunStokGuncelle(int adet, boolean GirisMi, ArrayList<Beverages_2137> urun1,
                        ArrayList<Condiments_2137> urun2,
                        ArrayList<Confections_2137> urun3, ArrayList<DairyProducts_2137> urun4,
                        ArrayList<Cereals_2137> urun5);

        public void UrunIsimGuncelle(String yeniIsim, String yeniDetay, ArrayList<Beverages_2137> urun1,
                        ArrayList<Condiments_2137> urun2,
                        ArrayList<Confections_2137> urun3, ArrayList<DairyProducts_2137> urun4,
                        ArrayList<Cereals_2137> urun5);

        public void UrunSil(int Katsayi, ArrayList<Beverages_2137> urun1,
                        ArrayList<Condiments_2137> urun2,
                        ArrayList<Confections_2137> urun3, ArrayList<DairyProducts_2137> urun4,
                        ArrayList<Cereals_2137> urun5);

        public void YeniUrunEkle(String Adi, int KategoriIndex, String BirimAgirligi, Double BirimFiyati,
                        int StokMiktari,
                        String KategoriDetay, String Detay, ArrayList<Beverages_2137> urun1,
                        ArrayList<Condiments_2137> urun2,
                        ArrayList<Confections_2137> urun3, ArrayList<DairyProducts_2137> urun4,
                        ArrayList<Cereals_2137> urun5);

}
