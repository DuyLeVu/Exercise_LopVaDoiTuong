package com.company;

import java.time.Instant;
import java.time.LocalTime;
import java.util.Date;
import java.util.Timer;

public class StopWatch {
    private Date startTime;
    private Date endTime;
    private long milisecondEnd;
    private  long milisecondStart;


//    public StopWatch() {
////        this.startTime = System.currentTimeMillis();
//    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void start(){
        Date startDate = new Date();
        this.startTime = startDate;
        this.milisecondStart = System.currentTimeMillis();
    }

    public void stop(){
        Date startDate = new Date();
        this.startTime = startDate;
        this.milisecondEnd = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return milisecondEnd - milisecondStart;
    }
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();

        SelectionSort ob = new SelectionSort();
        int arr[] = new int[100000];
        watch.start();
        for (int i=0; i<arr.length; i++){
            arr[i] = (int) Math.floor(((Math.random() * 99999) + 1));
        }
        ob.sort(arr);
        watch.stop();
        System.out.println(watch.getElapsedTime()+" milisecond");
    }
}
