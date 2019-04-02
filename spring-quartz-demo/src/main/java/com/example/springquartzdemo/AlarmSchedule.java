//package com.example.springquartzdemo;
//import java.util.Date;
// 
//import org.quartz.JobDetail;
//import org.quartz.Scheduler;
//import org.quartz.SchedulerException;
//import org.quartz.SchedulerFactory;
//import org.quartz.Trigger;
//import org.quartz.TriggerUtils;
//import org.quartz.impl.JobDetailImpl;
//import org.quartz.impl.StdSchedulerFactory;
//import static org.quartz.DateBuilder.*;
//import static org.quartz.TriggerBuilder.*;
//import static org.quartz.CronScheduleBuilder.*;
// 
//public class AlarmSchedule {
// 
//    public AlarmSchedule(){
//        try{
//            SchedulerFactory schdFact = new StdSchedulerFactory();
//            Scheduler schd = schdFact.getScheduler();
//            schd.start();
//            JobDetailImpl  jd = new JobDetailImpl ("alarmjob", Scheduler.DEFAULT_GROUP, AlarmJob.class);
//            //Trigger t = TriggerUtils.makeDailyTrigger("alarmtrigger", 06, 00);
//            
//            Trigger t1 = newTrigger()
//            	    .withSchedule(cronScheduleDaily(10,45)) // every day at 10:45
//            	    .startAt(evenHourDate(new Date()) // next hour, straight up
//            	    .build();
//            //t.setStartTime(new Date());
//            schd.scheduleJob(jd, t1);
//        }
//        catch(SchedulerException e){
//            e.printStackTrace();
//        }
//    }
//     
//    public static void main(String[] args) {
//        new AlarmSchedule();
//    }
// 
//}