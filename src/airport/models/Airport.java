package airport.models;

import airport.models.planes.PeoplePlane;
import airport.models.planes.Airplane;
import airport.models.planes.CargoPlane;

public class Airport {
    private String city;

    private CargoPlane[] cargoplanes;
    private PeoplePlane[] peopleplanes;
    private Airplane[] airplanes;

    public Airport() {

    }

    public Airport(String city, PeoplePlane[] peopleplanes, CargoPlane[] cargoplanes) {
        this.city = city;
        this.peopleplanes = peopleplanes;
        this.cargoplanes = cargoplanes;
        System.out.println("Aircraft from airport " + city + ":");
    }

    public Airport(String city, Airplane[] airplanes) {
        this.city = city;
        this.airplanes = airplanes;
    }

    public PeoplePlane[] listOfPeopleplanes() {
        for (int i = 0; i < peopleplanes.length; i++) {
            System.out.println("Passagiersvliegtuig " + this.peopleplanes[i].getPlaneId() );
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
