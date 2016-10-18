import java.math.*;

public class Converter {
	
	/**
	 * degrees to radians
	 * @param deg
	 * @return
	 */
	public String degToRad(String deg){
		double degrees = Double.parseDouble(deg);
		double rad = 0.0;
		rad = degrees * (Math.PI / 180);
		//System.out.println(rad);
		String stringrad = String.valueOf(rad);
		return stringrad;
		
		
	}
/**
 * radians to degrees
 * @param rad
 * @return
 */
	public String radToDeg(String rad){
		
		double radians = Double.parseDouble(rad);
		double degrees = 0.0;
		degrees = radians * (180)/Math.PI;
	//	System.out.println(degrees);
		String stringdeg = String.valueOf(degrees);
		return stringdeg;
		
	}
}

