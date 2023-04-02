package com.company4;

class Vehicle {
    int passengers;
    int fuelcap;
    int lkm;

    int range() {
        return fuelcap * lkm;
    }

}

class VehicleDemo {
    public static void main(String args[]) {
        Vehicle opel = new Vehicle();
        Vehicle audi = new Vehicle();
        int rangeOpel, rangeAudi;

        opel.passengers = 5;
        opel.fuelcap = 61;
        opel.lkm = 6;

        audi.passengers = 5;
        audi.fuelcap = 55;
        audi.lkm = 8;

        rangeAudi = audi.range();
        System.out.println(rangeAudi);
        rangeOpel = opel.range();
        System.out.println(rangeOpel);
    }
}
