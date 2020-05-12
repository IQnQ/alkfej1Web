package hu.alkfejl.model.bean;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Question {

    private int id;
    private String type, name , sAnswer;
    private int intAnswer;
    private List<String> multi = new ArrayList<>();
    private boolean b1, b2, b3, b4, b5;

    public Question() {}


    public Question(int anInt, int anInt1, String string, String string1, String string2, int anInt2, Date date, String string3, String string4, String string5, String string6, String string7, boolean aBoolean, boolean aBoolean1, boolean aBoolean2, boolean aBoolean3, boolean aBoolean4) {
        System.out.println(anInt + anInt1 + string + string1 + string2 + string3);
        this.setId(anInt);
        this.type = string;
        if (string != null) {
            this.name = string1;
        } else {
            this.name = "missing question";
        }

        this.sAnswer = string2;
//        this.intAnswer = anInt2;
//        this.multi.add(string3);
//        this.multi.add(string4);
//        this.multi.add(string5);
//        this.multi.add(string6);
//        this.multi.add(string7);
//        this.b1 = aBoolean;
//        this.b2 = aBoolean1;
//        this.b3 = aBoolean2;
//        this.b4 = aBoolean3;
//        this.b5 = aBoolean4;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsAnswer() {
        return sAnswer;
    }

    public void setsAnswer(String sAnswer) {
        this.sAnswer = sAnswer;
    }

    public int getIntAnswer() {
        return intAnswer;
    }

    public void setIntAnswer(int intAnswer) {
        this.intAnswer = intAnswer;
    }

    public List<String> getMulti() {
        return multi;
    }

    public void setMulti(List<String> multi) {
        this.multi = multi;
    }

    public boolean isB1() {
        return b1;
    }

    public void setB1(boolean b1) {
        this.b1 = b1;
    }

    public boolean isB2() {
        return b2;
    }

    public void setB2(boolean b2) {
        this.b2 = b2;
    }

    public boolean isB3() {
        return b3;
    }

    public void setB3(boolean b3) {
        this.b3 = b3;
    }

    public boolean isB4() {
        return b4;
    }

    public void setB4(boolean b4) {
        this.b4 = b4;
    }

    public boolean isB5() {
        return b5;
    }

    public void setB5(boolean b5) {
        this.b5 = b5;
    }
}
