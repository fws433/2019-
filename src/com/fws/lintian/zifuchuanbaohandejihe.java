package com.fws.lintian;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
/*
 * ÿ����������һ���ַ�����������ַ������ַ�����
 * ����������ÿ����������һ���ַ������ַ�����󳤶�Ϊ100����ֻ������ĸ��������Ϊ�գ����ִ�Сд��
 * ���������
 * ÿ������һ�У����ַ���ԭ�е��ַ�˳������ַ����ϣ����ظ����ֲ��������ĸ�����
 * 
 * ���룺abcqweracb
 * �����abcqwer
 * */
public class zifuchuanbaohandejihe {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			/*System.out.println("�����룺");
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
