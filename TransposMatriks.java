package TLX;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class TransposMatriks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	    String baris1 = " ",baris2 = " ",baris3 = " ";
	    int[][] tampung = new int[3][3]; 
	    
	    baris1 = input.nextLine();
	    baris2 = input.nextLine();
	    baris3 = input.nextLine();
	    String[] pisah1 = baris1.split(" ");
	    String[] pisah2 = baris2.split(" ");
	    String[] pisah3 = baris3.split(" ");
	    
	    for(int i=0;i<3;i++) {
	    tampung[0][i] = Integer.parseInt(pisah1[i]);
	    tampung[1][i] = Integer.parseInt(pisah2[i]);
	    tampung[2][i] = Integer.parseInt(pisah3[i]);
	    }        
	    
	    for(int i=0;i<3;i++) {
	    	for(int j=0;j<3;j++) {
	    	System.out.print(tampung[j][i] + " ");
	    	}System.out.println();
	    } 
	}
}
