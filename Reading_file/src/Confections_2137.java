import java.util.List;

public class Confections_2137 extends Urun_2137{
	String KategoriAdi;
	String Detay;
	public Confections_2137() {
		
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
	
	
	public static void SekerlemeDetayEkle(String adi,String yeniDetay,List<Confections_2137>urun4) {
		for (Confections_2137 urun : urun4) {
			if(urun.Adi.equals(adi)) {
				urun.Detay+=yeniDetay;
			}
			
		}
	}
}
