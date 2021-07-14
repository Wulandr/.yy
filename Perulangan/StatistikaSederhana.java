package TLX.Perulangan;

import java.util.Arrays;
import java.util.Scanner;

public class StatistikaSederhana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		String baris1 = input.nextLine();
		int numb = Integer.parseInt(baris1);
//		System.out.println(numb);
		
	    String baris2 = " ";
//	    for(int i=0;i<numb;i++) {
	    	baris2 = input.nextLine();
//	    }
	    int[] angka = new int[numb];
	    String[] pisah = new String[numb]; 
	    pisah = baris2.split(" ");
//	    System.out.println(pisah[0]);
	    for(int i=0;i<numb;i++) {
		    angka[i] = Integer.parseInt(pisah[i]);
	    }
//	    for(int i=0;i<numb;i++) {
//		    System.out.print(angka[i]+" ");
//	    }
//	    System.out.println();
	    int besar=angka[0];int kecil = angka[0];
//	    for(int i=0;i<numb;i++) {
	    	for(int j=0;j<numb;j++) {
	    		if(besar<angka[j]) {
	    			besar = angka[j];
	    		}
	    	}
	    	for(int j=0;j<numb;j++) {
	    		if(kecil>angka[j]) {
	    			kecil = angka[j];
	    		}
	    	}
//	    }
	    System.out.println(besar+" "+kecil);
	}
}
