package com.javaex.ex02;

public class Circle {
	//필드
	private int radius;
	//생성자
	public Circle() {
		super();
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	//메소드gs
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
}