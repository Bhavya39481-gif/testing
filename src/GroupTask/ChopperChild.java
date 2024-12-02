package GroupTask;

public class ChopperChild extends FlyableParent{

    public void size()
    {
        System.out.println("This is the size method of chopper 1st child class");
    }

    public static void main(String[] args) {
        ChopperChild c1 = new ChopperChild();
        c1.size();
        System.out.println(" ");

        c1.fly();
        c1.fuelSystem();
        c1.seatingCapacity();
        c1.wings();
        c1.speed();
    }
}
