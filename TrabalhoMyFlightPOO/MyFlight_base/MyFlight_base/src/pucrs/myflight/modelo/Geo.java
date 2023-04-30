package pucrs.myflight.modelo;

public class Geo {
	private double latitude;
	private double longitude;
	public static final double rad = 6371;
	
	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}

	public static double calcDistancia(double lat1, double long1, double lat2, double long2) {
		double distLat = Math.toRadians(lat2 - lat1);
		double distLong = Math.toRadians(long2 - long1);
		double a = Math.sin(distLat / 2) * Math.sin(distLat / 2) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.sin(distLong / 2) * Math.sin(distLong / 2);
		double c = 2 * Math.asin(Math.sqrt(a));
		double distancia = rad * c;
		return distancia;
	}
	
}
