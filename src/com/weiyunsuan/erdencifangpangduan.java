package com.weiyunsuan;

import java.util.Scanner;
/*
 * 判断n是否为2的m次方
 * */
public class erdencifangpangduan {
  public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  System.out.println(isPower(n));
  }
  public static boolean isPower(int n){
	  if(n<1)
		  return false;
	  int i=1;
	  while(i<=n){     
		  if(i==n)
			  return true;
		  i=i<<1;
	  }
	return false;
	  
  }
}
