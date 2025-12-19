package m8;

public class Exercise4_3 {
	public static void main(String[] args) {

        // City coordinates
        double atlLat = 33.7489954, atlLon = -84.3879824;
        double orlLat = 28.5383355, orlLon = -81.3792365;
        double savLat = 32.0835407, savLon = -81.0998342;
        double chaLat = 35.2270869, chaLon = -80.8431267;

        // Distances between cities
        double atlOrl = distance(atlLat, atlLon, orlLat, orlLon);
        double orlSav = distance(orlLat, orlLon, savLat, savLon);
        double savAtl = distance(savLat, savLon, atlLat, atlLon);

        double atlCha = distance(atlLat, atlLon, chaLat, chaLon);
        double chaSav = distance(chaLat, chaLon, savLat, savLon);

        // Triangle areas
        double area1 = triangleArea(atlOrl, orlSav, savAtl);
        double area2 = triangleArea(atlCha, chaSav, savAtl);

        // Total area
        double totalArea = area1 + area2;

        System.out.println("The estimated area enclosed by the four cities is "
                + totalArea + " square kilometers.");
    }

    // Great-circle distance formula
    public static double distance(double lat1, double lon1,
                                  double lat2, double lon2) {
        final double R = 6371.01; // Earth radius in km

        double lat1Rad = Math.toRadians(lat1);
        double lon1Rad = Math.toRadians(lon1);
        double lat2Rad = Math.toRadians(lat2);
        double lon2Rad = Math.toRadians(lon2);

        return R * Math.acos(
                Math.sin(lat1Rad) * Math.sin(lat2Rad) +
                Math.cos(lat1Rad) * Math.cos(lat2Rad) *
                Math.cos(lon1Rad - lon2Rad)
        );
    }

    // Heron's formula
    public static double triangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
