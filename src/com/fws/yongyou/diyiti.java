package com.fws.yongyou;
import java.util.*;

/*
 * ��Ŀ�������������������������ַ����ĳ˻������������ܽ��ַ���ת������
    ��������������һ�����飬�ɰ�Ƕ��ŷָ�������������ɣ�ÿ�����ָ���С��10���Ҳ���0��ͷ��������������ֻ��һ��0��
    ��������������� ����������˵Ľ��

 * */
public class diyiti {
 public static void main(String[] args){
	 Scanner sc=new Scanner(System.in);
	 String s=sc.nextLine();
	 int mid=s.indexOf(",");
	 String pre=s.substring(0,mid);
	 String aft=s.substring(mid+1,s.length());
	 long m=Integer.parseInt(pre);
	 long n=Integer.parseInt(aft);
	 long mn=m*n;
	 System.out.println(mn);
  }
}
