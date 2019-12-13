package airport;

import airport.models.planes.Airplane;
import airport.models.planes.CargoPlane;
import airport.models.planes.PeoplePlane;
import airport.models.planes.SpacePlane;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
//   opdracht dag 4
        // opvoeren nieuwe planes en later opslaan in ArrayList
        Airplane ABC123 = new PeoplePlane("ABC123 ");
        ABC123.setFlying(false);
        ABC123.setCruiseSpeed(900);
        //Methodes alleen aan te roepen indien airplane eerst is gecast naar PeoplePlane
        ((PeoplePlane) ABC123).setCurrentPassengers(15);
        ((PeoplePlane) ABC123).setMaxPassengers(55);
        // planeId is protected, dus niet aan te passen vanuit main
        //ABC123.planeId = "bladie bla";
        
        Airplane DDD888 = new PeoplePlane("DDD888 ");
        Airplane ODL345 = new PeoplePlane("ODL345 ");
        Airplane FF2134 = new CargoPlane("FF2134");
        Airplane PLA166 = new CargoPlane("PLA166");
        Airplane XXX666 = new SpacePlane("XXX666");
        // airplanes in ArrayList zetten
        List<Airplane> listAirplanes = new ArrayList<>();
        listAirplanes.add(ABC123);
        listAirplanes.add(DDD888);
        listAirplanes.add(ODL345);
        listAirplanes.add(FF2134);
        listAirplanes.add(FF2134);
        listAirplanes.add(XXX666);

        //planeId alleen te lezen met getter in die class, geen setter hiervoor

        //door listAirplanes heenlopen en bepalen tot welke class ze behoren
        for (Airplane a:listAirplanes){
           if (a instanceof CargoPlane ) {
               System.out.println("Cargoplane: " + a);
           } else if (a instanceof PeoplePlane) {
               System.out.println("PeoplePlane: " + a);
           } else if (a instanceof SpacePlane) {
               System.out.println("SpacePlane: " + a);
           }
        }
        System.out.println("       ");
        ((PeoplePlane) ABC123).startingEngine();
        ((PeoplePlane) ABC123).takeOff();

        System.out.println("  ");
        ((CargoPlane) FF2134).setFlying(false);
        ((CargoPlane) FF2134).isAvailable();
        ((CargoPlane) FF2134).turningPropeller();
        ((CargoPlane) FF2134).takeOff();

        System.out.println("  ");
        ((SpacePlane) XXX666).startingEngine();
        ((SpacePlane) XXX666).takeOff();
        ((SpacePlane) XXX666).startingRocket();



    }
}
