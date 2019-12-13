package airport.models.planes;

public abstract class Airplane {
    protected String planeId;
    protected boolean isFlying;
    protected int cruiseSpeed;

    public Airplane(String planeId) {
        this.planeId = planeId;
        System.out.println("Airplane " + planeId);
    }

    public String getPlaneId() {
        return planeId;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    public int getCruiseSpeed() {
        return cruiseSpeed;
    }

    public void setCruiseSpeed(int cruiseSpeed) {
        this.cruiseSpeed = cruiseSpeed;
    }
//    //load passengers with number of passengers
//    public void loadPassengers(int toLoad) {
//        currentPassengers = currentPassengers + toLoad;
//        if (currentPassengers > maxPassengers) {
//            //print a message explained how many could fit and how many could not.
//            System.out.println("Airplane " + planeId + "loads " + toLoad + " passengers");
//            System.out.println("Airplane " + planeId + ": " + maxPassengers + " could fit, " + (currentPassengers - maxPassengers) + " could not fit");
//        } else {
//            System.out.println("Airplane " + planeId + " loads " + toLoad + " passengers");
//
//        }
//    }

//    // unload passengers
//    public void unloadPassengers() {
//        System.out.println("Airplane " + planeId + " unloads " + currentPassengers + " passengers");
//        currentPassengers = 0;
//    }

    // take off
    public abstract void takeOff();

    // land
    public abstract void land();

    // is vliegtuig available? true or false
    // available betekent: niet aan het vliegen en er is nog plek
    public abstract boolean isAvailable();
//    dit stukje naar CargoPlane en PeoplePlane
//    {
//          if (!this.isFlying) {
//            return true;
//        } else {
//            return false;
//        }
//    }
    public String toString(){
        return "planeId: '" + this.planeId + "', flying: '" + this.isFlying;
    }

}
