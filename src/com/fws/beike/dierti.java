package com.fws.beike;
/*
 * ���ش�����ʼ�ˣ�Ϊ�˱�֤��ƽ��Ҫ��������������ؽ�СֵҪ���ڵ��ڽнϴ�ֵ��90%��
 * ��ô������N��������ܽ��ж��ٳ������أ���������֮��������һ������
 * ���룺
 * ��һ��N����ʾ����������2��=N��10��5�η���
 * �ڶ���N����������ʾ����
 * �����
 *   һ��������ʾ����ܽ��еı�������
 * */
import java.util.*;
public class dierti {
public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  String str1=sc.nextLine();
	  int N=Integer.parseInt(str1);
	  
	  String s=sc.nextLine();
	  String[] str2=s.split(" ");
	  int[] arr=new int[str2.length];
	  for(int i=0;i<str2.length;i++){
		 arr[i]=Integer.parseInt(str2[i]); 
	  }
	  int count=0;
	  for(int j=0;j<arr.length-1;j++){
		  for(int k=j+1;k<arr.length;k++){
			  if(arr[j]>arr[k]){
				  if(arr[k]>=0.9*arr[j])
					  count++;
			  }else{
				  if(arr[j]>=0.9*arr[k])
					  count++;
			  }
			  /*boolean flag=arr[j]>=(arr[k]*0.9);
			  if(flag==true){
				  count++;
			  }*/
		  }
	  }
	  System.out.println(count);
  }
}








