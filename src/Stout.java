import java.util.Date;

public class Stout extends Beer {
    private String maltType;

    public Stout(String name, double alcohol, Container container, Date manufactureDate, String maltType) {
        super(name, alcohol, container, manufactureDate);
        this.maltType = maltType;
    }

    public String getMaltType() {
        return maltType;
    }

    @Override
    public  void fermentation() {
        System.out.println("Stout beer fermentation process.");
    }

    @Override
    public  void ingredients() {
        System.out.println("Adding Stout's special malta type and other ingredients");
    }

    @Override
    public  void maturation() {
        System.out.println("Stout maturation process");
    }

    public String toString() {
        return "Name: " + getName() + ", alcohol: " + getAlcohol() + "%, container: " + getContainer() +
                ", manufacture Date: " + getManufactureDate() + ", malt type: " + getMaltType();
    }
}
