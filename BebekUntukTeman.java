package TLX;

import java.util.*;

public class BebekUntukTeman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	    String baris1 = " ";
	    baris1 = input.nextLine();
	    String[] pisah = baris1.split(" ");
	    int A = Integer.parseInt(pisah[0]);
	    int B = Integer.parseInt(pisah[1]);
	    System.out.println("masing-masing "+(A/B));
	    System.out.println("bersisa "+(A%B));
//	    System.out.println(Arrays.toString(pisah));
	}

}
