package com.xym.dp.designPattern.build6.prototype;

/**
 *
 * @author xym
 */
public class WeeklyLogShallow implements Cloneable {
    private String name;
    private String date;
    private String content;
    private Attachment attachment;


    /**
     * jdk自带为浅克隆，浅克隆只会克隆基本类型，引用类型的成员变量不会克隆，克隆后的对象和源对象公用一个引用地址
     *
     * @return
     */
    @Override
    protected WeeklyLogShallow clone() {
        try {
            return (WeeklyLogShallow) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        WeeklyLogShallow shallowClone = new WeeklyLogShallow();
        shallowClone.setAttachment(new Attachment());

        WeeklyLogShallow clone = shallowClone.clone();
        //返回结果为true,表示克隆对象和源对象是同一个对象，公用同一个引用地址
        System.out.println(clone.getAttachment() == shallowClone.getAttachment());
        //如果此时将克隆对象的引用类型的成员变量属性修改掉，则源对象也会被修改，这样会出现问题
        Attachment attachment = clone.getAttachment();
        attachment.setName("水浒传");

        System.out.println(shallowClone.getAttachment().getName());

    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

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

}