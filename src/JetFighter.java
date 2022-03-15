public class JetFighter extends Vehicle{
    private int missiles;

    public JetFighter(String name, int wheels, int missiles)
    {
        super(name, wheels);
        this.missiles = missiles;
    }

    public int getMissiles()
    {
        return missiles;
    }

    public void fire()
    {
        if(missiles > 0) {
            System.out.println("MISSILE FIRED");
            missiles--;
        }
        else
        {
            System.out.println("NO MORE MISSILES");
        }
    }
}
