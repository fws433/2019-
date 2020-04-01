package com.fws.beike;
import java.util.*;
public class diyiti {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("输入一个整数n:");
		String str1=sc.nextLine();
		int n=Integer.parseInt(str1);
		System.out.println("输入一行字符串：");
		String str2=sc.nextLine();
		String[] s=str2.split(" ");
		int[] arr=new int[n];
		for (int i=0;i<n;i++){
			arr[i]=Integer.parseInt(s[i]);
		}
		int min=Math.abs(arr[0]-arr[1]);
		int mm=0;
		int temp=0;
		int left=0;
		int right=left+1;
		for(int j=1;j<n-1;j++){
			mm=Math.abs(arr[j]-arr[j+1]);
			if(mm<min){
				temp=mm;
				mm=min;
				min=temp;
				left=j;
				right=left+1;
			}
		}
		System.out.println(arr[left]+" "+arr[right]);
		
		
	}
 }
