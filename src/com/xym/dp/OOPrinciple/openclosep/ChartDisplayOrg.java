package com.xym.dp.OOPrinciple.openclosep;

/**
 * 最初的图形显示类
 *
 * @author xym
 */
public class ChartDisplayOrg {

    public void display(String type) {
        if (type.equals("pie")) {
            PieChart pieChart = new PieChart();
            pieChart.display();
        } else if (type.equals("bar")) {
            BarChart barChart = new BarChart();
            barChart.display();
        }

        //如果再添加一个线形图，如果修改多处，连被调用放源代码也需要修改，破坏了开闭原则
    }
}