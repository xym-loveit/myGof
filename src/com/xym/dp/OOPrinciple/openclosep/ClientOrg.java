package com.xym.dp.OOPrinciple.openclosep;

/**
 * 如果增加线形图，则会打破开闭原则，不可取
 *
 * @author xym
 */
public class ClientOrg {
    public static void main(String[] args) {
        //ChartDisplayOrg作为客户端被调用放，应当遵守开闭原则
        ChartDisplayOrg chartDisplayOrg = new ChartDisplayOrg();
        chartDisplayOrg.display("pie");
    }
}