package kedaxunfei911;

import java.math.BigInteger;
import java.util.Scanner;
/*
 * 
 * 请实现一个加法计数器，要求满足任意大小两个数相加
 * 
 * 
 * */
public class diyitirengyishuxaingjia {
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	BigInteger b1=sc.nextBigInteger();
    	BigInteger b2=sc.nextBigInteger();
    	BigInteger add=b1.add(b2);
    	System.out.println(add);
    	
    	//BigInteger b1=new BigInteger();

    }
}
