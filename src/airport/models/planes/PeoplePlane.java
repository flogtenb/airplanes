package airport.models.planes;

import airport.models.planes.Airplane;

public class PeoplePlane extends Airplane {
    private int maxPassengers = 100;
    private int currentPassengers;

    public PeoplePlane(String planeId) {
        super(planeId);
    }

    @Override
    public void takeOff() {
        
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public int getCurrentPassengers() {
        return currentPassengers;
    }

    public void setCurrentPassengers(int currentPassengers) {
        this.currentPassengers = currentPassengers;
    }

    //load passengers with number of passengers
    public void loadPassengers(int toLoad) {
        currentPassengers = currentPassengers + toLoad;
        if (currentPassengers > maxPassengers) {
            //print a message explained how many could fit and how many could not.
            System.out.println("Airplane " + getPlaneId() + "loads " + toLoad + " passengers");
            System.out.println("Airplane " + getPlaneId() + ": " + maxPassengers + " could fit, " + (currentPassengers - maxPassengers) + " could not fit");
        } else {
            System.out.println("Airplane " + getPlaneId() + " loads " + toLoad + " passengers");

        }
    }
    // unload passengers
    public void unloadPassengers() {
        System.out.println("Airplane " + getPlaneId() + " unloads " + currentPassengers + " passengers");
        currentPassengers = 0;
    }

    @Override
    public boolean isAvailable() {
        System.out.println("isAvailable van PeoplePlane");
        boolean isAvailable = super.isAvailable();
        if (isAvailable && this.currentPassengers < this.maxPassengers) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "PeoplePlane{" +
                "maxPassengers=" + maxPassengers +
                ", currentPassengers=" + currentPassengers +
                ", planeId='" + getPlaneId() + '\'' +
                ", isFlying=" + isFlying() +
                ", cruiseSpeed=" + getCruiseSpeed() +
                '}';
    }
}
