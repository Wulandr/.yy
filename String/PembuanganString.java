package TLX.String;

import java.util.Scanner;

public class PembuanganString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String baris1 = " ";
		baris1 = input.nextLine();
		String[] kata1 = baris1.split(" ");
		if(kata1[0].contains(kata1[1])) {
			String ganti = "";
			String hasil = kata1[0].replace(kata1[1].substring(0), ganti);
			System.out.println(hasil);
		}
//		String hasil2 = kata1[0].replace(kata1[1].substring(), ""),;
//		System.out.print(hasil2);
	}

}
