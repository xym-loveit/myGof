package com.xym.dp.designPattern.build6.prototype;

import java.io.*;

/**
 * 通过深克隆和浅克隆对比，深克隆克隆出一个全新的对象，浅克隆不完全，只会克隆基本类型
 * 深克隆使用Serializable对象序列化
 * 浅克隆使用object提供的clean方法，实现Cloneable
 * <p>
 * 对象的克隆体现了原型模式
 *
 * @author xym
 */
public class WeeklyLogDeep implements Serializable {
    private String name;
    private String date;
    private String content;
    private Attachment attachment;

    /**
     * 使用序列化实现深克隆，将源对象所有属性（引用型、和非引用型）完全克隆，二个对象独立存在，互不干扰
     *
     * @return
     */
    protected WeeklyLogDeep deepClone() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            //使用ObjectOutputStream将当前对象写入ByteArrayOutputStream流中,实际存放在内存中
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //使用ByteArrayInputStream从内存的输出流中读取对象字节流
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            WeeklyLogDeep weeklyLogDeep = (WeeklyLogDeep) ois.readObject();
            return weeklyLogDeep;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        WeeklyLogDeep deepClone = new WeeklyLogDeep();
        deepClone.setAttachment(new Attachment());

        WeeklyLogDeep clone = deepClone.deepClone();
        //返回结果为true,表示克隆对象和源对象是同一个对象，公用同一个引用地址
        System.out.println(clone.getAttachment() == deepClone.getAttachment());
        //如果此时将克隆对象的引用类型的成员变量属性修改掉，则源对象也会被修改，这样会出现问题
        Attachment attachment = clone.getAttachment();
        attachment.setName("水浒传");

        System.out.println(deepClone.getAttachment().getName());

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