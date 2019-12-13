package airport.models.planes;

public class CargoPlane extends Airplane implements PropellerMotor {
    private int maxCargo = 20;
    private int currentCargo;

    public CargoPlane(String planeId) {
        super(planeId);
    }

    @Override
    public void takeOff() {
        if (isFlying) {
            System.out.println("Cargoplane " + planeId + " can not take off, because it is already flying!");
        } else {
            System.out.println("Cargoplane " + planeId + " takes off!");
        }
        isFlying = true;

    }

    @Override
    public void land() {
        if (isFlying) {
            System.out.println("Cargoplane " + planeId + " lands!");
        } else {
            System.out.println("Cargoplane  " + planeId + " can not land, because we are still on the ground!");
        }
        isFlying = false;
    }

    public int getMaxCargo() {
        return maxCargo;
    }

    public void setMaxCargo(int maxCargo) {
        this.maxCargo = maxCargo;
    }

    public int getCurrentCargo() {
        return currentCargo;
    }

    public void setCurrentCargo(int currentCargo) {
        this.currentCargo = currentCargo;
    }

    //load cargo with
    public void loadCargo(int toLoadCargo) {
        currentCargo = currentCargo + toLoadCargo;
        if (currentCargo > maxCargo) {
            //print a message explained how many could fit and how many could not.
            System.out.println("Cargo plane " + getPlaneId() + "loads " + toLoadCargo + " cargo");
            System.out.println("Cargo plane " + getPlaneId() + ": " + maxCargo + " could fit, " + (currentCargo - maxCargo) + " could not fit");
        } else {
            System.out.println("Cargo plane " + getPlaneId() + " loads " + toLoadCargo + " cargo");

        }
    }
    // unload cargo
    public void unloadcargo() {
        System.out.println("Cargo plane " + getPlaneId() + " unloads " + currentCargo + " cargo");
        currentCargo = 0;
    }

    @Override
    public boolean isAvailable() {
        //boolean isAvailable = super.isAvailable();
        if (!isFlying() && this.currentCargo < this.maxCargo) {
            System.out.println("Cargoplane " + planeId + " is available");
            return true;
        } else {
            System.out.println("Cargoplane " + planeId + " is not available");
            return false;
        }

    }

    @Override
    public String toString() {
        return "CargoPlane{" +
                "maxCargo=" + maxCargo +
                ", currentCargo=" + currentCargo +
                ", planeId='" + getPlaneId() + '\'' +
                ", isFlying=" + isFlying() +
                ", cruiseSpeed=" + getCruiseSpeed() +
                '}';
    }

    @Override
    public void turningPropeller() {
        System.out.println("Cargoplane: " + planeId  + " Turning propeller.");
    }
}
