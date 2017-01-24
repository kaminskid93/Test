package util;

public class Util {

	public static final double MILES_TO_KM = 1.60934;
	public static final double KM_TO_MILES = 0.621371;
	
	public static double kmToMiles(double km) {
		return km * KM_TO_MILES;
	}
	
	public static double milesToKm(double miles) {
		return miles * MILES_TO_KM;
	}
	
}
