package kedaxunfei911;

import java.util.Scanner;
/*
 *������Ӳ���ֱ��ʹ�û�����int���ͣ���Ϊint���Ա�ʾ���������ޣ�
 *�������������Ҫ�󡣿���ʹ���ַ�������ʾ������ģ�������ӵĹ��̡� 
 *
 *˼·��

��������1.��ת�����ַ��������ڴӵ�λ����λ��Ӻ����λ�Ľ�λ���º͵�λ�����ӣ�

            2.���������ַ����������ַ����ĸ�λ�á�0�����룬���ں������ӣ�

            3.��������������ӣ�һλһλ�ļӲ����Ͻ�λ��
 * */
public class zifuchuanmonizhengshuxiangjia {
   public static void main(String[] args){
	   Scanner sc=new Scanner(System.in);
	   String s1=sc.nextLine();
	   String s2=sc.nextLine();
	   System.out.println(fws(s1,s2));
   }
   public static  String fws(String s1,String s2){
	   StringBuffer result=new StringBuffer();
	   String n1=new StringBuffer(s1).reverse().toString();
	   String n2=new StringBuffer(s2).reverse().toString();
	   int len1=n1.length();
	   int len2=n2.length();
	   int ntaskOver=0;
	   boolean nOverflow=false;
	   int maxlen=len1>len2?len1:len2;
	   if(len1<len2){
		   for(int i=len1;i<len2;i++)
			   n1+="0";
	   }else if(len1>len2){
		   for(int i=len2;i<len1;i++)
			   n2+="0";
	   }
	   for(int i=0;i<maxlen;i++){
		   int nsum=Integer.parseInt(n1.charAt(i)+"")+Integer.parseInt(n2.charAt(i)+"");
		 
			   
		   if(nsum>=10){
			   if(i==maxlen-1)
				   nOverflow=true;
			  result.append(nsum-10+ntaskOver); 
			  ntaskOver=1;
		   }else{
			   result.append(nsum+ntaskOver);
			   ntaskOver=0;
		   }
	   }
	   if(nOverflow)
		   result.append(ntaskOver);
	   
	    return result.reverse().toString();
	   
   }
}









