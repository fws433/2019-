package badapaixusuanfa;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 选择排序基本思路：=对于第一轮数据，经过第一轮比较后得到最小的记录，然后将该记录与第一个记录的位置进行交换，
 * 接下来对不包括第一个记录以外的其他记录进行第二轮比较，得到最小的记录并与第二个记录进行位置交换
 * */
public class xuanzepaixu {
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	String s=sc.nextLine();
    	String[] str=s.split(" ");
    	int[] arr=new int[str.length];
    	for(int i=0;i<str.length;i++){
    		arr[i]=Integer.parseInt(str[i]);
    	}
    	xzpaixu(arr);
    	System.out.println(Arrays.toString(arr));
    }
    public static void xzpaixu(int[] arr){
    	int temp=0;
    	int flag=0;
        for(int i=0;i<arr.length;i++){
        	temp=arr[i];
        	flag=i;
        	for(int j=i+1;j<arr.length;j++){
        		if(arr[j]<temp){
        			temp=arr[j];
        			flag=j;
        		}
        	}
        	if(flag!=i){
              arr[flag]=arr[i];
              arr[i]=temp;
        		
        	}
        }
    }
}





