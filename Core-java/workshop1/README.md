# Cab Invoice Generator

A Java-based cab service invoice generator that calculates fares for cab rides with support for both normal and premium ride categories.

## Features

### Step 1: Calculate Fare
- Calculates fare based on distance and time
- Cost: Rs. 10 per kilometer + Rs. 1 per minute
- Minimum fare: Rs. 5

### Step 2: Multiple Rides
- Supports multiple rides in a single invoice
- Calculates aggregate total for all rides

### Step 3: Enhanced Invoice
- Total Number of Rides
- Total Fare
- Average Fare Per Ride

### Step 4: Invoice Service
- Generates invoices based on user ID
- Retrieves rides from RideRepository

### Step 5: Premium Rides (Bonus)
- **Normal Rides**: Rs. 10 per km, Rs. 1 per minute, Minimum fare Rs. 5
- **Premium Rides**: Rs. 15 per km, Rs. 2 per minute, Minimum fare Rs. 20

## Project Structure

```
workshop/
├── Ride.java              # Represents a single cab ride
├── Invoice.java           # Represents an invoice with ride summary
├── RideRepository.java    # Stores rides for different users
├── InvoiceService.java    # Service to generate invoices
├── CabInvoiceGenerator.java # Main class with demo
└── README.md              # This file
```

## Classes Overview

### Ride.java
- Represents a single cab ride with distance, time, and ride type
- Contains enum `RideType` for NORMAL and PREMIUM rides
- Calculates fare based on ride type and parameters

### Invoice.java
- Contains total rides, total fare, and average fare per ride
- Provides formatted string representation

### RideRepository.java
- Stores rides for different users using a HashMap
- Provides methods to add rides and retrieve rides by user ID

### InvoiceService.java
- Main service class for generating invoices
- Can generate invoices from ride lists or user IDs
- Provides fare calculation methods

### CabInvoiceGenerator.java
- Main class with demonstration of all features
- Shows examples of single ride, multiple rides, user-based invoices, and premium rides

## How to Run

1. Compile all Java files:
   ```bash
   javac *.java
   ```

2. Run the main class:
   ```bash
   java CabInvoiceGenerator
   ```

## Example Output

The program demonstrates:
- Single ride fare calculation
- Multiple rides invoice generation
- User-based invoice generation
- Premium vs Normal ride comparison
- Minimum fare enforcement for both ride types

## Usage Examples

```java
// Create a normal ride
Ride normalRide = new Ride(5.0, 10); // 5 km, 10 minutes

// Create a premium ride
Ride premiumRide = new Ride(5.0, 10, Ride.RideType.PREMIUM);

// Calculate fare
double fare = normalRide.calculateFare();

// Generate invoice for multiple rides
List<Ride> rides = Arrays.asList(normalRide, premiumRide);
Invoice invoice = new Invoice(rides);

// Use invoice service
RideRepository repository = new RideRepository();
InvoiceService service = new InvoiceService(repository);
repository.addRide("user123", normalRide);
Invoice userInvoice = service.generateInvoice("user123");
```