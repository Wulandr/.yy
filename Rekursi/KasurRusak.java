package TLX.Rekursi;

import java.util.Arrays;
import java.util.Scanner;

public class KasurRusak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	    String baris1 = " ";
	    baris1 = input.nextLine();
	    String[] pisah = baris1.split("");
//	    int A = Integer.parseInt(pisah[0]);
//	    int B = Integer.parseInt(pisah[1]);
//	    System.out.println("masing-masing "+(A/B));
//	    System.out.println("bersisa "+(A%B));
	    System.out.println(Arrays.toString(pisah));
	    if(pisah[0].equals(pisah[4]) == true) {
	    	System.out.println("Huruf terdepan dan huruf terbelakang sama. Buang.");
	    	if(pisah[1].equals(pisah[3]) == true) {
	    		System.out.println("Huruf terdepan dan huruf terbelakang sama. Buang.");
	    	}else if(pisah[1].equals(pisah[3]) == false) {
	    		System.out.println("terdepan dan huruf terbelakang berbeda");
	    	}
	    }
	}

}
