package com.fws.guanglianda;

/*
 * ��дһ���㷨���ж��ǲ�������
 *ע�⣺ÿһ���ǿ������ܻ��㵽89������ֻҪ�����89�������һ�����ǿ�����
 * */
import java.util.*;
public class happyNumeber {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(solution(a));
	}
	public static boolean solution(int n){
		while(n!=1){
			int flag=getnext(n);
			if(flag==1)
				return true;
			else if(flag==89)
				return false;
			else
				n=flag;
						
		}
	     return true;
	}
	public static int getnext(int n){
		int result=0;
		while(n!=0){
			result=result+((n%10)*(n%10));
			n=n/10;
		}
		return result;
		
	}
}
