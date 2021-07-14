package TLX.Perulangan;

import java.util.Scanner;

public class Pola2 {

	public static void main(String[] args) {
		int j;
		// TODO Auto-generated method stub
	    Scanner input = new Scanner(System.in);
	    int bintang = input.nextInt();
	    for(int i=1;i<=bintang;i++) {
	    	for(j=1;j<=i;j++) {
//	    	System.out.print("\t");
	    	System.out.print("*");
	    	}
	    	System.out.println("");
	    }
	}

}
