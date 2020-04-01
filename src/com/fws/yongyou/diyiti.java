package com.fws.yongyou;
import java.util.*;

/*
 * 题目描述：将两个代表正整数的字符串的乘积结果输出，不能将字符串转成数组
    输入描述：输入一行数组，由半角逗号分隔的两组数字组成，每组数字个数小于10，且不以0开头，除非这组数据只有一个0，
    输出描述：输出结果 两组数字相乘的结果

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
