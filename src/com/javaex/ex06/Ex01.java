package com.javaex.ex06;


import java.util.HashSet;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		
		Set<Integer> iset = new HashSet<Integer>();
		
	/*	Integer i01 = (int) (Math.random()*45)+1;
		Integer i02 = (int) (Math.random()*45)+1;
		Integer i03 = (int) (Math.random()*45)+1;
		Integer i04 = (int) (Math.random()*45)+1;
		Integer i05 = (int) (Math.random()*45)+1;
		Integer i06 = (int) (Math.random()*45)+1;
		
		iset.add(i01);
		iset.add(i02);
		iset.add(i03);
		iset.add(i04);
		iset.add(i05);
		iset.add(i06);*/
		
		while(iset.size() < 6) {
			Integer i = (int) (Math.random()*45)+1;
			Integer num = 1;
			iset.add(i);
			i++;
			
		}
		
		
		System.out.println(iset.toString());
	
		
	}
}
