public class komputer{
	public int prosesor;
	public int memori;
	public int storage;

	public komputer(){
		prosesor = 500;
		System.out.println("kecepatan Prosesor Komputer: "+prosesor);
	}
 }
 class Notebook26 extends komputer{
 	public int batrai;

 	public Notebook26(int a, int b, int c, int d){
 		prosesor = a;
 		memori = b;
 		storage = c;
 		batrai = d;

 	}

 	public void CetakSpesifikasi(){
 		System.out.println("Kecepatan prosesor notebook26= "+prosesor);
 		System.out.println("Kapasitas memori= "+memori);
 		System.out.println("Kapasitas storage= "+storage);
 		System.out.println("Kapasitas batrai= "+batrai);

 	}

 	public void Overclock(int r){
 		prosesor = r;
 		System.out.println("Notebook doOverLock dengan kecepatan prosesor= "+prosesor);
 	}
 }