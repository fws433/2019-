package badapaixusuanfa;

import java.util.*;
public class tongpaixu {
	

public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int[] arr=new int[n];
	   for(int i=0;i<n;i++){
		   arr[i]=sc.nextInt();
	   }
	   //System.out.println(Arrays.toString(arr));
	   //System.out.println(bucketSort(arr));
	   bucketSort(arr);
	   
   }
   /*public static void bucketSort(int[] arr){
	   
   }*/

private static void bucketSort(int[] arr) {
	// TODO Auto-generated method stub
	System.out.println("ÅÅÐòÇ°Êý×é£º"+Arrays.toString(arr));
	System.out.println();
	int min=arr[0],max=arr[0];
	for(int i=0;i<arr.length;i++){
		if(arr[i]>max)
			max=arr[i];
		if(arr[i]<min)
			min=arr[i];
	}
	int len=max-min+1;
	int[] array=new int[len];
	for(int i=0;i<arr.length;i++){
		array[arr[i]-min]++;
	}
	System.out.println(Arrays.toString(array));
	int k=0;
	for(int i=0;i<array.length;i++){
		for(int j=0;j<array[i];j++){
			System.out.print(i+min+" ");
		}
	}
	
	
	//return null;
   }
}









