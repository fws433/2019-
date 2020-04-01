package com.shuzu;

import java.util.Scanner;

public class zuidazishuzuzhihe {
  public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  String n1=sc.nextLine();
	  int n=Integer.parseInt(n1);
	  int[] arr=new int[n];
	 /* String str1=sc.nextLine();
	  String[] str=str1.split(",");*/
	  for(int i=0;i<n;i++){
		  arr[i]=sc.nextInt();
	  }
	  System.out.println(fws(arr));
  }
  public static int fws(int[] arr){
	  int maxsum=arr[0];
	  int sum=arr[0];
	  for(int i=1;i<arr.length;i++){
		  sum=Math.max(sum+arr[i],arr[i] );
		  maxsum=Math.max(sum,maxsum);
	  }
	return maxsum;
	  
  }
}
