package badapaixusuanfa;

import java.util.Arrays;
/*
 * ˼�룺�����÷ֶ���֮��˼�룬�Ѵ�Ĳ�ֳ�С�ģ�С���ٲ�ֳɸ�С�ģ�ԭ�����£�
 * ����һ����������ݣ�ͨ��һ������󣬽�ԭ���з�Ϊ�����֣�����ǰһ���ֵ��������ݾ��Ⱥ�һ����
 * ����������ҪС��Ȼ����һ�ζ�ǰ�������ֵ����ݽ��п������򣬵ݹ�ù��̣�ֱ�����������е�����
 * ������Ϊֹ��
 * 
 * ��������������������һ������Ϊ��׼������Ҫ����������ŵ��ˣ�����һ���������յ������������֪����������ɶ���ˣ���
 * Ϊ�˷��㣬���õ�һ����6��Ϊ��׼���ɡ�
 * ����������Ҫ��������������бȻ�׼�����������6���ұߣ��Ȼ�׼��С��������6����ߣ�����������������
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














