package com.fws.beike;
import java.util.*;
/*
 * СC����һ������ķ��������ز��ԣ�����һ����������е�����
 * ÿһ��������һ������ֵ��Ϊ�˱�֤�������ȶ����������
 * �е����󸺺ɱ��밴���ȵ�����ݼ��Ĺ���(�����������ݼ�Ҳ����)��
 *����[ 1��2��8��4��3 ]��[ 1��3��5 ]��[ 10 ]��Щ��������ɵģ�
 * ����һЩ������ģ�����[ 1��2��2��1 ]��[ 2��1��2 ]��[ 10��10 ]��
 * ���ڸ���һ��������У�����Զ�����ĸ���ֵ�������ӣ�
 * Ҫ�����������������ĸ���ֵ��ʹ��������������������ʹ��������������С�������ܺ͡�
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
