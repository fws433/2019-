package badapaixusuanfa;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 希尔排序：为改进后的直接插入排序，先取一个增量一般是数组的一半，在增量组成的序列中进行直接插入排序
 * 时间复杂度为o(n^1/3)属于o(nlogn)~o(n^2),平均复杂度为o(n),
 * 
 * 
 * 
 * */
public class xierpaixu {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] str1=s.split(" ");
		int len=str1.length;
		int[] arr=new int[len];
		for(int i=0;i<len;i++){
			arr[i]=Integer.parseInt(str1[i]);
		}
		xrpaixu(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void xrpaixu(int[] arr){
		if(arr==null||arr.length==0||arr.length==1){
			return ;
		}
		int increase=arr.length/2;
		while(increase!=0){
			for(int i=0;i<arr.length;i++){
				for(int j=i;j<arr.length-increase;j=j+increase){
					if(arr[j]>arr[j+increase]){
						int temp=arr[j];
						arr[j]=arr[j+increase];
						arr[j+increase]=temp;
					}
				}
			}
			increase=increase/2;
		}
	}
}







