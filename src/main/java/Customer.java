import java.util.List;

public class Customer {


    private String name;
    private double eWallet;
    private ShoppingCart shoppingCart;

    public Customer(String name,double amount)
    {
        this.name=name;
        this.eWallet=amount;
        shoppingCart=new ShoppingCart();
    }

    public void setStockList(List<Products> productsList)
    {
        shoppingCart.setStockList(productsList);
    }

    public String addToCart(String productName,int quantity)
    {
        return shoppingCart.addProductsToCart(productName,quantity);
    }

    public boolean checkBalance()
    {
        if(eWallet>shoppingCart.getTotalAmount()) {
            return true;
        }
        return false;
    }
    public String getBalance()
    {
        if(checkBalance()) {
            eWallet = eWallet - shoppingCart.getTotalAmount();
            return String.format("%.2f is the balance in your eWallet",eWallet);
        }
        return "low Balance,Please add amount to your EWallet";
    }


}
