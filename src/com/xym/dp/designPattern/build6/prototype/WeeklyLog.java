package com.xym.dp.designPattern.build6.prototype;

import java.util.Date;

/**
 * desc
 *
 * @author xym
 */
public class WeeklyLog implements Cloneable {
    private int count;
    private String name;
    private String date;
    private String content;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    private Date createDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    /**
     * jdk自带为浅克隆，浅克隆只会克隆基本类型，引用类型的成员变量不会克隆，克隆后的对象和源对象公用一个引用地址
     *
     * @return
     */
    @Override
    protected WeeklyLog clone() {
        try {
            return (WeeklyLog) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}