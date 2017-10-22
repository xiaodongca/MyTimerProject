package com.cxd.timer;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created with IntelliJ IDEA.
 * User: cxd
 * Date: 2017/10/22
 * Description:
 */
public class WaterRobot extends TimerTask{

    private Timer timer;

    //最大容量为5L
    private Integer bucketCapacity = 0;

    public WaterRobot(Timer inputTimer){
        timer = inputTimer;
    }
    @Override
    public void run() {
        //灌水直至桶满为止
        if (bucketCapacity < 5){
            System.out.println("Add 1L water into the bucket!");
            bucketCapacity++;
        }else {
            //水满之后就停止执行
            System.out.println("The number of canceled task in timer is:"+timer.purge());
            cancel();
            System.out.println("The waterRobot has been aborted");
            System.out.println("The number of canceled task in timer is:"+timer.purge());
            System.out.println("Current water is"+bucketCapacity+"L");
            //等待两秒钟，终止timer里面的所有内容
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            timer.cancel();
        }

    }
}
