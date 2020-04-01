package badapaixusuanfa;
import java.util.Arrays;
/*
 * 八大排序算法之一直接插入排序算法
 * 思想：就是在有序的序列中依次插入一个元素使他继续成为有序的序列，知道最后一个元素完成
 * 时间复杂度：0(n^2)
 * 在小规模数据或者基本有序时十分高效
 * */
import java.util.Scanner;
public class zhijiecharupaixu {
     public static void main(String[] args){
    	 Scanner sc=new Scanner(System.in);
    	 //1输入一行字符串，用空格符号隔开
    	 System.out.println("输入一行数字：");
    	 //int n=sc.nextInt();
    	 String s=sc.nextLine();
    	 //2将字符串转换为字符数组
    	 String[] str1=s.split(" ");
    	 int len=str1.length;
    	 int[] arr=new int[len];
    	 for(int i=0;i<len;i++){
    		 //3将字符数组转换为int数组
    		 arr[i]=Integer.parseInt(str1[i]);
    	 }
    	 //输出arr数组
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







