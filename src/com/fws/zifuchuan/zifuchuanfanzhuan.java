package com.fws.zifuchuan;

import java.util.Scanner;
import java.util.Stack;
public class zifuchuanfanzhuan {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int len=s.length();
		Stack stack=new Stack();
		for(int i=0;i<len;i++){
			stack.push(s.charAt(i));
		}
		//StringBuffer out=new StringBuffer();
		String out="";
		while(!stack.isEmpty()){
			//out.append(stack.pop());
			out=out+stack.pop();
		}
		System.out.println(out);
		
	}
}
