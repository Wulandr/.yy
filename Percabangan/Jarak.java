package TLX.Percabangan;

import java.util.Arrays;
import java.util.Scanner;

public class Jarak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	    String baris1 = " ";
	    baris1 = input.nextLine();
	    String[] pisah = new String[4]; 
	    pisah = baris1.split(" ");
	    int x1 = Integer.parseInt(pisah[0]);
	    int y1 = Integer.parseInt(pisah[1]);
	    int x2 = Integer.parseInt(pisah[2]);
	    int y2 = Integer.parseInt(pisah[3]);
	    int x = x2-x1;
	    int y = y2-y1;
	    System.out.println(Math.abs(y)+Math.abs(x));
	}

}
