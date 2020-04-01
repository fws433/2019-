package com.fws.guanglianda;
/*
 * 给出一个非负整数数组，你最初定位在数组的第一个位置，
 * 数组中的每个元素的值代表你在那个位置可以跳跃的最大长度。
 * 判断你是否能到达数组的最后一个位置。
 * 
 * */
import java.util.Scanner;
import java.util.Arrays;
public class tiaoyue {
   public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   String s=sc.nextLine();
	   String[] str=s.split(" ");
	   int len=str.length;
	   int[] arr=new int[len];
	   for(int i=0;i<len;i++)
		   arr[i]=Integer.parseInt(str[i]);
	 int i= judge(arr);
	   if(i<arr.length-1)
		   System.out.println("false");
	   else
		   System.out.println("true");
	  
   }
   public static int judge(int[] arr){
	  /* 该算法不鞥达到100%
	   * int flag=0;
	   while(flag<arr.length){
		   if((flag+arr[flag])==arr.length-1){
			   return true;
		   }else{
			   if(arr[flag]==0){
				   return false; 
		   }else{
			   flag=flag+arr[flag];
		     }
	      }
	   }
	    return false;*/
	   int flag=0;
	   int m = 0;
	   int l=0;
	   for( int i=0;i<arr.length&&arr[i]!=0;){
		    flag=i+arr[i];
		    l=i+1;
		    for(int j=i+1;j<arr.length&&j<=flag;j++){
		    	if(j+arr[j]>=flag){
		    		flag=j+arr[j];
		    		l=j;
		    	}
		    }
		    i=l;
		    m=i;
		   
	   }
	   return m;
	   
	   
   }
}







