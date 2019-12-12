package airport.models.planes;

public class Airplane {
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

//    public void setPlaneId(String planeId) {
//        this.planeId = planeId;
//    }

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
    public void takeOff() {
        if (isFlying) {
            System.out.println("Airplane " + planeId + " can not take off, because it is already flying!");
        } else {
            System.out.println("Airplane " + planeId + " takes off!");
        }
        isFlying = true;
    }

    // land
    public void land() {
        if (isFlying) {
            System.out.println("Airplane " + planeId + " lands!");
        } else {
            System.out.println("Airplane  " + planeId + " can not land, because we are still on the ground!");
        }
        isFlying = false;
    }

    // is vliegtuig available? true or false
    // available betekent: niet aan het vliegen en er is nog plek
    public boolean isAvailable() {
          if (!this.isFlying) {
            return true;
        } else {
            return false;
        }
    }
    public String toString(){
        return "planeId: '" + this.planeId + "', flying: '" + this.isFlying;
    }

}
//    For Day 2
//        If-Else, Switch, Arrays and Looping
//
//        Assignment 1: Expands the airplane class with if-else statements in the methods.
//        For loading passengers there must be no more than the maximum that can sit in the plane,
//        if the amount of passengers fits: print a normal loading message, if the amount does not fit,
//        print a message explained how many could fit and how many could not.
//        Before taking off,  first check whether the aircraft is not flying at the moment,
//        for landing the other way around. Also print relevant messages here.
