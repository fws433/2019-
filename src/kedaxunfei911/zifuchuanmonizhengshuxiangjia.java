package kedaxunfei911;

import java.util.Scanner;
/*
 *大数相加不能直接使用基本的int类型，因为int可以表示的整数有限，
 *不能满足大数的要求。可以使用字符串来表示大数，模拟大数相加的过程。 
 *
 *思路：

　　　　1.反转两个字符串，便于从低位到高位相加和最高位的进位导致和的位数增加；

            2.对齐两个字符串，即短字符串的高位用‘0’补齐，便于后面的相加；

            3.把两个正整数相加，一位一位的加并加上进位。
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









