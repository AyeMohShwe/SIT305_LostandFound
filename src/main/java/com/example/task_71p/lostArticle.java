package com.example.task_71p;

public class lostArticle {

    public Integer ID;
    public String Condition, Name, Phone, Desc, Date, Loc;

    public lostArticle(Integer ID, String condition, String name, String phone, String desc, String date, String loc, Double latitude, Double longitude) {
        this.ID = ID;
        this.Condition = condition;
        Name = name;
        Phone = phone;
        Desc = desc;
        Date = date;
        Loc = loc;
    }

    public lostArticle(){
    }
}
