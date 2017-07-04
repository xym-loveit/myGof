package com.xym.dp.OOPrinciple.carp;

/**
 * 重构之后，通过组合的方式使用dbUtil，即便是数据库由mysql换为oracl，也无需修改现有代码，只需要定义新的DBUtil类，注入即可
 *
 * 体现了合成复用原则
 *
 * @author xym
 */
public class CustomerDao {

    private DBUtil dbUtil;

    public void addCustomers() {


    }


}