package com.company.Lisopad_Max.hw9;

public class Plane extends Vehicle {
        private double petrolOn100km;

        public void countPetrol (){
            double countPetrol = super.toCountDistance() / 100 * this.petrolOn100km;
            System.out.println("for " + super.toCountDistance() + " km " + " will need " + countPetrol + " liters petrol ");
        }
        public Plane(int speed, double time, String name, double petrolOn100km){
            super(speed, time, name);
            this.petrolOn100km = petrolOn100km;
        }
}
