package badapaixusuanfa;

import java.util.Arrays;
import java.util.Scanner;
public class duipaixu {
   public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int[] arr=new int[n];
	   for(int i=0;i<n;i++)
		   arr[i]=sc.nextInt();
	   System.out.println("����ǰ��"+Arrays.toString(arr));
	   sort(arr);
	   System.out.println("�����"+Arrays.toString(arr));
   }

private static void sort(int[] arr) {
	for(int i=arr.length/2-1;i>=0;i--){
		//������׶���ӵ�һ����Ҷ�ӽڵ�������ϣ�������������ṹ
		adjustHeap(arr,i,arr.length);
	}
	//�����ѽ���������Ѷ�Ԫ�غ�ĩβԪ�أ�
	for(int i=arr.length-1;i>=0;i--){
		int temp=arr[0];
		arr[0]=arr[i];
		arr[i]=temp;
		adjustHeap(arr,0,i-1);
	}
	 
  }
private static void adjustHeap(int[] arr, int i, int length) {
	   int temp=arr[i];
	   for(int k=2*i+1;k<length;k=2*k+1){
		   if(k+1<length &&arr[k]<arr[k+1])
			   k++;
		   if(temp<arr[k]){
			   arr[i]=arr[k];
			   i=k;   
		   }
		   else
			   break;
	   }
	   arr[i]=temp;
   }
}







