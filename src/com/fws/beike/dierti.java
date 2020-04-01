package com.fws.beike;
/*
 * 举重大赛开始了，为了保证公平，要求比赛两房的体重较小值要大于等于叫较大值的90%，
 * 那么对于这N个人最多能进行多少场比赛呢，任意两人之间最多进行一场比赛
 * 输入：
 * 第一行N，表示参赛人数（2《=N《10的5次方）
 * 第二行N个正整数表示体重
 * 输出：
 *   一个数，表示最多能进行的比赛场数
 * */
import java.util.*;
public class dierti {
public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  String str1=sc.nextLine();
	  int N=Integer.parseInt(str1);
	  
	  String s=sc.nextLine();
	  String[] str2=s.split(" ");
	  int[] arr=new int[str2.length];
	  for(int i=0;i<str2.length;i++){
		 arr[i]=Integer.parseInt(str2[i]); 
	  }
	  int count=0;
	  for(int j=0;j<arr.length-1;j++){
		  for(int k=j+1;k<arr.length;k++){
			  if(arr[j]>arr[k]){
				  if(arr[k]>=0.9*arr[j])
					  count++;
			  }else{
				  if(arr[j]>=0.9*arr[k])
					  count++;
			  }
			  /*boolean flag=arr[j]>=(arr[k]*0.9);
			  if(flag==true){
				  count++;
			  }*/
		  }
	  }
	  System.out.println(count);
  }
}








