package badapaixusuanfa;

import java.util.Arrays;
/*
 * 思想：它采用分而治之的思想，把大的拆分成小的，小的再拆分成更小的，原理如下：
 * 对于一组给定的数据，通过一趟排序后，将原序列分为两部分，其中前一部分的所有数据均比后一部分
 * 的所有数据要小，然后再一次对前后两部分的数据进行快速排序，递归该过程，直到序列中所有的数据
 * 均有序为止。
 * 
 * 首先在这个序列中随便找一个数作为基准数（不要被这个名词吓到了，就是一个用来参照的数，待会你就知道它用来做啥的了）。
 * 为了方便，就让第一个数6作为基准数吧。
 * 接下来，需要将这个序列中所有比基准数大的数放在6的右边，比基准数小的数放在6的左边，类似下面这种排列
 * 
 * 
 * */
import java.util.Scanner;
public class kuaisupaixu {
  public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   String s=sc.nextLine();
	   String[] str=s.split(" ");
	   int len=str.length;
	   int[] arr=new int[len];
	   for(int i=0;i<len;i++)
		   arr[i]=Integer.parseInt(str[i]);
	   kspaixu(arr,0,len-1);
	   System.out.println(Arrays.toString(arr));
  }
  public static void kspaixu(int[] arr,int low,int high){
	  int i,j,temp;
	  i=low;
      j=high;
      temp=arr[i];
      while(i<j){
    	  while(arr[j]>=temp&&i<j){
    		  j--;
    	  }
    	  while(temp>=arr[i]&&i<j){
    		  i++;
    	  }
    	  if(i<j){
    		  int z=arr[i];
    		  int y=arr[j];
    		  arr[i]=y;
    		  arr[j]=z;
    	  }
      }
      arr[low]=arr[i];
      arr[i]=temp;
      kspaixu(arr,low,j-1);
      kspaixu(arr,j+1,high);
  }
}














