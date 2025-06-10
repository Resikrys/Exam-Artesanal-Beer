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
}
