package BeeSim;

public class CircleMovementBehavior implements BeeBehavior{


    private int circleStep;
    private final Bee targetBee;

    public CircleMovementBehavior(Bee targetBee) {
        this.targetBee = targetBee;
    }
    public void onTick() {
    }
    public void manageCircle() {
    }
    public void makeCircle() {
        int newRad = ((int) (Math.random() * 150)) + 50;
        circleStep = newRad;

    }

}