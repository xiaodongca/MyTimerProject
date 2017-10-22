package com.cxd.timer;

import java.text.SimpleDateFormat;
import java.util.TimerTask;

/**
 * Created with IntelliJ IDEA.
 * User: cxd
 * Date: 2017/10/22
 * Description:
 */
public class DancingRobot extends TimerTask{

    @Override
    public void run() {
        //获取最近的一次任务执行时间，并将其格式化
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("Scheduled exec time is:"+sf.format(scheduledExecutionTime()));
        System.out.println("Dancing happily");
    }
}
