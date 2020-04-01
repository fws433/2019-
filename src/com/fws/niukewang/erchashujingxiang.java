package com.fws.niukewang;
import java.util.*;
/*
 * 集合的编里
 * */
public class erchashujingxiang {
	public  static void main(String[] args){
	ArrayList<Integer>list=new ArrayList<>();
	ArrayList<Integer>newlist=new ArrayList<>();
	list.add(1);
	list.add(3);
	list.add(2);
	newlist.addAll(list);
	/*for(int str:newlist){
		System.out.println(str);
	  }*/
	for(int i=0;i<newlist.size();i++){
		System.out.println(newlist.get(i));
	}
	}
}
