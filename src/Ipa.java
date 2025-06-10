import java.util.Date;

public class Ipa extends Beer {
    private double hopQuantity;

    public Ipa(String name, double alcohol, Container container, Date manufactureDate, double hopQuantity) {
        super(name, alcohol, container, manufactureDate);
        this.hopQuantity = hopQuantity;
    }

    public double getHopQuantity() {
        return hopQuantity;
    }
}
