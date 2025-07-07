package workshop1;

import java.util.Arrays;
import java.util.List;

public class CabInvoiceGenerator {
    public static void main(String[] args) {
        System.out.println("=== Cab Invoice Generator Demo ===\n");
        
        System.out.println("Step 1: Calculate Fare for Single Ride");
        InvoiceService invoiceService = new InvoiceService(new RideRepository());
        
        double fare1 = invoiceService.calculateFare(5.0, 10);
        System.out.printf("Fare for 5 km, 10 minutes: Rs. %.2f\n", fare1);
        
        double fare2 = invoiceService.calculateFare(0.5, 2);
        System.out.printf("Fare for 0.5 km, 2 minutes: Rs. %.2f (minimum fare)\n", fare2);
        
        System.out.println("\nStep 2 & 3: Multiple Rides and Enhanced Invoice");
        List<Ride> rides = Arrays.asList(
            new Ride(5.0, 10),
            new Ride(3.0, 5),
            new Ride(2.0, 3)
        );
        
        Invoice invoice = invoiceService.generateInvoice(rides);
        System.out.println(invoice);
        
        System.out.println("\nStep 4: Invoice Service with User ID");
        RideRepository repository = new RideRepository();
        InvoiceService userInvoiceService = new InvoiceService(repository);
        
        repository.addRide("user123", new Ride(5.0, 10));
        repository.addRide("user123", new Ride(3.0, 5));
        repository.addRide("user123", new Ride(2.0, 3));
        
        Invoice userInvoice = userInvoiceService.generateInvoice("user123");
        System.out.println("Invoice for user123:");
        System.out.println(userInvoice);
        
        System.out.println("\nStep 5: Premium Rides");
        List<Ride> premiumRides = Arrays.asList(
            new Ride(5.0, 10, Ride.RideType.PREMIUM),
            new Ride(3.0, 5, Ride.RideType.PREMIUM),
            new Ride(2.0, 3, Ride.RideType.NORMAL)
        );
        
        Invoice premiumInvoice = invoiceService.generateInvoice(premiumRides);
        System.out.println("Invoice with Premium and Normal Rides:");
        System.out.println(premiumInvoice);
        
        System.out.println("\nFare Comparison (5 km, 10 minutes):");
        double normalFare = invoiceService.calculateFare(5.0, 10, Ride.RideType.NORMAL);
        double premiumFare = invoiceService.calculateFare(5.0, 10, Ride.RideType.PREMIUM);
        System.out.printf("Normal Ride: Rs. %.2f\n", normalFare);
        System.out.printf("Premium Ride: Rs. %.2f\n", premiumFare);
        
        System.out.println("\nPremium Ride Minimum Fare Test (0.5 km, 2 minutes):");
        double premiumMinFare = invoiceService.calculateFare(0.5, 2, Ride.RideType.PREMIUM);
        System.out.printf("Premium Ride Fare: Rs. %.2f (minimum fare)\n", premiumMinFare);
    }
} 