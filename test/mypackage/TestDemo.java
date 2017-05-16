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

	/*@Test(expected = ArithmeticException.class)
	public void testToplaInputMax(){
		demo.Topla(Integer.MAX_VALUE, 0);
		demo.Topla(0, Integer.MAX_VALUE);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testCikarInputMax(){
		demo.Cikar(Integer.MAX_VALUE, 0);
		demo.Cikar(0, Integer.MAX_VALUE);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testCarpInputMax(){
		demo.Carp(Integer.MAX_VALUE, 0);
		demo.Carp(0, Integer.MAX_VALUE);
	}*/
	
	@Test
	public void testToplaSonucDogrumu(){
		assertEquals("Toplama Sonuc yanlis !!!",-5,demo.Topla(5,-10 ));
	}
	
	@Test
	public void testCikarSonucDogrumu(){
		assertEquals("Çýkarma Sonuc yanlis !!!",15,demo.Cikar(5,-10 ));
	}
	
	@Test
	public void testCarpSonucDogrumu(){
		assertEquals("Çarpma Sonuc yanlis !!!",-50,demo.Carp(5,-10 ));
	}
	
	@Test
	public void testBolSonucDogrumu(){
		assertEquals("Bölme Sonuc yanlis !!!",-0.5,demo.Bol(5,-10 ),0.0001);
	}
	@Test
	public void testModSonucDogrumu(){
		assertEquals("Mod Sonuc yanlis !!!",1,demo.Mod(5,2 ));
	}
	
	@Test
	public void testKarekokSonucDogrumu(){
		assertEquals("Karekök Sonuc yanlis !!!",2,demo.Karekok(4 ),0.0001);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testBolSifirBölenDurumu(){
		demo.Bol(5,1);
		demo.Bol(5,0);
	}
	@Test(expected = ArithmeticException.class)
	public void testModSifirDurumu(){
		demo.Mod(5,1);
		demo.Mod(5,0);
	}
	@Test(expected = ArithmeticException.class)
	public void testKarekokNegatifDurumu(){
		demo.Karekok(2);
		demo.Karekok(-2);
	}
	
	
}