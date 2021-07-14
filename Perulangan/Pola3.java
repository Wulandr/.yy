package TLX.Perulangan;

import java.util.Scanner;

public class Pola3 {

	public static void main(String[] args) {
		int j,z=0;
		// TODO Auto-generated method stub
	    Scanner input = new Scanner(System.in);
	    int bintang = input.nextInt();
	    for(int i=1;i<=bintang;i++) {
	    	for(j=1;j<=i;j++) {
//	    	System.out.print("\t");
	    	if(z<=9) {
	    	System.out.print(z);z=z+1;
	    	}
	    	else if(z>9) {
	    		z=0;
	    		System.out.print(z);
	    		z=z+1;
	    	}
	    	}
	    	System.out.println("");
	    }
	}

}
