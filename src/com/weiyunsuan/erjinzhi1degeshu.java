package com.weiyunsuan;

/*
 * �����������1�ĸ���
 * */
import java.util.*;
public class erjinzhi1degeshu {
   public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   System.out.println(countOne(n));
   }
   public static int countOne(int n){
	   int count=0;
	   while(n>0){
		   if((n&1)!=0)
			   count++;
		   n=n>>1;
	   }
	return count;
	   
   }
}
