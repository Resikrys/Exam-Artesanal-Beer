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

    @Override
    public  void fermentation() {
        System.out.println("Ipa beer fermentation process.");
    }

    @Override
    public  void ingredients() {
        System.out.println("Adding Ipa's special hop and other ingredients");
    }

    @Override
    public  void maturation() {
        System.out.println("Ipa maturation process");
    }
}
