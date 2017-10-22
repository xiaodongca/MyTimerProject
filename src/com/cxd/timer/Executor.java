package com.cxd.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

/**
 * Created with IntelliJ IDEA.
 * User: cxd
 * Date: 2017/10/22
 * Description:
 */
public class Executor {

    public static void main(String[] args) {
        Timer timer = new Timer();
        //获取当前的时间
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current time is:"+sf.format(calendar.getTime()));

        DancingRobot dr = new DancingRobot();
        WaterRobot wr = new WaterRobot(timer);
        timer.schedule(dr,calendar.getTime(),2000);
        timer.scheduleAtFixedRate(wr,calendar.getTime(),1000);
    }
}
