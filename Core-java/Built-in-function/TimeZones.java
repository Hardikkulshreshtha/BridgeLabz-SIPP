import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZones {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        
        System.out.println("Current Time in Different Time Zones:");
        System.out.println("=====================================");
        System.out.println("GMT (Greenwich Mean Time): " + gmtTime.format(formatter));
        System.out.println("IST (Indian Standard Time): " + istTime.format(formatter));
        System.out.println("PST (Pacific Standard Time): " + pstTime.format(formatter));
        
        System.out.println("\nTime Zone Offsets:");
        System.out.println("==================");
        System.out.println("GMT Offset: " + gmtTime.getOffset());
        System.out.println("IST Offset: " + istTime.getOffset());
        System.out.println("PST Offset: " + pstTime.getOffset());
    }
} 