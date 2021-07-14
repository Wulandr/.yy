package TLX.Perulangan;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	    String baris1 = " ", baris2 = " ";
	    baris1 = input.nextLine(); 
	    String[] pisah = baris1.split(" ");
	    int x1 = Integer.parseInt(pisah[0]);
	    baris2 = input.nextLine();
	    String[] pisah2 = new String[x1]; 
	    pisah2 = baris2.split(" ");
	    int[] y = new int[x1];
	    int total = 0;
	    for(int j=0;j<x1;j++) {
	    	y[j] = Integer.parseInt(pisah2[j]);
	    	total+=y[j];
	    }
	    System.out.println(total);
	}

}
