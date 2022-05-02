package com.javaex.ex02;


public class MyList<T> {

	//필드
	private T[] oArray;
	private int crtPos; //다음에 추가할 방번호
	//생성자
	public MyList() {
		//배열 3개짜리 --> 원래는 만들지않음
		oArray = (T[])new Object[3];
		crtPos = 0;
	}
	//메소드 gs
	
	
	//메소드 일반
	public void add(T obj) {
		//현재배열갯수 +1
		//기존배열의 내용은 그대로복사
		//마지막방에 point를 대입
		
		oArray[crtPos] = obj;
		crtPos = crtPos+1;
		
	}
	
	public int size() {
		return crtPos;
	}
	public T get(int index) {
		return oArray[index];
	}
}
