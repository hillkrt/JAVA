import java.util.List;

public class Condiments_2137 extends Urun_2137 {
	String KategoriAdi;
	String Detay;

	public Condiments_2137() {

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
	

	public static void CesniBirimAgirlikGuncelle(int N,String yeniAgirlik, List<Condiments_2137> urun3) {
		 if (N > 0 && N <= urun3.size()) {
	            Condiments_2137 cesni = urun3.get(N - 1);
	            cesni.setBirimAgirligi((yeniAgirlik));
	            System.out.println("Çeşni ağırlığı güncellendi: " + cesni.getAdi() + " - Yeni Ağırlık: " + yeniAgirlik);
	        } 
		 else {
	            System.out.println("Geçersiz çeşni numarası. Lütfen geçerli bir numara girin.");
	        }
	}
}