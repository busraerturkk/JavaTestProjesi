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
		assertEquals("Toplama Sonuc yanlýþ !!!",-5,demo.Topla(5,-10 ));
	}
	
	@Test
	public void textCikarSonucDogrumu(){
		assertEquals("Çýkarma Sonuc yanlýþ !!!",15,demo.Cikar(5,-10 ));
	}
	
	@Test
	public void textCarpSonucDogrumu(){
		assertEquals("Çarpma Sonuc yanlýþ !!!",-50,demo.Carp(5,-10 ));
	}
	
	@Test
	public void textBolSonucDogrumu(){
		assertEquals("Bölme Sonuc yanlýþ !!!",0,demo.Bol(5f,-10f ));
	}
	
	@Test(expected = ArithmeticException.class)
	public void textBölSifirBölenDurumu(){
		demo.Bol(5,0);
	}
}
