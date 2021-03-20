package com.priyavrat.Testing;

import java.math.BigInteger;

public class BigInt {
	public static void main(String[] args) {
		BigInteger biginteger = new BigInteger("2300"); 
		  
        // Creating an int i for index 
        int i = 11; 
  
        boolean flag = biginteger.testBit(i); 
  
        String result = "The bit at index " + i + " of " +  
        biginteger + " is set = " + flag; 
  
        // Displaying the result 
        System.out.println(result); 
	}
}
