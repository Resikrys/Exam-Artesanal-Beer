import java.util.Date;

public abstract class Beer {
    private String name;
    private  double alcohol;
    private Container container;
    private Date manufactureDate;

    public Beer(String name, double alcohol, Container container, Date manufactureDate) {
        this.name = name;
        this.alcohol = alcohol;
        this.container = container;
        this.manufactureDate = manufactureDate;
    }

    public String getName() {
        return name;
    }

    public double getAlcohol() {
        return  alcohol;
    }

    public Container getContainer() {
        return container;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    @Override
    public void fermentation() {
        System.out.println("Step 1: Beer fermentation process");
    }

    @Override
    public void ingredients() {
        System.out.println("Step 2: Adding ingredients");
    }

    @Override
    public void maturation() {
        System.out.println("Step 3: Beer maturation process");
    }

    public String toString() {
        return "Name: " + getName() + ", alcohol: " + getAlcohol() + "%, container: " + getContainer() + ", manufacture Date: " + getManufactureDate();
    }

}
