package com.company.Listopad_Max.hw10;

    public abstract class  Vehicle {

        protected double distance;


        abstract void toCountPrise();
        abstract void toCountTime ();

        public Vehicle( double distance) {
            this.distance = distance;

        }
}
