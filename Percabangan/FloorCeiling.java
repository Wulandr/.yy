package TLX.Percabangan;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class FloorCeiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double angka = input.nextDouble();
		System.out.printf((int)Math.floor(angka)+" "+(int)Math.ceil(angka));
	}

}
