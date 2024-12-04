package GroupTask;

public class Task2_LG extends Task2_Tv implements Task2_Display, Task2_ScreenSize, Task2_Resolution, Task2_SoundQuality, Task2_TVPrice{

    public void operatingSystem()
    {
        System.out.println("Windows operating system");
    }

    public static void main(String[] args) {
        Task2_LG task2_lg = new Task2_LG();
        task2_lg.operatingSystem();
        System.out.println(" ");
        task2_lg.brand(); //java class
        System.out.println(" ");

        task2_lg.LED(); //Interface class1
        task2_lg.LCD();
        task2_lg.OLED();
        System.out.println(" ");

        task2_lg.fiftyInch();
        task2_lg.twentyFiveInch();
        task2_lg.fifteenInch();
        System.out.println(" ");

        task2_lg.HD();
        task2_lg.fullHD();
        task2_lg.uhd();
        System.out.println(" ");

        task2_lg.integratedSpeaker();
        task2_lg.doblyAtoms();
        task2_lg.dts();
        System.out.println(" ");

        task2_lg.lowPrice();
        task2_lg.mediumPrice();
        task2_lg.highPrice();
    }


    @Override
    public void LED() {
        System.out.println("This is Light Emitting Diode Method of Interface class 1");

    }

    @Override
    public void LCD() {
        System.out.println("This is the Liquid Crystal Display method of Interface class 1");

    }

    @Override
    public void OLED() {
        System.out.println("This is the Organic Light Emitting Diode method of Interface class 1");

    }
    @Override
    public void fifteenInch() {
        System.out.println("This is the fifteenInch method of Interface class 2");

    }

    @Override
    public void twentyFiveInch() {
        System.out.println("This is the twentyFiveInch method of Interface class 2");

    }

    @Override
    public void fiftyInch() {
        System.out.println("This is the fiftyinch method of interface class 2");

    }
    @Override
    public void HD()
    {
        System.out.println("This is the high dynamic method of interface class 3");
    }

    @Override
    public void fullHD()
    {
        System.out.println("This is the full high dynamic method of interface class 3");
    }

    @Override
    public void uhd()
    {
        System.out.println("This is the ultra high dynamic method of interface class 3");
    }

    @Override
    public void integratedSpeaker()
    {
        System.out.println("This is the integratedSpeaker method of interface class 4");
    }

    @Override
    public void doblyAtoms()
    {
        System.out.println("This is the doblyAtoms method of interface class 4");
    }
    @Override
    public void dts()
    {
        System.out.println("This is the dts method of interface class 4");
    }

    @Override
    public void lowPrice() {
        System.out.println("This is the lowprice method of interface class 5");
    }

    @Override
    public void mediumPrice() {
        System.out.println("This is the mediumprice method of interface class 5");
    }

    @Override
    public void highPrice() {
        System.out.println("This is the highprice method of interface class 5");
    }
}

