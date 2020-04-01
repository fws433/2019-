package com.shuzu;
import java.util.*;
public class dierdadeshu {
	/*
	 * 判断数组中第二大数据
	 * */
   public  static  void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int[] arr=new int[n];
	   for(int i=0;i<n;i++){
		   arr[i]=sc.nextInt();
	   }
	   System.out.println(fws(arr));
	   //fws(arr);
	   
   }
   public static int fws(int[] arr){
	   int len=arr.length;
	   int maxnumber=arr[0];
	   int secnumber=Integer.MIN_VALUE;
	  // int secnumber=0;
	   for(int i=1;i<len;i++){
		   if(arr[i]>maxnumber){
			   secnumber=maxnumber;
			   maxnumber=arr[i];
		   }else{
			   if(arr[i]>secnumber){
				   secnumber=arr[i];
			   }
		   }
	   }
	   return secnumber;
	   
   }
}
