public class Tank extends Vehicle
{
    private int ammunition;
    private int guns;

    public Tank(String name, int wheels, int ammunition, int guns)
    {
        super(name, wheels);
        this.ammunition = ammunition;
        this.guns = guns;
    }

    public int getAmmunition()
    {
        return ammunition;
    }

    public int getGuns()
    {
        return guns;
    }

    public void fireGun()
    {
        System.out.println("BAM!");
    }

    public void reload()
    {
        System.out.println("Quickly. Reload!");
    }
}