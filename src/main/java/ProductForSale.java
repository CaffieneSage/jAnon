public abstract class ProductForSale {

    protected String type = "";
    protected double price = 0;
    protected String description = "";

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }


    public double getPrice(int quantity) {
        return quantity * price;
    }

    public void printItem(int quantity) {

        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n",
                quantity, price, type, description);

    }

    public abstract void showDetails();


}
