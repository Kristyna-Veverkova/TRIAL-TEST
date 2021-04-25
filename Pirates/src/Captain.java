public class Captain extends Pirate {

    private int goldPoint;
    private int healthPoint;

    public Captain(String name, int goldPoints, int healthPoints) {
        super(name, goldPoints, healthPoints);
    }

    @Override
    public void work() {
        super.work();
        goldPoint += 10;
        healthPoint -= 5;
    }

    @Override
    public void party() {
        healthPoint += 10;
    }
}
