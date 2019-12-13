package airport.models.planes;

public class SpacePlane extends Airplane implements JetEngine, RocketEngine {
    public SpacePlane(String planeId) {
        super(planeId);
    }

    @Override
    public void startingEngine() {
        System.out.println("Spaceplane " + planeId + " Starting of Engine");
    }

    @Override
    public void takeOff() {
        if (isFlying) {
            System.out.println("Spaceplane " + planeId + " can not take off, because it is already flying!");
        } else {
            System.out.println("Spaceplane " + planeId + " takes off!");
        }
        isFlying = true;
    }

    @Override
    public void land() {
        if (isFlying) {
            System.out.println("Spaceplane " + planeId + " lands!");
        } else {
            System.out.println("Spaceplane  " + planeId + " can not land, because we are still on the ground!");
        }
        isFlying = false;
    }

    @Override
    public boolean isAvailable() {
        return false;
    }

    @Override
    public String toString() {
        return "SpacePlane{" +
                " planeId='" + getPlaneId() + '\'' +
                ", isFlying=" + isFlying() +
                ", cruiseSpeed=" + getCruiseSpeed() +
                '}';
    }

    @Override
    public void startingRocket() {
        System.out.println("Spaceplane " + planeId + " Rockets are taking over");
    }
}
