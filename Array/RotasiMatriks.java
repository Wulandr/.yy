package TLX.Array;

import java.util.Scanner;

public class RotasiMatriks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String baris1 = " ";
		baris1 = input.nextLine();
		String[] barissatu = baris1.split(" ");
		int N = Integer.parseInt(barissatu[0]);
		int M = Integer.parseInt(barissatu[1]);
		
		int[][] matriks = new int[N][M];
		String[] row = new String[N];
		String[] splitN = new String[N];
		for(int i=0;i<N;i++) {
			row[i] = input.nextLine();
			splitN = row[i].split(" ");
		}
		System.out.println(splitN[0]);
		System.out.println(splitN[1]);
	    

	}

}
