package TLX.Perulangan;

import java.util.Scanner;

public class DuaPangkat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int angka = input.nextInt();
		if((angka%Math.floor(Math.sqrt(angka))) == 0) {
			System.out.println("ya");
		}else{
			System.out.println("bukan");
		}
	}

}
