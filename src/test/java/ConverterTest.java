import static org.junit.Assert.*;

import org.junit.Test;

public class ConverterTest {

	Converter converter = new Converter();
	
	@Test
	public void testdegToRad() {
//		System.out.println(converter.degToRad("1"));
//		System.out.println(Math.toRadians(1));
		assertEquals(converter.degToRad("1"), String.valueOf(Math.toRadians(1)));
		
		
	}
	@Test
	public void testRadToDeg() {
//		System.out.println(converter.radToDeg("1"));
//		System.out.println(Math.toDegrees(1));
		assertEquals(converter.radToDeg("1"), String.valueOf(Math.toDegrees(1)));
		
		
	}

}
