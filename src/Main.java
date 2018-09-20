public class Main {
    public static void main(String[] args) {
        PassengerCar passengerCar = new PassengerCar("Audi" , 100, 280, 1500,
                4, 8, "sedan", 5);

        Truck truck = new Truck("Mersedes", 1500, 150, 3650, 6, 15,25);

        PlaneCivil planeCivil = new PlaneCivil("Boing 747", 5000, 1500, 5000, 20,
                500, 500, true );

        PlaneVar planeVar = new PlaneVar("СУ-134", 4000, 2000, 3500, 15,
                200, true ,3 );

        passengerCar.vid();
        passengerCar.test();

        truck.vid();
        truck.test();

        planeCivil.vid();
        planeCivil.test();

        planeVar.vid();
        planeVar.test();

    }
}
