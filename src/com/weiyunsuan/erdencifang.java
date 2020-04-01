package com.weiyunsuan;

public class erdencifang {
  public static void main(String[] args){
	  System.out.println("4ГЫвд8:"+powerN(4,3));
  }
  public static int powerN(int m,int n){
	  for(int i=0;i<n;i++){
		  m=m<<1;
	  }
	  return m;
  }
}
