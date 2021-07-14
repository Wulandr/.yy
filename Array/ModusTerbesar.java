package TLX.Array;

import java.util.Scanner;

public class ModusTerbesar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String baris1 = " ";int z=0;
		String baris2 = " ";
		baris1 = input.nextLine();
		int angka1 = Integer.parseInt(baris1);
		baris2 = input.nextLine();
		String[] pisah = baris2.split(" ");;
		int[] angka2 = new int[angka1];
		
		for(int i=0;i<angka1;i++) {
			angka2[i] = Integer.parseInt(pisah[i]);
			System.out.println(angka2[i]);
		}int tampung = angka2[0];
		System.out.println();
		for(int i=0;i<angka1;i++) {
		if(tampung==angka2[i]) {
			tampung = angka2[0];
			System.out.println(tampung);
			z++;
		}else {
			if(angka2[i]==angka2[i+1]) {
				tampung = angka2[i];
				System.out.println("u:"+tampung);
				z++;
			}
		}	
		}System.out.println(tampung+" ada :"+z);
	}

}
