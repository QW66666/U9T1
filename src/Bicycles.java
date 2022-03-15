public class Bicycles extends Vehicle{
    private int gearCount;

    public Bicycles(String name, int wheels, int gearCount)
    {
        super(name, wheels);
        this.gearCount = gearCount;
    }

    public int getGearCount()
    {
        return gearCount;
    }

    public void ringBell()
    {
        System.out.println("You ringed the bell");
    }
}
