public class Pirate {
    // A pirate has a name, an amount of gold and health points, the default value of which is 10.
    private String name;
    private int goldPoints;
    private int healthPoints;

    public Pirate(String name, int goldPoints, int healthPoints) {
        this.name = name;
        this.healthPoints += 10;
        this.healthPoints += 10;
    }

    public Pirate() {
        super();
    }

    public void introduce() {
        System.out.println("Hello, I'm " + name + introduceNext() + goldPoints + " golds. ");
    }

    public String introduceNext() {
        if (// has a wooden leg){
        return ". I have a wooden leg and ";
    }
        else

    {
        return ". I still have my real legs and ";
    }

    public void work() {
        goldPoints += 1;
        healthPoints -= 1;
    }

    public void party() {
        healthPoints += 1;
    }
}
