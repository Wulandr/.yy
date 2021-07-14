package TLX.Perulangan;

import java.util.Scanner;

public class FaktorBilangan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int angka = input.nextInt();
		for(int N=angka;N>=1;N--) {
			if(angka%N==0) {
				System.out.println(N);
			}
		}
		
	}

}
