package TLX.Percabangan;

import java.util.Scanner;

public class IfThenCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    int baris1 = input.nextInt();
	    if(baris1 < 10) {
	    	System.out.print("satuan");
	    }else if(baris1 < 100 && baris1>=10) {
	    	System.out.print("puluhan");
	    }else if(baris1 < 1000 && baris1>=100) {
	    	System.out.print("ratusan");
	    }else if(baris1 < 10000 && baris1>=1000) {
	    	System.out.print("ribuan");
	    }else if(baris1 < 100000 && baris1>=10000) {
	    	System.out.print("puluhribuan");
	    }
	}

}
