package com.company.Lisopad_Max.hw9;

public class Vehicle {
    private String name;
    private int speed;
    private double time;

    protected double toCountDistance(){
        double distance = this.speed * this.time;
        return distance;
    }

    public Vehicle( int speed, double time, String name) {

        this.speed = speed;
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }


    public double getTime() {
        return time;
    }
}
