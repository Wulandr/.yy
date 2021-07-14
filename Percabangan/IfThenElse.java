package TLX.Percabangan;

import java.util.Scanner;

public class IfThenElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	    int baris1 = input.nextInt();
	    if(baris1>0) {
	    System.out.println("positif");
	    } else if(baris1<0) {
		    System.out.println("negatif");
		    }
	    else if(baris1==0) {
		    System.out.println("nol");
		    }
	}

}
