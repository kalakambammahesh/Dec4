package com.inter;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinusDecimal {

	private final static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		
		int pCount = 0, nCount = 0, zCount = 0;
		for(int i = 0;i < n;i++) {
			int element = sc.nextInt();
			
			if(element == 0) zCount++;
			if(element > 0) pCount++;
			if(element < 0) nCount++;
		}
		//DecimalFormat df = new DecimalFormat("#.#####");
		//System.out.println(df.format(12.345));
		System.out.printf("%.6f", (float)pCount/n);
		System.out.println();
		System.out.printf("%.6f", (float)nCount/n);
		System.out.println();
		System.out.printf("%.6f", (float)zCount/n);
	}

	

}
