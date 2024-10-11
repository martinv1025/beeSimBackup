package BeeSim;

import javafx.geometry.Point2D;
import javafx.scene.image.Image;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


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
    public void setHealth (int health) {
        this.health = health;
    }
    public void moveTo(int xCoord, int yCoord) {
        //TODO
    }
}

