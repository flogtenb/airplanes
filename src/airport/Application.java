package airport;

public class Application {

    public static void main(String[] args) {
        // opdracht dag 1
//        System.out.println("Welcome to the airport");
//        System.out.println("     ");
//        // Create two airplanes in the main method within Application.
//        Airplane one = new Airplane("ABC123 ");
//        Airplane two = new Airplane("DDD888");
//        // akties met deze beide vliegtuigen
//        one.loadPassengers(143);
//        one.land();
//        one.takeOff();
//        two.loadPassengers(23);
//        two.takeOff();
//        one.land();
//        one.unloadPassengers();
//        two.takeOff();
//        two.land();
//        two.unloadPassengers();

        //Airplane ABC123 loads 43 passengers.
        //Airplane ABC123 takes off.
        //Airplane DDD888 loads 23 passengers.
        //Plane ABC123 lands.
        //Airplane ABC123 unloads 43 passengers.
        //Airplane DDD888 takes off.
        //Plane DDD888 lands.
        //Airplane DDD888 unloads 23 passengers.

        // opdracht dag 2 opdracht dag 2

//        System.out.println("                      ");
//        System.out.println("                      ");
//        System.out.println("opdracht dag 2:");
//      //aanmaken vliegtuigen
//        new Airport("Eindhoven");
//        Airplane ABC123 = new Airplane("ABC123 ");
//        Airplane DDD888 = new Airplane("DDD888 ");
//        Airplane ODL345 = new Airplane("ODL345 ");
//
//        Airplane[] airplanes = new Airplane[]{ABC123, DDD888, ODL345};
//        Airport airport = new Airport(airplanes);
//        ABC123.isFlying = false;
//        ABC123.currentPassengers = 28;
//        ABC123.maxPassengers = 50;
//        airport.requestPlaneAvailable();
//        ABC123.loadPassengers(63);
//        Airplane three = new Airplane("ABC123");
//        Airplane four = new Airplane("DDD888");
//        Airplane five = new Airplane("ODL345");
//        three.isFlying = false;
//        three.currentPassengers = 10;
//        three.maxPassengers = 50;
//        eindhoven.requestPlaneAvailable();
//   opdracht dag 3

        PeoplePlane ABC123 = new PeoplePlane("ABC123 ");
        PeoplePlane DDD888 = new PeoplePlane("DDD888 ");
        PeoplePlane ODL345 = new PeoplePlane("ODL345 ");
        CargoPlane FF2134 = new CargoPlane("FF2134");
        CargoPlane PLA166 = new CargoPlane("PLA166");
        PeoplePlane[] peopleplanes = new PeoplePlane[]{ABC123,DDD888,ODL345};
        CargoPlane[] cargoplanes = new CargoPlane[]{FF2134,PLA166};
        Airport eindhoven = new Airport("Eindhoven",peopleplanes,cargoplanes);



        ABC123.isFlying = false;
        ABC123.setCurrentPassengers(20);
        ABC123.setMaxPassengers(50);
        ABC123.loadPassengers(63);

        FF2134.isFlying = false;
        FF2134.setCurrentCargo(5);
        FF2134.setMaxCargo(20);
        FF2134.loadCargo(20);

        System.out.println("      ");
        System.out.println("Dag3, Opdracht 3");
        System.out.println(FF2134.toString());
        System.out.println(ABC123.toString());
    }
}
