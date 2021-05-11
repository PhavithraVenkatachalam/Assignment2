import java.util.ArrayList;
import java.util.List;

public class StockList {

    private List<Products> productsList;

    public StockList()
    {
        productsList=new ArrayList<>();
        initialProducts();
    }

    private void initialProducts() {
        productsList.add(new Products("Apple",20,20));
        productsList.add(new Products("milk",20,20));
        productsList.add(new Products("NewsPaper",20,20));
    }

    public void addProducts(Products product)
    {
        productsList.add(product);

    }

    public List<Products> getProductsList()
    {
        return productsList;
    }

}
