package com.company.Listopad_Max.hw10;


import org.w3c.dom.ls.LSOutput;

public class Train extends Vehicle {
        private double costPriseFor100km = 35;
        private double prise;
        private double maxSpied = 100;
        private double time;



        public Train(double distance) {
            super(distance);
        }

        @Override
        void toCountPrise() {
            prise = (distance / 100 * costPriseFor100km) * 2;// себестоимость проезда умноженная на наценку
            System.out.println("train ticket price : " + prise);
        }

        @Override
        void toCountTime() {
            time = distance / maxSpied;
            System.out.println("train ride duration : " + time);
        }

        public double getPrise() {
            return prise;
        }

    public double getHowMachElectricityFor100km() {
        return costPriseFor100km;
    }

    public double getMaxSpied() {
        return maxSpied;
    }

    public double getTime() {
        return time;
    }
}

