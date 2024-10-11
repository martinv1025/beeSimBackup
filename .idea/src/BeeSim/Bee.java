package BeeSim;

public class Bee {
    private BeeBehavior beeBehavior;
    private int xPosition;
    private int yPosition;
    private int health;

    public Bee(int health, BeeBehavior beeBehavior) {
        xPosition = (int) (Math.random() * 600);
        yPosition = (int) (Math.random() * 600);
        this.health = health;
        this.beeBehavior = beeBehavior;

    }

    public void onTick() {
        beeBehavior.onTick();
        health--;
    }

    public int getXPosition() {
        return xPosition;
    }
    public int getYPosition() {
        return yPosition;
    }
    public int getHealth() {
        return health;
    }
}

