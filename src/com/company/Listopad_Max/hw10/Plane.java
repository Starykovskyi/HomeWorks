package com.company.Listopad_Max.hw10;



    public class Plane extends Vehicle {
        private double costPriseFor100km = 450;
        private double prise;
        private double maxSpied = 350;
        private double time;

        public Plane(double distance) {
            super(distance);
        }

        @Override
        void toCountPrise() {
            //Самолет может пролететь только 1500 км из-за ограничени в топлеве
            if (distance < 1500) {
                prise = (distance / 100 * costPriseFor100km) * 2; // себестоимость проезда умноженная на наценку;
                System.out.println("plain ticket price : " + prise);
            } else {
                System.out.println("too far");
            }
        }

        @Override
        void toCountTime () {
            time = distance / maxSpied;
            System.out.println("plain ride duration : " + time);
        }

        public double getHowMachElPetrolFor100km() {
            return costPriseFor100km;
        }

        public double getPrise() {
            return prise;
        }

        public double getMaxSpied() {
            return maxSpied;
        }

        public double getTime() {
            return time;
        }
}
