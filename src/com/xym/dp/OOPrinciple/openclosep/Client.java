package com.xym.dp.OOPrinciple.openclosep;

/**
 * 体现开闭原则，如果添加线形图，只需要创建新类，并传入图形展现类调用即可
 * 客户端调用类
 *
 * @author xym
 */
public class Client {
    public static void main(String[] args) {

        ChartDisplay display = new ChartDisplay();
        display.setChart(new PieChart());
        display.display();

        //显示线形图只需要传入线形图实例
        display.setChart(new LineChart());
        display.display();

    }
}