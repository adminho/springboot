package com.example.scheduling.comp;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

// Cite: https://www.tutorialspoint.com/spring_boot/spring_boot_scheduling.htm

@Component
public class FixRate {
   @Scheduled(fixedRate = 1000) // run every second from the application startup
   public void fixedRateSch() {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

      Date now = new Date();
      String strDate = sdf.format(now);
      System.out.println("Fixed Rate scheduler:: " + strDate);
   }
}