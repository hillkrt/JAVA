import java.util.List;

public class Beverages_2137 extends Urun_2137{
	
	String KategoriAdi;
	String Detay;
	public Beverages_2137() {
		
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
	
	public static void TumIceceklerStokGuncelle(int miktar,List<Beverages_2137>urun1) {
		
		for (Beverages_2137 urun : urun1) {
			
			  int yeniStok = urun.StokMiktari + miktar;

		        if (yeniStok >= 0) {
		            urun.StokMiktari = yeniStok;
		        } else {
		            System.out.println("Yeni bir miktar giriniz. Stok miktarı 0'dan küçük olamaz!");
		        }
		}
	}
}