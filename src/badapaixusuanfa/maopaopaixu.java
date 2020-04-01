package badapaixusuanfa;
import java.util.Arrays;
import java.util.Scanner;
public class maopaopaixu {
   public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   String s=sc.nextLine();
	   String[] str=s.split(" ");
	   int len=str.length;
	   int[] arr=new int[len];
	   for(int i=0;i<len;i++){
		   arr[i]=Integer.parseInt(str[i]);
	   }
	   mppaixu(arr);
	   System.out.println(Arrays.toString(arr));
   }
   public static void mppaixu(int[] arr){
	   int temp=0;
	  for(int i=0;i<arr.length-1;i++){
		  for(int j=0;j<arr.length-i-1;j++){
			  if(arr[j]>arr[j+1]){
				  temp=arr[j];
				  arr[j]=arr[j+1];
				  arr[j+1]=temp;
			  }
		  }
	  }
   }
}
