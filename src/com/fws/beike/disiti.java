package com.fws.beike;
import java.util.*;
/*
 * 小C在做一种特殊的服务器负载测试，对于一个请求队列中的请求，
 * 每一个请求都有一个负荷值，为了保证服务器稳定，请求队列
 * 中的请求负荷必须按照先递增后递减的规律(仅递增，仅递减也可以)，
 *比如[ 1，2，8，4，3 ]，[ 1，3，5 ]和[ 10 ]这些是满足规律的，
 * 还有一些不满足的，比如[ 1，2，2，1 ]，[ 2，1，2 ]和[ 10，10 ]。
 * 现在给你一个请求队列，你可以对请求的负荷值进行增加，
 * 要求你调整队列中请求的负荷值，使数组满足条件。最后输出使队列满足条件最小的增加总和。
 * 
 * 
 * 
 * */
public class disiti {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
     int n;
     int[] m ;
     while (scanner.hasNextInt()) {
         n = scanner.nextInt();
         m = new int[n];
         for (int i = 0; i < n; i++) {
             m[i] = scanner.nextInt();
         }
         System.out.println(minIncre(n, m));
     }
 }

 private static int minIncre(int n, int[] mm) {
     int[] m=new int[n];
     
     int res = Integer.MAX_VALUE;
     for(int i=0;i<n;i++){
    	 int ths=i;
    	 int min=0;
    	 
    	
    	 for(int k=0;k<n;k++){
        	 m[k]=mm[k];
         }
    	 for(int j=1;j<=ths;j++){
    		 int temp=m[j-1];
    		 if(m[j]<=temp){
    			 min=min+temp-m[j]+1;
    			 m[j]=temp+1;
    		 }
    	 }
    	 for(int j=n-1;j>ths;j--){
    		 int temp=m[j-1];
    		 if(m[j]>=temp){
    			 min=min+m[j]-temp+1;
    			 m[j-1]=m[j]+1;
    		 }
    	 }
    	 //res=min;
    	 if(min<=res){
    		 res=min;
    	 }
     }
     return res;
 }


}
