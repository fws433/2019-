package badapaixusuanfa;

import java.util.Arrays;
import java.util.Scanner;
/*
 * ѡ���������˼·��=���ڵ�һ�����ݣ�������һ�ֱȽϺ�õ���С�ļ�¼��Ȼ�󽫸ü�¼���һ����¼��λ�ý��н�����
 * �������Բ�������һ����¼�����������¼���еڶ��ֱȽϣ��õ���С�ļ�¼����ڶ�����¼����λ�ý���
 * */
public class xuanzepaixu {
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
    	String s=sc.nextLine();
    	String[] str=s.split(" ");
    	int[] arr=new int[str.length];
    	for(int i=0;i<str.length;i++){
    		arr[i]=Integer.parseInt(str[i]);
    	}
    	xzpaixu(arr);
    	System.out.println(Arrays.toString(arr));
    }
    public static void xzpaixu(int[] arr){
    	int temp=0;
    	int flag=0;
        for(int i=0;i<arr.length;i++){
        	temp=arr[i];
        	flag=i;
        	for(int j=i+1;j<arr.length;j++){
        		if(arr[j]<temp){
        			temp=arr[j];
        			flag=j;
        		}
        	}
        	if(flag!=i){
              arr[flag]=arr[i];
              arr[i]=temp;
        		
        	}
        }
    }
}





