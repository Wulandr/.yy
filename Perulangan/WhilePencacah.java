package TLX.Perulangan;

import java.util.Scanner;

public class WhilePencacah {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	    int baris1 = 0;
	    int i=1;
	    while(i<=3) {
	    	baris1 += input.nextInt(); i++;
	    }
	    System.out.println(baris1);
	}

}
