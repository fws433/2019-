package badapaixusuanfa;
import java.util.Arrays;
/*
 * �˴������㷨֮һֱ�Ӳ��������㷨
 * ˼�룺��������������������β���һ��Ԫ��ʹ��������Ϊ��������У�֪�����һ��Ԫ�����
 * ʱ�临�Ӷȣ�0(n^2)
 * ��С��ģ���ݻ��߻�������ʱʮ�ָ�Ч
 * */
import java.util.Scanner;
public class zhijiecharupaixu {
     public static void main(String[] args){
    	 Scanner sc=new Scanner(System.in);
    	 //1����һ���ַ������ÿո���Ÿ���
    	 System.out.println("����һ�����֣�");
    	 //int n=sc.nextInt();
    	 String s=sc.nextLine();
    	 //2���ַ���ת��Ϊ�ַ�����
    	 String[] str1=s.split(" ");
    	 int len=str1.length;
    	 int[] arr=new int[len];
    	 for(int i=0;i<len;i++){
    		 //3���ַ�����ת��Ϊint����
    		 arr[i]=Integer.parseInt(str1[i]);
    	 }
    	 //���arr����
    	 zjcrpaixu(arr);
    	 System.out.println(Arrays.toString(arr)); 
     }
     public static void zjcrpaixu(int[] arr){
    	 if(arr==null||arr.length==0 || arr.length==1){
    		 return ;
    	 }
    	 for(int i=1;i<arr.length;i++){
    		 for(int j=0;j<i;j++){
    			 if(arr[i]<arr[j]){
    			    int temp=arr[j];
    			    arr[j]=arr[i];
    			    arr[i]=temp;
    			    
    			 }
    		 }
    	 }
     }
}







