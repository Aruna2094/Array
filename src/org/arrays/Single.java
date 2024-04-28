package org.arrays;

public class Single {
	
	public static void main(String[] args) {
		 
		int a[]=new int[5];
		a[0]=20;
		a[1]=46;
		a[2]=80;
		a[3]=90;
		a[4]=76;
	
		System.out.println(a[2]);
		
		System.out.println("========for loop======");
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("===========enhanced for loop=====");
		int b[]= {20,30,40,50,60,70};
		
		for(int x:a) {
			System.out.println(x);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
