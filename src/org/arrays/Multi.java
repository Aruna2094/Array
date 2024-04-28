package org.arrays;

public class Multi {
	
	public static void main(String[] args) {
		
		int a[][]= new int[3][2];
		a[0][0]=20;
		a[0][1]=30;
		a[1][0]=40;
		a[1][1]=50;
		a[2][0]=60;
		a[2][1]=70;
		System.out.println(a[2][1]);
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		
		System.out.println("=============for loop=======");
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.println(a[i][j]);
			}
			
		}
		 
		
		int b[][]= {{10,20,30},{40,50,60},{70,80,90}};
		System.out.println(b[1][1]);
		System.out.println(b.length);
		System.out.println(b[1].length);
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[0].length;j++) {
			System.out.println(b[i][j]);	
			}
		}
		System.out.println("=============enhanced for loop=======");
		for(int x[]:b) {
			for(int y:x) {
				System.out.println(y);
			}
		}
		
	}

}
