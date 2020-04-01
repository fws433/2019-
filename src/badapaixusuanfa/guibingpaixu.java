package badapaixusuanfa;
import java.util.Arrays;
/*
 * 
 * �鲢����
 * :����ǵݹ����˼���������۰�ķ���Ϊ�������飬
 * �����ǽ��ֿ������ݰ��մ�С������ߴӴ�С��˳��ŵ�һ��������
 * 
 * */
import java.util.Scanner;
public class guibingpaixu {
  public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  String s=sc.nextLine();
	  String[] str=s.split(" ");
	  int len=str.length;
	  int[] arr=new int[len];
	  for(int i=0;i<len;i++){
		  arr[i]=Integer.parseInt(str[i]);
	  }
	  MergeSort(arr,0,len-1);
	  System.out.println(Arrays.toString(arr));
  }
  public static void MergeSort(int[] arr,int p,int r){
	  if(p<r){
		  int q=(p+r)/2;
		 MergeSort(arr,p,q);
		 MergeSort(arr,q+1,r);
		 Merge(arr,p,q,r);
	  }
   }
  public static void Merge(int[] arr,int left,int mid,int right){
	  int[] tmp=new int[arr.length];
	  int p1=left,p2=mid+1,k=left;
	  while(p1<=mid &&p2<=right){
		  if(arr[p1]<=arr[p2])
			  tmp[k++]=arr[p1++];
		  else
			  tmp[k++]=arr[p2++];
	  }
	  while(p1<=mid)
		  tmp[k++]=arr[p1++];
	  while(p2<=right)
		  tmp[k++]=arr[p2++];
	  for(int i=left;i<=right;i++)
		  arr[i]=tmp[i];
	  
  }
  
  
}





