public class Main_2137 {
	
	public static void main(String[] args) {
		System.out.println("**************Sayı Chen Asalı Mı Fonksiyonu***************");
		SayiChenAsaliMi(7);
		System.out.println("**************İKİ BASAMAKLI CHEN ASALLARI***************");
		TumunuYazdir();
	}
	public static boolean AsalMi(int sayi)
	{
		int sayac=0;
		sayi=sayi+2;
		for(int i=2;i<sayi;i++) {
			if(sayi%i==0) {
				sayac++;
			}
		}
		if(sayac==0) {
			System.out.println((sayi-2)+" : Chen asali");
		}
		return false;
	}
		
	static int asal(int n) {
		if (n <= 1) {
			return 0;
		}
		if (n == 2 || n == 3) {
			return n;
		}
		if (n % 2 == 0 || n % 3 == 0) {
			return 0;
		}
		int i = 5;
		while (i * i <= n) {
			if (n % i == 0 || n % (i + 2) == 0) {
				return 0;
			}
			i += 6;
		}
		return n;
	}
	static boolean Asal2CarpanVarMi(int n) {
		n=n+2;
		for (int i = 2; i <= n / 2; i++) {
			if (n==asal(i) * asal(n / i)) {
				System.out.println(n+":"+asal(i)+"*"+asal(n/i));
			}
		}
		return false;
	}
	public static boolean SayiChenAsaliMi(int sayi) {
		if(AsalMi(sayi)==true||Asal2CarpanVarMi(sayi)==true) {
			System.out.println(sayi+"Chen Asalı");
		}
		return false;
	}
	public static void TumunuYazdir() {
		System.out.println();
		System.out.println("p+2 nin asal olduğu iki basamaklı chen aslları");
		System.out.println();
		for(int i=10;i<=97;i++) {
			AsalMi(i);
		}
		System.out.println();
		System.out.println("p+2 iki asal saının çarpımı olduğu iki basamaklı chen aslları");
		System.out.println();
		for(int i=10;i<=97;i++) {
			Asal2CarpanVarMi(i);
		}
	}
}