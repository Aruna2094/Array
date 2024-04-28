package org.arrays;

public class SingleArray {
	
	public static void main(String[] args) {
		
		int a[]=new int[6];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[5]=60;
//		a[6]=70;
//		a[7]=80;
		
		System.out.println(a[3]);
		
		System.out.println("========length==========");
		
		System.out.println(a.length);
		
	    System.out.println("=========for loop======");
		
		for(int i=0;i<6;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("=======enhanced for loop========");
		
		for(int b:a) {
			System.out.println(b);
		}
		
		
		
	}

}
