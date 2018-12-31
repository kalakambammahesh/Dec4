package com.inter;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	
	private static final Scanner sc = new Scanner (System.in);
	

	public static void main(String[] args) {
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int minDiff = Integer.MAX_VALUE;
		
		Arrays.sort(arr);
		
		for(int i = 0;i <= n - k;i++) {
			int diff = arr[i + k - 1] - arr[i];
			if(diff < minDiff) {
				minDiff = diff;
			}
		}
		System.out.println(minDiff);
		
	}
}
