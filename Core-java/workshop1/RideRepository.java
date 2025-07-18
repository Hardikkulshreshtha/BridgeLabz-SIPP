package workshop1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RideRepository {
    private Map<String, List<Ride>> userRides;
    
    public RideRepository() {
        this.userRides = new HashMap<>();
    }
    
    public void addRide(String userId, Ride ride) {
        userRides.computeIfAbsent(userId, k -> new ArrayList<>()).add(ride);
    }
    
    public List<Ride> getRides(String userId) {
        return userRides.getOrDefault(userId, new ArrayList<>());
    }
    
    public boolean hasUser(String userId) {
        return userRides.containsKey(userId);
    }
} 