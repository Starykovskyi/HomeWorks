package com.company.Lisopad_Max.hw9;

public class Train extends Vehicle {

        public int person;
        public int allPerson;

        public void emptySeats(){
            int emptySeats = this.allPerson - this.person;
            System.out.println("empty seats " + emptySeats);
        }

        public Train(int speed, double time, String name, int allPerson, int person) {
            super(speed, time, name);
            this.allPerson = allPerson;
            this.person = person;
        }
}
