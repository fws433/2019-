package com.fws.guanglianda;
/*
 * 第 i 个人的体重为 people[i]，每艘船可以承载的最大重量为 limit。
          每艘船最多可同时载两人，但条件是这些人的重量之和最多为 limit。
          返回载到每一个人所需的最小船数。(保证每个人都能被船载)。
    示例 1：
   输入：people = [1,2], limit = 3
输出：1
解释：1 艘船载 (1, 2)
示例 2：

输入：people = [3,2,2,1], limit = 3
输出：3
解释：3 艘船分别载 (1, 2), (2) 和 (3)
示例 3：

输入：people = [3,5,3,4], limit = 5
输出：4
解释：4 艘船分别载 (3), (3), (4), (5)
提示：

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













