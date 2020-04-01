package com.fws.guanglianda;
/*
 * �� i ���˵�����Ϊ people[i]��ÿ�Ҵ����Գ��ص��������Ϊ limit��
          ÿ�Ҵ�����ͬʱ�����ˣ�����������Щ�˵�����֮�����Ϊ limit��
          �����ص�ÿһ�����������С������(��֤ÿ���˶��ܱ�����)��
    ʾ�� 1��
   ���룺people = [1,2], limit = 3
�����1
���ͣ�1 �Ҵ��� (1, 2)
ʾ�� 2��

���룺people = [3,2,2,1], limit = 3
�����3
���ͣ�3 �Ҵ��ֱ��� (1, 2), (2) �� (3)
ʾ�� 3��

���룺people = [3,5,3,4], limit = 5
�����4
���ͣ�4 �Ҵ��ֱ��� (3), (3), (4), (5)
��ʾ��

1 <= people.length <= 50000
1 <= people[i] <= limit <= 30000


 
 * 
 * */
import java.util.*;
public class jiushengting {
   public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	  // int limit=sc.nextInt();
	   String s=sc.nextLine();
	   int limit=sc.nextInt();
	   String[] str=s.split(",");
	   int len=str.length;
	   int[] arr=new int[len];
	   for(int i=0;i<len;i++){
		   arr[i]=Integer.parseInt(str[i]);
	   }
	   System.out.println(fws(arr,limit));
   }
   public static int fws(int[] arr,int limit){
	   /*Arrays.sort(arr);
	   int i=0,j=arr.length-1;
	   int ans=0;
	   while(i<=j){
		   ans++;
		   if(arr[i]+arr[j]<=limit){
			   i++;
		   }
		   j--;
	   }
	   return ans;*/
	   if(arr==null||arr.length==0)
		   return 0;
	   Arrays.sort(arr);
	   int res=0;
	   int i=0,j=arr.length-1;
	   while(i<=j){
		   res++;
		   if(arr[i]+arr[j]<=limit){
			   i++;
		   }
		   j--;
	   }
	   return res;
	   
   }
}













