package com.inter;

import java.util.Scanner;

public class DateAmPm {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String s = sc.nextLine();
		//char arr[] = s.toCharArray();
		int l = s.length();
		
		boolean  flag = s.contains("PM");
		String pre = "";
		String sub = null;
		if(flag) {
			char c1 = s.charAt(0);
			char c2 = s.charAt(1);
			
			int n1 = c1 - '0';
			int n2 = c2 - '0';
			int n = (n1*10) + n2;
		
			if( n != 12) {
				n += 12;
			}
			pre = String.valueOf(n);
			 sub = s.substring(2, l - 2);
		}else {
			char c1 = s.charAt(0);
			char c2 = s.charAt(1);
			
			int n1 = c1 - '0';
			int n2 = c2 - '0';
			int n = (n1*10) + n2;
			if(n == 12) {
				sub = "00" + s.substring(2, l-2);
			}else {
				sub = s.substring(0, l - 2);
			}
		}
		System.out.println(pre.concat(sub));
		s.indexOf(s);
	}

}
