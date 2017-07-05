package com.xym.dp.designPattern.build6.prototype;

import java.util.Date;

/**
 * desc
 *
 * @author xym
 */
public class Client {
    public static void main(String[] args) {

        WeeklyLog log_previous = new WeeklyLog();  //创建原型对象
        log_previous.setName("张无忌");
        log_previous.setDate("第12周");
        log_previous.setContent("这周工作很忙，每天加班！");
        log_previous.setCount(10);
        log_previous.setCreateDate(new Date());

        System.out.println("****周报****");
        System.out.println("周次：" +  log_previous.getDate());
        System.out.println("姓名：" +  log_previous.getName());
        System.out.println("创建时间：" +  log_previous.getCreateDate());
        System.out.println("内容：" +  log_previous.getContent());
        System.out.println("--------------------------------");

        WeeklyLog  log_new;
        log_new  = log_previous.clone(); //调用克隆方法创建克隆对象
        log_new.setDate("第13周");
        System.out.println("****周报****");
        System.out.println("周次：" + log_new.getDate());
        System.out.println("姓名：" + log_new.getName());
        System.out.println("创建时间：" +  log_new.getCreateDate());
        System.out.println("内容：" + log_new.getContent());


        System.out.println(log_previous==log_new);
        System.out.println(log_previous.getContent()==log_new.getContent());
        System.out.println(log_previous.getName()==log_new.getName());
        System.out.println(log_previous.getDate()==log_new.getDate());
        System.out.println(log_previous.getCreateDate()==log_new.getCreateDate());
        System.out.println(log_previous.getCount()==log_new.getCount());

    }
}