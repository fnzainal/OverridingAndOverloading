package overloading;

/**
 * Overloading
 * @author Zainal Fahrudin
 * Pondok Programmer,21 Oct 2015
 * 
 */

public class MenghitungLuas {

	//inisiasi int a dan b
	int a = 5, b=10;
	//membuat method Luas Persegi
	public void LuasPersegi(){
		System.out.println("Luas Persegi1 = "+a*b+" cm2");
	}

	//membuat method Luas Persegi dengan parameter int x dengan y
	public void LuasPersegi(int x,int y){
		System.out.println("Luas Persegi2 = "+x*y+" cm2");
	}
	
	public static void main(String args[]){
		//inisiasi MenghitungLuas
		MenghitungLuas luas = new MenghitungLuas();

		//memanggil method LuasPersegi() yang pertama
		luas.LuasPersegi();
		
		//memanggil method LuasPersegi() yang kedua, dengan parameter angka;
		luas.LuasPersegi(4,5);
	}
}
