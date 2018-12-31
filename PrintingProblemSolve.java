package com.inter;

import java.util.Arrays;

public class PrintingProblemSolve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		for(int i = 0;i < n;i++){
          for(int j = i;j < n-1;j++) {
        	  System.out.print(" ");
          }
          for(int k = 0; k <= i;k++) {
        	  System.out.print("#");
          }
          System.out.println();
		}
		
	}
}
