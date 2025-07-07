package workshop1;

public class Ride {
    private double distance;
    private int time;
    private RideType rideType;
    
    public enum RideType {
        NORMAL(10, 1, 5),
        PREMIUM(15, 2, 20);
        
        private final double costPerKm;
        private final double costPerMinute;
        private final double minimumFare;
        
        RideType(double costPerKm, double costPerMinute, double minimumFare) {
            this.costPerKm = costPerKm;
            this.costPerMinute = costPerMinute;
            this.minimumFare = minimumFare;
        }
        
        public double getCostPerKm() {
            return costPerKm;
        }
        
        public double getCostPerMinute() {
            return costPerMinute;
        }
        
        public double getMinimumFare() {
            return minimumFare;
        }
    }
    
    public Ride(double distance, int time) {
        this.distance = distance;
        this.time = time;
        this.rideType = RideType.NORMAL;
    }
    
    public Ride(double distance, int time, RideType rideType) {
        this.distance = distance;
        this.time = time;
        this.rideType = rideType;
    }
    
    public double getDistance() {
        return distance;
    }
    
    public int getTime() {
        return time;
    }
    
    public RideType getRideType() {
        return rideType;
    }
    
    public double calculateFare() {
        double fare = (distance * rideType.getCostPerKm()) + (time * rideType.getCostPerMinute());
        return Math.max(fare, rideType.getMinimumFare());
    }
} 