	import java.util.List;

	public class Cereals_2137 extends Urun_2137 {
		String KategoriAdi;
		String Detay;

		public Cereals_2137() {

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
		
		public static void TahilUrunEkle(String Adi,String BirimAgirligi,int BirimFiyati,int StokMiktari, List<Cereals_2137> urun2) {
			Cereals_2137 urun = new Cereals_2137();
			urun.setAdi(Adi);
			urun.setBirimAgirligi(BirimAgirligi);
			urun.setBirimFiyati(BirimFiyati);
			urun.setStokMiktari(StokMiktari);

			urun2.add(urun);
		}
	}

