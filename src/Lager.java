import java.util.Date;

public class Lager extends Beer {
    private double fermentationTemperature;

    public Lager(String name, double alcohol, Container container, Date manufactureDate, double fermentationTemperature) {
        super(name, alcohol, container, manufactureDate);
        this.fermentationTemperature = fermentationTemperature;
    }

    public double getFermentationTemperature() {
        return fermentationTemperature;
    }

    @Override
    public  void fermentation() {
        System.out.println("Lager beer is fermented at a special temperature.");
    }

    @Override
    public  void ingredients() {
        System.out.println("Adding lager ingredients");
    }

    @Override
    public  void maturation() {
        System.out.println("Lager maturation process");
    }
}
