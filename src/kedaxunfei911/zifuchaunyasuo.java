package kedaxunfei911;

/*
 * 相同字符连续，则压缩为数字个数+字符如"aaabb"压缩为3a2b
 * 
 * */
import java.util.Scanner;
public class zifuchaunyasuo {
  public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    System.out.println(fws(s));
  }
  public static String fws(String s){
	  int count=1;
	  StringBuffer s1=new StringBuffer();
	  int i=1;
	  char ch=s.charAt(0);
	  int len=s.length();
	  for(;;){
		 char c=(i==len?'\10':s.charAt(i));
		  if(ch==c){
			  count++;
		  }else{
			  if(count==1)
				  s1.append(ch);
			  else{
				  s1.append(count).append(ch);
				  count=1;
				  ch=s.charAt(i);
			  }
		  }
		  i++;
		  if(i==(len+1))
			  break;
	  }
	  return s1.toString();
  }
}
