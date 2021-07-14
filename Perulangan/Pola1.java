package TLX.Perulangan;

import java.util.Scanner;

public class Pola1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String angka = " ";
		angka = input.nextLine();
		String[] pisah = angka.split(" ");
		int a = Integer.parseInt(pisah[0]);
		int b = Integer.parseInt(pisah[1]);
		for(int i=1;i<=a;i++) {
			if(i%b!=0) {
				System.out.print(i+" ");
			}else if(i%b==0) {
				System.out.print("* ");
			}
		}
	}
}
