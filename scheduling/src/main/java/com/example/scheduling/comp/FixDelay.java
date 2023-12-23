package com.example.scheduling.comp;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//Cite: https://www.tutorialspoint.com/spring_boot/spring_boot_scheduling.htm

@Component
public class FixDelay {
   @Scheduled(fixedDelay = 1000, initialDelay = 3000) // run every second after 3 seconds from the application startup
   public void fixedDelaySch() {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
      Date now = new Date();
      String strDate = sdf.format(now);
      System.out.println("Fixed Delay scheduler:: " + strDate);
   }
}
