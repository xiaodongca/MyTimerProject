package com.cxd.timer;

import jdk.nashorn.internal.ir.visitor.SimpleNodeVisitor;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created with IntelliJ IDEA.
 * User: cxd
 * Date: 2017/10/22
 * Description:
 */
public class DifferenceTest {

    public static void main(String[] args) {
        //规定时间格式
        final SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取当前的具体时间
        Calendar calendar = Calendar.getInstance();
        System.out.println("Current time is:"+sf.format(calendar.getTime()));

        //设置成6秒前的时间，若当前时间为2016-12-28 00:00:06
        //设置之后时间变成2016-12-28 00:00:00
       // calendar.add(Calendar.SECOND,-6);
        Timer timer = new Timer();
        //第一次执行时间为6秒前，之后每隔两秒钟执行一次

       // timer.schedule(new TimerTask() {
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //打印当前的计算执行时间
                System.out.println("Scheduled exec time is"+ sf.format(scheduledExecutionTime()));
                System.out.println("Task is being executed!");
            }
        }, calendar.getTime(), 2000);
    }
}
