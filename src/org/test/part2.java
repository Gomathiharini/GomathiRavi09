package org.test;

import java.util.ArrayList;
import java.util.List;

public class part2 {
	public static void main(String[] args) {
		List <Integer>li=new ArrayList<Integer>();
		
		li.add(10);
		li.add(50);
		li.add(40);
		li.add(20);
		li.add(30);
		li.add(60);
		li.add(10);
		System.out.println(li);
		//number of value in list
		int p=li.size();
		System.out.println(p);
		
		//remove value at particular index
		li.remove(3);
		System.out.println(li);
		//replace value at particular index
		li.set(3, 90);
		System.out.println(li);
		//find out index position of particular letter
		int f=li.indexOf(10);
		System.out.println(f);
		//find out last index position of particular letter
		int f1=li.lastIndexOf(10);
		System.out.println(f1);
		//check whether list contains that value or not
		boolean b=li.contains(30);
		System.out.println(b);
	}
}
