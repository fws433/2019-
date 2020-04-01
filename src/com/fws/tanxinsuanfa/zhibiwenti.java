package com.fws.tanxinsuanfa;
/*
 * 纸币问题
 * */
import java.util.*;
public class zhibiwenti {
  public static void main(String[] args){
	 /* Scanner sc=new Scanner(System.in);
	 String s=sc.nextLine();
	 String[] str=s.split(",");
	 int len=str.length;
	 int[] arr=new int[len];
	 for(int i=0;i<len;i++){
		 arr[i]=Integer.parseInt(str[i]);
	 }*/
	 int[] values={1,2,5,10,20,50,100};
	 int[] counts={3,1,2,1,1,3,5};
	int[] num=fws(442,values,counts);
	for(int i=0;i<num.length;i++){
		if(num[i]!=0){
			System.out.println("需要面额为："+values[i]+"的人名币"+num[i]+"张");
		}
	}
	
  }
  public static int[] fws(int money,int[] values,int[] counts){
	  int[] result=new int[values.length];
	 int money1=money;
	  for(int i=values.length-1;i>=0;i--){
		  int mon=money1/values[i];
		  //money1=money1-mon*values[i];	
		  if(mon<=counts[i]){
			  result[i]=mon;  
			  money1=money1-mon*values[i];
			
		  }else{
			  result[i]=counts[i];
			  money1=money1-counts[i]*values[i];
		  }
	  }
	  return result;
  }
}
