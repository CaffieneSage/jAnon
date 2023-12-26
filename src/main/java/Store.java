import java.util.ArrayList;

public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {
        storeProducts.add(new ArtObject("Oil Painting", 1350, "Two swans by Sonja Westwood circa. 2010"));
        storeProducts.add(new ArtObject("Bronze Sculpture", 2599, "Roman general by Eric Pierce circa. 1983"));

        listProducts();
    }

    public static void listProducts() {

        for(var item: storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }
}
