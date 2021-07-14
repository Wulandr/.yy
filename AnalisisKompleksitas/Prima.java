package TLX.AnalisisKompleksitas;

import java.util.Scanner;

public class Prima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
	    int total = 0;
	    int baris1 = input.nextInt(); 
	    int[] angka = new int[baris1];
	    for(int i=0;i<baris1;i++) {
	    	angka[i] = input.nextInt();
	    }
	    for(int i=0;i<baris1/2;i++) {
	    	if(angka[i]>1 && angka[i]%2!=0 && angka[i]%3!=0 || angka[i]==2) {
	    		System.out.println("YA");
	    	}else {
	    		System.out.println("BUKAN");
	    	}
	    }
//		int i,m=0,flag=0;      
//		  int n=input.nextInt();
//		  int[] angka = new int[n];
//		  m=n/2; 
//		  for(int i1=0;i1<n;i1++) {
//		    	angka[i1] = input.nextInt();
//		   }
//		  for(int z=0;z<n;z++) {
//		  if(angka[z]==0 || angka[z]==1){  
//		   System.out.println("BUKAN");      
//		  }else{  
//		   for(i=2;i<=n;i++){      
//		    if(angka[z]%i==0){      
//		     System.out.println("BUKAN");      
//		     flag=1;      
//		     if(i>=m) {break;}      
//		    }      
//		   }      
//		   if(flag==0)  { System.out.println("YA"); }  
//		  }//end of else  
//		  }
	}

}
