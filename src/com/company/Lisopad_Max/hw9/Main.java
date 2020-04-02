package com.company.Lisopad_Max.hw9;

public class Main {
    public static void main(String[] args) {

        Train train = new Train(100, 30, "asds-02", 100, 20);
        train.emptySeats();
        Plane plane = new Plane(200,30,"boing - 777", 50);
        plane.countPetrol();

    }
}
