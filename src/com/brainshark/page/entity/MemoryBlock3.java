package com.brainshark.page.entity;

public class MemoryBlock3 {

	private int a = -1;
	private int b = -1;
	private int c = -1;
	private boolean lackPage = false;
	private boolean replacePage = false;

	public MemoryBlock3() {
		super();
	}

	public MemoryBlock3(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public boolean isLackPage() {
		return lackPage;
	}

	public void setLackPage(boolean lackPage) {
		this.lackPage = lackPage;
	}

	public boolean isReplacePage() {
		return replacePage;
	}

	public void setReplacePage(boolean replacePage) {
		this.replacePage = replacePage;
	}

	@Override
	public String toString() {
		return "\t\t" + a + "\t\t" + b + "\t\t" + c + "\t\t" + lackPage + "\t\t" + replacePage;
	}

}