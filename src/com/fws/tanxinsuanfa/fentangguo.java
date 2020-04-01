package com.fws.tanxinsuanfa;
import java.util.*;
public class fentangguo {
 public static void main(String[] args){
	 Scanner sc=new Scanner(System.in);
	 String s=sc.nextLine();
	 int len=Integer.parseInt(s);
	 int[] arr=new int[len];
	 for(int i=0;i<len;i++){
		 arr[i]=sc.nextInt();
	  }
	 System.out.println(candy(arr));
   }
 public static int  candy(int[] arr){
	 if(arr==null||arr.length==0){
		 return 0;
	 }
	 int[] num=new int[arr.length];
	 Arrays.fill(arr, 1);
	 
	return 1;
	 
 }
}
