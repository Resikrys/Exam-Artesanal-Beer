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
}
