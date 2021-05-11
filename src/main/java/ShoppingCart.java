import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Products> productsCart;
    private double totalAmount;
    List<Products> availableProductList;

    public ShoppingCart(){
        productsCart=new ArrayList<>();
        totalAmount=0;
        availableProductList=new ArrayList<>();
    }

    public String addProductsToCart(String productName,int quantity)
    {
        Products product=availableProductList.stream().filter(p -> p.getName().equals(productName) )
                .findFirst().orElse(null);

        if(product.getAvailableStock()>=quantity)
        {
            productsCart.add(product);
            product.updateStock(product.getAvailableStock()-quantity);
            totalAmount=totalAmount+(product.getPrice()*quantity);
            return "added";
        }
        else
        {
            return String.format("%s has less stocks than requested",product.getName());
        }
    }

    public double getTotalAmount()
    {
        return totalAmount;
    }

    public void setStockList(List<Products> stockList)
    {
        this.availableProductList=stockList;
    }
}
