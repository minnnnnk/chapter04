package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class MyListApp {
	
	public static void main(String[] args) {
		
		List<Point> pList = new ArrayList<Point>(); 
		
		Point p01 = new Point(3,5);
		Point p02 = new Point(13,15);
		Point p03 = new Point(113,115);
		
		Point p04 = new Point(100,101);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		System.out.println(pList.size());
		System.out.println(pList.get(0).getX());
		System.out.println(pList.get(0).getY());
		System.out.println(pList.get(0).toString());
		System.out.println("-----------------");
		for (int i = 0; i<pList.size(); i++) {
			System.out.println(pList.get(i));
		}
		
		pList.remove(1);
		//pList.remove(p02);
		System.out.println("-----------------");
		for (int i = 0; i<pList.size(); i++) {
			System.out.println(pList.get(i));
		}
		
		System.out.println("------------");
		System.out.println(pList.toString()); // Point toString() 구분할것
		
		System.out.println("-----------------");
		
		//for 다른표현 --> 향상된 for문
		
		for(Point p :pList) { //무조건 끝까지
			System.out.println(p.toString());
			System.out.println(p.getX());
			System.out.println(p.getY());
		}
		System.out.println("-----------------");
		//p04 를 2번째에 넣을때
		//pList.add(p04);
		pList.add(1, p04);		
		
		for(Point p :pList) { //무조건 끝까지
			System.out.println(p.toString());
		
		}
				
	}
}
