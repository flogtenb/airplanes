package airport;

import airport.models.planes.Airplane;
import airport.models.planes.CargoPlane;
import airport.models.planes.PeoplePlane;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
//   opdracht dag 4
        // opvoeren nieuwe planes en later opslaan in ArrayList
        Airplane ABC123 = new PeoplePlane("ABC123 ");
        ABC123.setFlying(true);
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
        // airplanes in ArrayList zetten
        List<Airplane> listAirplanes = new ArrayList<>();
        listAirplanes.add(ABC123);
        listAirplanes.add(DDD888);
        listAirplanes.add(ODL345);
        listAirplanes.add(FF2134);
        listAirplanes.add(FF2134);

        //planeId alleen te lezen met getter in die class, geen setter hiervoor

        //door listAirplanes heenlopen en bepalen tot welke class ze behoren
        for (Airplane a:listAirplanes){
           if (a instanceof CargoPlane ) {
               System.out.println("Cargoplane: " + a);
           } else if (a instanceof PeoplePlane) {
               System.out.println("PeoplePlane: " + a);
           }
        }

    }
}
