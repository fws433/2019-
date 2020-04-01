package com.shuzu;

import java.util.Scanner;

public class zishuzuzuidahezifuchuanweizhi {
	private static int begin=0;
	private static int end=0;
  public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int[] arr=new int[n];
	  for(int i=0;i<n;i++)
		  arr[i]=sc.nextInt();
	  System.out.println(fws(arr));
	  System.out.println("begin="+begin+ ",end="+end);
	  
  }
  public static int fws(int[] arr){
	  int maxmun=Integer.MIN_VALUE;
	  int nSum=0;
	  int nStart=0;
	  for(int i=0;i<arr.length;i++){
		  if(nSum<0){
			  nSum=arr[i];
			  nStart=i;
		  }
		  else{
			  nSum+=arr[i];
		  }
		  if(nSum>maxmun){
			  maxmun=nSum;
			  begin=nStart;
			  end=i;
		  }
	  }
	     return maxmun;
    }
}
