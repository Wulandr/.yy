package TLX.Rekursi;

import java.util.Scanner;

public class Faktorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int total=1; 
		int baris = input.nextInt();
	    for(int i=1;i<=baris;i++) {
	      total=total*i;
	    }
	    
	    System.out.println(total);
	     
	}

}
