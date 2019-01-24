package com.lz.patterntest.CreationMode.ArchetypalModel;

/**
 * Created by Administrator on 2019/1/24.
 */

public class Mail implements Cloneable{

    // 收件人
    private String receiver;
    //标题
    private String subject;
    // 内容
    private String context;


    public Mail(Template template) {
        this.subject = template.getSubject();
        this.context = template.getContext();
    }


    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Mail)super.clone();
    }
}
