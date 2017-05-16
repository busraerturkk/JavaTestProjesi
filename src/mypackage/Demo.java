package mypackage;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Demo demo = new Demo();
		
		try{
			while(true){
				int a,b;
				Scanner s = new Scanner( System.in );
				System.out.println("1.Sayi:");
				a = Integer.parseInt( s.nextLine() );
				System.out.println("2.Sayi:");
				b = Integer.parseInt( s.nextLine() );
				
				System.out.println("Topla: " + demo.Topla(a,b) );
				System.out.println("Cikar: " + demo.Cikar(a,b) );
				System.out.println("Çarp : " + demo.Carp(a,b) );
				
				try{
					System.out.println("Böl  : " + demo.Bol(a,b));
				}
				catch(ArithmeticException e){
					System.out.println(e.getMessage());
				}
				try{
					System.out.println("Mod  : " + demo.Mod(a,b));
				}
				catch(ArithmeticException e){
					System.out.println(e.getMessage());
				}
				try{
					System.out.println("Sqrt : " + demo.Karekok(a));
				}
				catch(ArithmeticException e){
					System.out.println(e.getMessage());
				}
				
				System.out.println("-------------------------");
				
			}
		}catch
		(NumberFormatException ex){
			System.out.println("Sayi yerine Harf girdiginizden dolayi program kapandi.");
		}
		
		
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
	
	/*
	 * 
	 */
	int Carp(int a ,int b){
		if(a== Integer.MAX_VALUE || b==Integer.MAX_VALUE)
			throw new ArithmeticException("integer max degerinden fazla");
		
		return a*b;
	}
	
	float Bol(float a,float b){
		if(b ==0)
			throw new ArithmeticException("bölen 0 olamaz");
		
		return (a/b);
	}
	int Mod(int a,int b){
		if(b ==0)
			throw new ArithmeticException("mod 0 olamaz");
		
		return (int)(a%b);
	}
	float Karekok(float a){
		if(a<0)
			throw new ArithmeticException("karekök içi negatif deðer olamaz");
		
		return (float) (Math.sqrt(a));
	}
}
