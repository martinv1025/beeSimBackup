package BeeSim;

public class RandomMovementBehavior implements BeeBehavior{
    private Flower targetFlower;

    public RandomMovementBehavior() {
    }
    public void onTick(int xPosition, int yPosition) {
        int x1 = xPosition;
        int y1 = yPosition;
        int x2 = targetFlower.getXPosition();
        int y2 = targetFlower.getYPosition();
        double distance = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
        if (distance < 10) {
            chooseTargetFlower();
        }
        x2 = targetFlower.getXPosition();
        y2 = targetFlower.getYPosition();
        double scale = 10 / distance;

        int moveX = (int) (scale * (x2 - x1));
        int moveY = (int) (scale * (y2 - y1));

        targetBee.moveTo(moveX, moveY);

        //check if bee and flower are touching
            //if they are, choose a target flower
        //TODO move the bee 10 pixels closer to the flower
    }

    public void chooseTargetFlower() {
        //TODO make sure that new targ flow is not same one twice!
        //may have to grad the flowerbed and insert it here to retrieve list of flowers
    }
}
