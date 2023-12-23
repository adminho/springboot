package com.example.scheduling.comp;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

// Cite: https://www.tutorialspoint.com/spring_boot/spring_boot_scheduling.htm

@Component
public class CronExpression {
	//@Scheduled(cron = "0 * 9 * * ?") // run every minute starting at 9:00 AM and ending at 9:59 AM, every day
	@Scheduled(cron="*/10 * * * * * ") // run every 10 seconds
    // @Scheduled(cron="*/10 * * * * ") // run every 10 min.
	public void cronJobSch() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = sdf.format(now);
		System.out.println("Java cron job expression:: " + strDate);
	}
}
