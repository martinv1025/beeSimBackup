package BeeSim;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class Flower {
    public FlowerBehavior flowerBehavior;

    public void tagged(Bee bee) {
        flowerBehavior.whenTagged(bee);
    }
    public void onTick() {
        flowerBehavior.onTick();
    }
    private final int xPosition;
    private final int yPosition;
    public ImageView node;

    public Flower(FlowerBehavior flowerBehavior, int energy) {
        this.flowerBehavior = flowerBehavior;
        xPosition = (int) (Math.random() * 600);
        yPosition = (int) (Math.random() * 600);
        node = new ImageView();
        Image image;
        if (flowerBehavior instanceof GiveAndRechargeBehavior) {
            image = new Image("file:rose.jpg");
        } else {
            image = new Image("file:daisy.jpg");
        }
        node.setImage(image);
        node.setPreserveRatio(true);
        node.setFitWidth(50);
        node.setX(xPosition);
        node.setY(yPosition);
        node.setVisible(true);
    }

    public ImageView getNode() {
        return node;
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

}
