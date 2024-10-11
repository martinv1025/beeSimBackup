package BeeSim;

public class GiveAndRechargeBehavior implements FlowerBehavior{

        private Flower targetFlower;
        private int availableHealth;

    public GiveAndRechargeBehavior(Flower targetFlower) {
            this.targetFlower = targetFlower;
            availableHealth = 0;
        }
        public void whenTagged(Bee bee) {
            bee.setHealth(availableHealth);
            availableHealth = 0;
        }

        public void onTick() {
            availableHealth++;
        }
    }