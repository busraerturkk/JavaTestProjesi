package mypackage;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
	}
	
	int Topla(int a ,int b){
		if(a== Integer.MAX_VALUE || b==Integer.MAX_VALUE)
			throw new ArithmeticException("integer max degerinden fazla");
		
		return a+b;
	}
	
	int Cikar(int a,int b){
		if(a== Integer.MAX_VALUE || b==Integer.MAX_VALUE)
			throw new ArithmeticException("integer max degerinden fazla");
		
		return a-b;
	}
	
	int Carp(int a ,int b){
		if(a== Integer.MAX_VALUE || b==Integer.MAX_VALUE)
			throw new ArithmeticException("integer max degerinden fazla");
		
		return a*b;
	}
	
	int Bol(float a,float b){
		if(b ==0)
			throw new ArithmeticException("bölen 0 olamaz");
		
		return (int)(a/b);
	}
}
