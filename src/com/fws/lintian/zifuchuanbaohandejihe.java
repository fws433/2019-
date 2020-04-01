package com.fws.lintian;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
/*
 * 每组数据输入一个字符串，求出该字符串的字符集合
 * 输入描述：每组数据输入一个字符串，字符串最大长度为100，且只包含字母，不可能为空，区分大小写、
 * 输出描述：
 * 每组数据一行，按字符串原有的字符顺序，输出字符集合，即重复出现并靠后的字母不输出
 * 
 * 输入：abcqweracb
 * 输出：abcqwer
 * */
public class zifuchuanbaohandejihe {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			/*System.out.println("请输入：");
			String str=sc.next();*/
			String str=sc.nextLine();
			char[] ch=str.toCharArray();
			StringBuffer sb=new StringBuffer();
			Set<Character> set=new HashSet<>();
			int len=ch.length;
			for(int i=0;i<len;i++){
				if(set.add(ch[i])){
					sb.append(ch[i]);
				}
			}
			System.out.println(sb.toString());
			
		}
	}
}
