package com.example.springquartzdemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.support.CronSequenceGenerator;
import org.springframework.stereotype.Component;

@Component
public class AverageMonitor {
    private static final Logger LOG = LoggerFactory.getLogger(AverageMonitor.class);
//    private final EventRepository eventRepository;
//    private final AverageRepository averageRepository;
    public AverageMonitor(
        /*final EventRepository eventRepository, final AverageRepository averageRepository*/) {
        /*this.eventRepository = eventRepository;
        this.averageRepository = averageRepository;*/
    }
    
    //@Scheduled(cron = "[Seconds] [Minutes] [Hours] [Day of month] [Month] [Day of week] [Year]")
    @Scheduled(cron = "0/5 * * * * ?")
    public void publish() {
        /*final double average =
            eventRepository.getAverageValueGreaterThanStartTime(
                "An event type", LocalDateTime.now().minusSeconds(20));
        averageRepository.save(
            new Average(new AverageKey("An event type", LocalDateTime.now()), average));*/
//        LOG.info("Average value is {}", average);
    	System.out.println("Current time is : "+ new Date());
    	CronSequenceGenerator generator = new CronSequenceGenerator("0 0 0 1 * ?");
    	Date nextRunDate= generator.next(new Date());
    	System.out.println("Next Execution date is "+nextRunDate);
    	
    }
    
  //@Scheduled(cron = "[Seconds] [Minutes] [Hours] [Day of month] [Month] [Day of week] [Year]")
    @Scheduled(cron = "0/5 * * * * ?")
    public void gymPublish() {
        /*final double average =
            eventRepository.getAverageValueGreaterThanStartTime(
                "An event type", LocalDateTime.now().minusSeconds(20));
        averageRepository.save(
            new Average(new AverageKey("An event type", LocalDateTime.now()), average));*/
//        LOG.info("Average value is {}", average);
    	System.out.println("Today is Tuesday Current time is : "+ new Date());
    }
}