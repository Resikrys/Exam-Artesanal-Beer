import java.util.ArrayList;
import java.util.List;

public class BeerManager {
    private List<Beer> beerList = new ArrayList<>();

    public void addBeer(Beer beer) {
        beerList.add(beer);
    }

    public void showBeerList() {
        beerList.forEach(b -> System.out.println(b.toString()));
    }

    public void alcoholFilter() {
        beerList.stream()
                .filter(b -> b.getAlcohol() > 5)
                .forEach(b -> System.out.println(b.getName() + " - Alcohol: " + b.getAlcohol() + "%"));
    }
}
