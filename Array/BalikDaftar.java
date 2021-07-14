package TLX.Array;

import java.util.Scanner;

public class BalikDaftar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	    int[] baris = new int[3];
	    for(int i=0;i<3;i++) {
	     baris[i] = input.nextInt();
	    }
	    for(int i=2;i>=0;i--) {
	    System.out.println(baris[i]);
	    }
//		 Scanner sc=new Scanner(System.in);
//	        String input=sc.nextLine();
//	        int a=0;
//	        while(input!=null){
//	            System.out.printf("%d %s\n",++a,input);
//	            input=sc.nextLine();
//	        }
//	        sc.close();
	     
	}
}
