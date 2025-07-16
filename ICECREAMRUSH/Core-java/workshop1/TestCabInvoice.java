package workshop1;

import java.util.Arrays;
import java.util.List;

public class TestCabInvoice {
    public static void main(String[] args) {
        System.out.println("=== Cab Invoice Generator Test Cases ===\n");
        
        testSingleRideFare();
        
        testMultipleRides();
        
        testUserBasedInvoice();
        
        testPremiumRides();
    }
    
    private static void testSingleRideFare() {
        System.out.println("1. Testing Single Ride Fare Calculation:");
        System.out.println("========================================");
        
        InvoiceService service = new InvoiceService(new RideRepository());
        
        double fare1 = service.calculateFare(5.0, 10);
        System.out.printf("Distance: 5.0 km, Time: 10 minutes\n");
        System.out.printf("Expected: Rs. 60.00 (5*10 + 10*1)\n");
        System.out.printf("Actual: Rs. %.2f\n", fare1);
        System.out.println();
        
        double fare2 = service.calculateFare(0.5, 2);
        System.out.printf("Distance: 0.5 km, Time: 2 minutes\n");
        System.out.printf("Expected: Rs. 5.00 (minimum fare)\n");
        System.out.printf("Actual: Rs. %.2f\n", fare2);
        System.out.println();
    }
    
    private static void testMultipleRides() {
        System.out.println("2. Testing Multiple Rides Invoice:");
        System.out.println("===================================");
        
        InvoiceService service = new InvoiceService(new RideRepository());
        
        List<Ride> rides = Arrays.asList(
            new Ride(5.0, 10),
            new Ride(3.0, 5),
            new Ride(2.0, 3)
        );
        
        Invoice invoice = service.generateInvoice(rides);
        System.out.println("Rides: 5km/10min, 3km/5min, 2km/3min");
        System.out.println("Expected Total: Rs. 118.00");
        System.out.println("Expected Average: Rs. 39.33");
        System.out.println(invoice);
        System.out.println();
    }
    
    private static void testUserBasedInvoice() {
        System.out.println("3. Testing User-Based Invoice Service:");
        System.out.println("======================================");
        
        RideRepository repository = new RideRepository();
        InvoiceService service = new InvoiceService(repository);
        
        repository.addRide("john_doe", new Ride(10.0, 15));
        repository.addRide("john_doe", new Ride(2.5, 8));
        repository.addRide("john_doe", new Ride(1.0, 3));
        
        Invoice userInvoice = service.generateInvoice("john_doe");
        System.out.println("User: john_doe");
        System.out.println("Rides: 10km/15min, 2.5km/8min, 1km/3min");
        System.out.println(userInvoice);
        System.out.println();
    }
    
    private static void testPremiumRides() {
        System.out.println("4. Testing Premium Rides:");
        System.out.println("=========================");
        
        InvoiceService service = new InvoiceService(new RideRepository());
        
        double distance = 5.0;
        int time = 10;
        
        double normalFare = service.calculateFare(distance, time, Ride.RideType.NORMAL);
        double premiumFare = service.calculateFare(distance, time, Ride.RideType.PREMIUM);
        
        System.out.printf("Distance: %.1f km, Time: %d minutes\n", distance, time);
        System.out.printf("Normal Ride: Rs. %.2f (%.1f*10 + %d*1)\n", normalFare, distance, time);
        System.out.printf("Premium Ride: Rs. %.2f (%.1f*15 + %d*2)\n", premiumFare, distance, time);
        System.out.println();
        
        double premiumMinFare = service.calculateFare(0.5, 2, Ride.RideType.PREMIUM);
        System.out.printf("Premium Ride (0.5km, 2min): Rs. %.2f (minimum fare)\n", premiumMinFare);
        System.out.println();
        
        List<Ride> mixedRides = Arrays.asList(
            new Ride(5.0, 10, Ride.RideType.NORMAL),
            new Ride(3.0, 5, Ride.RideType.PREMIUM),
            new Ride(2.0, 3, Ride.RideType.NORMAL)
        );
        
        Invoice mixedInvoice = service.generateInvoice(mixedRides);
        System.out.println("Mixed Ride Types Invoice:");
        System.out.println("Rides: Normal(5km/10min), Premium(3km/5min), Normal(2km/3min)");
        System.out.println(mixedInvoice);
    }
} 