package com.cxd.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;

/**
 * Created with IntelliJ IDEA.
 * User: cxd
 * Date: 2017/10/22
 * Description:
 */
public class MyTimerTask extends TimerTask{

    private String name;

    private Integer count = 0;

    public MyTimerTask(String inputName){
        name = inputName;
    }


    @Override
    public void run() {
        if (count<3) {


            //以yyyy-MM-dd HH:mm:ss的格式打印当前执行时间
            //如2016-11-11 00:00:00
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println("Curren exec time is:" + sf.format(calendar.getTime()));

            //打印当前Name的内容
            System.out.println("Current exec name is:" + name);
            count++;
        }else {
            cancel();
            System.out.println("Task cancel!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
