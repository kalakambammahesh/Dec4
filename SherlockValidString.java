package com.inter;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SherlockValidString {

	private static final Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		String s = sc.next();
		char[] char_arr = s.toCharArray();
		
		int len = s.length();
		
		Map<Character,  Integer> map = new LinkedHashMap<>();
		
		for(char c: char_arr) {
			if(map.containsKey(c)) {
				int n = map.get(c);
				map.put(c, n + 1);
			}else {
				map.put(c, 1);
			}
		}
		
		int[] arr = new int[len];
		int j = 0;
		for(int i : map.values()) {
			arr[j] = i;
			j++;
		}
		int count = 0;
		String flag = "YES";
		for(int i = 1;i < len-1;i++) {
			if((arr[i-1] - arr[i] == 1) && (arr[i] - arr[i+1] == 1)) {
				flag = "NO";
				break;
			}
			if(arr[i-1] - arr[i] >= 2) {
				flag = "NO";
				break;
			}
			if(arr[i-1] - arr[i] == 1) {
				count++;
				if(count == 2) {
					flag = "NO";
					break;
				}
			}
		}
		System.out.println(flag);
	}

}
