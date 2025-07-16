import java.lang.Math;

public class VolumeOfEarth {
    public static void main(String[] args) {
        double radius = 6378; // in km
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        double volumeMiles3 = volumeKm3 * (0.621371 * 0.621371 * 0.621371); // Convert km^3 to miles^3
        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f%n", volumeKm3,
                volumeMiles3);
    }
}
