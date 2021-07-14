package TLX.Perulangan;

import java.util.Arrays;
import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	    int baris1 = input.nextInt();
	    int[] data = new int[baris1];
//	    for(int i=1;i<=baris1;i++) {
//	    	data[i] = input.nextInt();
//	    }
	    for(int i=1;i<=baris1;i++) {
	    	if(i == 42) {
	    		System.out.println("ERROR");break;
	    	}	
	    	else if(i%10!=0) {
	    	System.out.println(i);continue;
	    	}
	    }
	}

}
