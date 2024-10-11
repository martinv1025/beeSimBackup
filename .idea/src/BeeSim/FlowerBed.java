package BeeSim;

import java.util.ArrayList;

public class FlowerBed {

    public ArrayList<Flower> flowers;

    public ArrayList<Bee> bees;

    public FlowerBed() {}

    public void advanceTick() {
        //call behaviors
        checkCollisions();
    }
    public void checkCollisions() {
        for (Bee bee: bees) {
            for (Flower flower: flowers) {
                int x1 = bee.getXPosition();
                int y1 = bee.getYPosition();
                int x2 = flower.getXPosition();
                int y2 = flower.getYPosition();
                if (Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2)) < 10) {
                    flower.tagged(bee);
                }
            }
        }

    }
    public ArrayList<Flower> getFlowers() {
        return flowers;
    }
    public ArrayList<Bee> getBees() {
        return bees;
    }
}