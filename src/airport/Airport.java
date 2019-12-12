package airport;

public class Airport {
    private String city;

    //private Airplane[] airplanes;
    private CargoPlane[] cargoplanes;
    private PeoplePlane[] peopleplanes;

    public Airport() {

    }

    public Airport(String city, PeoplePlane[] peopleplanes, CargoPlane[] cargoplanes) {
        this.city = city;
        this.peopleplanes = peopleplanes;
        this.cargoplanes = cargoplanes;
        System.out.println("Aircraft from airport " + city + ":");
    }


    // Printing out all aircraft that are from the Airport
//    public void printAirplanes() {
//        for (Airplane airplane : airplanes) {
//            if (airplane instanceof PeoplePlane) {
//                System.out.println("Passagiersvliegtuig " + airplane.planeId);
//            } else if (airplane instanceof CargoPlane) {
//                System.out.println("Cargovliegtuig " + airplane.planeId);
//            }
//        }
//    }

    //Requesting a plane that does not fly and has room for passengers (available)
    //"Plane ABC123 requested. Is not flying, still room for 30 passengers"
//    public Airplane requestPlaneAvailable() {
//        for (int i = 0; i < airplanes.length; i++)
//            if (this.airplanes[i].isAvailable()) {
//                System.out.println("Airplane " + this.airplanes[i].planeId + " is requested");
//                System.out.print("Airplane " + this.airplanes[i].planeId + " is available, ");
//                if (this.airplanes[i] instanceof PeoplePlane) {
//                    PeoplePlane peopleplane = (PeoplePlane) this.airplanes[i];
//                    System.out.println("airplane is not flying, still room " + ((peopleplane.maxPassengers) - (peopleplane.currentPassengers)) + " for passengers ");
//                } else if (this.airplanes[i] instanceof CargoPlane) {
//                    CargoPlane cargoplane = (CargoPlane) this.airplanes[i];
//                    System.out.println("airplane is not flying, still room " + ((cargoplane.maxCargo) - (cargoplane.currentCargo)) + " ton for cargo ");
//                }
//                return this.airplanes[i];
//            } else {
//                System.out.println("Airplane " + this.airplanes[i].planeId + " not available.");
//            }
//        return null;
//    }
    public PeoplePlane[] listOfPeopleplanes() {
        for (int i = 0; i < peopleplanes.length; i++) {
            System.out.println("Passagiersvliegtuig " + this.peopleplanes[i].planeId );
        }
        return peopleplanes;
    }
    public PeoplePlane requestPeoplePlaneAvailable(){
        for (int i = 0; i < peopleplanes.length; i++) {
             if (this.peopleplanes[i].isAvailable()){
                 return this.peopleplanes[i];
             }
        }
        return null;
    }
}
