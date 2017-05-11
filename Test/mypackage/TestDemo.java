package mypackage;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class TestDemo {

	Demo demo;
	
	@Before
	public void test() {
		demo = new Demo();
	}

	@Test(expected = ArithmeticException.class)
	public void textToplaInputMax(){
		demo.Topla(Integer.MAX_VALUE, 0);
		demo.Topla(0, Integer.MAX_VALUE);
	}
	
	@Test(expected = ArithmeticException.class)
	public void textCikarInputMax(){
		demo.Cikar(Integer.MAX_VALUE, 0);
		demo.Cikar(0, Integer.MAX_VALUE);
	}
	
	@Test(expected = ArithmeticException.class)
	public void textCarpInputMax(){
		demo.Carp(Integer.MAX_VALUE, 0);
		demo.Carp(0, Integer.MAX_VALUE);
	}
	
	@Test
	public void textToplaSonucDogrumu(){
		assertEquals("Toplama Sonuc yanl�� !!!",-5,demo.Topla(5,-10 ));
	}
	
	@Test
	public void textCikarSonucDogrumu(){
		assertEquals("��karma Sonuc yanl�� !!!",15,demo.Cikar(5,-10 ));
	}
	
	@Test
	public void textCarpSonucDogrumu(){
		assertEquals("�arpma Sonuc yanl�� !!!",-50,demo.Carp(5,-10 ));
	}
	
	@Test
	public void textBolSonucDogrumu(){
		assertEquals("B�lme Sonuc yanl�� !!!",0,demo.Bol(5f,-10f ));
	}
	
	@Test(expected = ArithmeticException.class)
	public void textB�lSifirB�lenDurumu(){
		demo.Bol(5,0);
	}
}
