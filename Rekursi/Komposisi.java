package TLX.Rekursi;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Komposisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	    String baris1 = " ";
	    baris1 = input.nextLine();
	    String[] pisah = baris1.split(" ");
	    int A = Integer.parseInt(pisah[0]);
	    int B = Integer.parseInt(pisah[1]);
	    int K = Integer.parseInt(pisah[0]);
	    int x = Integer.parseInt(pisah[1]);
	    int Fx = (A*x)+B;
	    System.out.println(Fx);
	}

}
