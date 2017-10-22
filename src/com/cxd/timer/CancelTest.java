package com.cxd.timer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

/**
 * Created with IntelliJ IDEA.
 * User: cxd
 * Date: 2017/10/22
 * Description:
 */
public class CancelTest {
    public static void main(String[] args) throws InterruptedException {
        //创建Timer实例
        Timer timer = new Timer();
        //创建TimerTask实例
        MyTimerTask task1 = new MyTimerTask("task1");
        MyTimerTask task2 = new MyTimerTask("task2");
        // 获取当前的执行时间并打印
        Date startTime = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("start time is :"+sf.format(startTime));
        //task1首次执行是距离现在时间3秒后执行，之后每隔2秒执行一次
        //task2首次执行是距离现在时间1秒后执行，之后每隔2秒执行一次
        timer.schedule(task1,3000,2000);
        timer.schedule(task2,1000,2000);
        System.out.println("current canceled task number is:"+timer.purge());
        //休眠5秒
        Thread.sleep(2000);

        //获取当前的执行时间并打印
        Date cancelTime = new Date();
        System.out.println("cancel time is："+sf.format(cancelTime));

        //取消所有任务
        task2.cancel();
       // System.out.println("Tasks all cnaceled!");
        System.out.println("current canceled task number is:"+timer.purge());
    }
}
