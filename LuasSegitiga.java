package TLX;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LuasSegitiga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	    String baris1 = " ";
	    baris1 = input.nextLine();
	    String[] pisah = baris1.split(" ");
	    int a = Integer.parseInt(pisah[0]);
	    int t = Integer.parseInt(pisah[1]);
	    DecimalFormat df = new DecimalFormat("#.##");
	    System.out.printf("%.2f",(0.50*(a*t)));
	}

}
