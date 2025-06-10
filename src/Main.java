import java.util.Date;

public class Main {
    public static void main(String[] args) {
        BeerManager beerManager = new BeerManager();

        beerManager.addBeer(Lager lager("lager", 4.4, Container.BOTTLE, Date.now(), 47.5));
        beerManager.addBeer(Ipa ipa("lager", 4.4, Container.BOTTLE, Date.now(), 5.5));
        beerManager.addBeer(Stout stout("lager", 4.4, Container.BOTTLE, Date.now(), "Black"));
    }


}