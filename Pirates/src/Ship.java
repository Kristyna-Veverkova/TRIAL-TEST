import java.util.List;

public class Ship extends Pirate {

    private int goldPoint;
    private int healthPoint;
    private List<Pirate> pirates;

    public Ship() {

    }

    public int getGoldPoint()

    {
        return goldPoint;
    }

    public int setGoldPoint(int goldPoint)

    {
        return goldPoint;
    }

    public void getPoorPirates() {
        boolean shipGoldPoint = goldPoint<15;
        pirates.contains(shipGoldPoint);
        for (Pirate richPirates : pirates) {
            if(richPirates <= shipGoldPoint && woodenLeg){
                System.out.println(richPirates.introduce());
        }
        }
        //which returns a list of names containing the pirates that
        //have a wooden leg and have less than 15 golds
    }

    public void getGolds() {
        //which returns the sum of gold owned by the pirates of that particular ship
    }

    public void lastDayOnTheShip() {
        party();
    }

    public void prepareForBattle() {
        work();
        for (int i = 0; i <= 5; i++) {
            System.out.println("Keep working lazy pirates!");
        }
        lastDayOnTheShip();
        System.out.println("After this party, its going to be for some of you the last day on the ship!");
    }
}
