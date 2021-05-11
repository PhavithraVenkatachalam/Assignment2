public class Products {

    private  int availableStock;
    private  double price;
    private  String name;

    public Products(String name, double price, int availableStock)
    {
        this.name=name;
        this.price=price;
        this.availableStock=availableStock;
    }

    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }

    public int getAvailableStock()
    {
        return availableStock;
    }

    public void updateStock(int stock)
    {
        availableStock=stock;
    }
}
