package com.brainshark.page.entity;

public class MemoryBlock4 {

	private int a = -1;
	private int b = -1;
	private int c = -1;
	private int d = -1;
	private boolean lackPage = false;
	private boolean replacePage = false;

	public MemoryBlock4() {
		super();
	}

	public MemoryBlock4(int a, int b, int c, int d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
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

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
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
		return "\t\t" + a + "\t\t" + b + "\t\t" + c + "\t\t" + d + "\t\t" + lackPage + "\t\t" + replacePage;
	}

}
