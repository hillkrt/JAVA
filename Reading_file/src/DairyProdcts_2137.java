	import java.util.ArrayList;
import java.util.List;

	public class DairyProdcts_2137 extends Urun_2137 {
		String KategoriAdi;
		String Detay;

		public DairyProdcts_2137() {

		}

		public String getKategoriAdi() {
			return KategoriAdi;
		}

		public void setKategoriAdi(String kategoriAdi) {
			KategoriAdi = kategoriAdi;
		}

		public String getDetay() {
			return Detay;
		}

		public void setDetay(String detay) {
			Detay = detay;
		}
		
		public static void SutUrunuSil(int minFiyat,int maxFiyat,List<DairyProdcts_2137> urun5) {
			List<DairyProdcts_2137> temp= new ArrayList<>();
			for (DairyProdcts_2137 urun : urun5) {
				if(!(minFiyat<urun.BirimFiyati&&urun.BirimFiyati<maxFiyat)) {
					temp.add(urun);
				}
			}
			urun5.clear();
			urun5.addAll(temp);
		}
	}

