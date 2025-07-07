package workshop1;

import java.util.List;

public class Invoice {
    private int totalRides;
    private double totalFare;
    private double averageFarePerRide;
    
    public Invoice(List<Ride> rides) {
        this.totalRides = rides.size();
        this.totalFare = rides.stream()
                .mapToDouble(Ride::calculateFare)
                .sum();
        this.averageFarePerRide = totalRides > 0 ? totalFare / totalRides : 0;
    }
    
    public int getTotalRides() {
        return totalRides;
    }
    
    public double getTotalFare() {
        return totalFare;
    }
    
    public double getAverageFarePerRide() {
        return averageFarePerRide;
    }
    
    @Override
    public String toString() {
        return String.format("Invoice Summary:\n" +
                "Total Number of Rides: %d\n" +
                "Total Fare: Rs. %.2f\n" +
                "Average Fare Per Ride: Rs. %.2f",
                totalRides, totalFare, averageFarePerRide);
    }
} 