package BeeSim;

public class RobinHoodBehavior implements FlowerBehavior {
    //TODO tweak this value
    private final int THRESHHOLD = 20;
    public RobinHoodBehavior(Flower targetFlower) {

    }
    public void whenTagged(Bee bee) {
        int initHealth = bee.getHealth();
        if (bee.getHealth() > THRESHHOLD) {
            bee.setHealth(initHealth / 2);
        } else {
            bee.setHealth(initHealth * 2);
        }
    }

    public void onTick() {
        //do nothing
    }
}
