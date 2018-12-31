package com.inter;

import java.util.Scanner;

public class SpecialPalindrome {

	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int len = sc.nextInt();
		String str = sc.next();
		
		int count = 0;
		
		for(int i = 0;i < len;i++) {
			for(int j = i;j <= len;j++) {
				String sub = str.substring(i, j);
				int sub_len = sub.length();
				if(sub_len > 0) {
					char[] sub_char = sub.toCharArray();
					//System.out.println(sub);
					char c = sub_char[0];
					for(int k = 0;k < sub_len;k++){
						if(c != sub_char[k] && (k != (sub_len+1)/2)) {
							break;
						}else {
							count++;
						}
						
					}
				}
			}
		}
		System.out.println(count);
	}

}
