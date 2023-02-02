package company4;

class Vehicle {
    int passengers;
    int fuelcap;
    int lkm;

    void range() {
        System.out.println("Дальність -" + (fuelcap / lkm) * 100);
    }
}

class VehicleDemo {
    public static void main(String args[]) {
        Vehicle opel = new Vehicle();
        Vehicle audi = new Vehicle();
        double rangeOpel, rangeAudi;

        opel.passengers = 5;
        opel.fuelcap = 61;
        opel.lkm = 6;

        audi.passengers = 5;
        audi.fuelcap = 55;
        audi.lkm = 8;

        opel.range();
        audi.range();

    }
}
