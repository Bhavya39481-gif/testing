package GroupTask;

public class AeroplaneChild extends FlyableParent{
    public void tailSectio()
    {
        System.out.println("This is the tailsection method of 2nd child class");
    }

    public static void main(String[] args) {
        AeroplaneChild a1 = new AeroplaneChild();
        a1.tailSectio();
        System.out.println("added for space");

        a1.fly();
        a1.fuelSystem();
        a1.seatingCapacity();
        a1.speed();
        a1.wings();

    }
}

