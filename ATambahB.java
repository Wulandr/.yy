package TLX;

import java.util.Scanner;

public class ATambahB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String baris2 = " ";
	    baris2 = input.nextLine();
	    String[] pisah = baris2.split(" ");
	    int P = Integer.parseInt(pisah[0]);
	    int Q = Integer.parseInt(pisah[1]);
	    System.out.println(P+Q);
//	    String s1="java string split method by javatpoint";  
//	    String[] words=s1.split("\\s");//splits the string based on whitespace  
//	    //using java foreach loop to print elements of string array  
//	    for(String w:pisah){  
//	    System.out.println(w);  
//	    }  
//	    System.out.println("Enter your number:"); 
//        Scanner scan = new Scanner(System.in);
//        String angka="";
//
//        angka+=scan.next();
////        int angka2 = Integer.parseInt(angka);
//        scan.close();
//
//        System.out.println(angka); 
	}

}
