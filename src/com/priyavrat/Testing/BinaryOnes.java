package com.priyavrat.Testing;

public class BinaryOnes {
	
	static int BinCount(int n) {
		int count=0;
		while(n>0) {
			count+=n &1;
			n>>=1;
		}
		return count;
	}

	
	
	
	public static void main(String[] args) {
		int a=7;
		System.out.println(BinCount(a));
		System.out.println("Printing this line to test something....");
	}
		
	
}
