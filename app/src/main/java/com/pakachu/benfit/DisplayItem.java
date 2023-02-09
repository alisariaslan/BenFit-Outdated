package com.pakachu.benfit;

public class DisplayItem {
    int id;
    int state;
    String name_surname;
    boolean ismale;
    int age;
    float weight;
    int height;
    float arm;
    float shoulder;
    float chest;
    float waist;
    float hips;
    float legs;
    float calf;
    String date;

    public DisplayItem(int state) {
        this.state = state;
    }

    public DisplayItem(int id , int state, String name_surname, boolean ismale, int age, float weight, int height, float arm, float shoulder, float chest, float waist, float hips, float legs, float calf, String date) {
        this.id = id;
        this.state = state;
        this.name_surname = name_surname;
        this.ismale = ismale;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.arm = arm;
        this.shoulder = shoulder;
        this.chest = chest;
        this.waist = waist;
        this.hips = hips;
        this.legs = legs;
        this.calf = calf;
        this.date = date;
    }
}
