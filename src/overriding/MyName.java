package overriding;

/**
 * Overriding
 * @writer Zainal Fahrudin
 * Pondok Programmer,21 Oct 2015
 */

public class MyName {
	public static void main(String[] args){
		//inisiasi Myname
		MyName aku = new MyName();
		//inisiasi Profile
		Profile saya = new Profile();
		
		//memanggil method Nama() dari kelas MyName
		aku.Nama();
		//memanggil method Nama() dari kelas Profile
		saya.Nama();
	}
	
	//method Nama()
	public void Nama(){
		System.out.println("Zainal Fahrudin");
	}
	
}
