package com.priyavrat.Testing;

import java.math.BigInteger;

public class SubArr {

	
	static void printSubSeq(int [] ar) {
		int subSize=(int)Math.pow(2, ar.length);
		
		for(int counter=1;counter<subSize;counter++) {
			for(int j=0;j<ar.length;j++) {
				if(BigInteger.valueOf(counter).testBit(j)) {
					System.out.print(ar[j]+ " ");
				}
				
			}System.out.println();
		}
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		 int [] arr= {1,2,3,4};
		 printSubSeq(arr);
		

	}

}
