package workshop1;

import java.util.List;

public class InvoiceService {
    private RideRepository rideRepository;
    
    public InvoiceService(RideRepository rideRepository) {
        this.rideRepository = rideRepository;
    }
    
    public Invoice generateInvoice(String userId) {
        List<Ride> rides = rideRepository.getRides(userId);
        return new Invoice(rides);
    }
    
    public Invoice generateInvoice(List<Ride> rides) {
        return new Invoice(rides);
    }
    
    public double calculateFare(double distance, int time) {
        Ride ride = new Ride(distance, time);
        return ride.calculateFare();
    }
    
    public double calculateFare(double distance, int time, Ride.RideType rideType) {
        Ride ride = new Ride(distance, time, rideType);
        return ride.calculateFare();
    }
} 