import org.testng.Assert;
import org.testng.annotations.Test;

public class TestShoppingCart {

    @Test
    public void testEWalletBalance()
    {
        StockList stockList=new StockList();
        Customer customer=new Customer("phavi",2000);

        customer.setStockList(stockList.getProductsList());
        customer.addToCart("Apple",10);
        customer.addToCart("milk",10);
        customer.addToCart("NewsPaper",3);
        String actualValue= customer.getBalance();

        Assert.assertEquals(actualValue,"1540.00 is the balance in your eWallet");
    }

    @Test
    public void testWithLowStock()
    {
        StockList stockList=new StockList();
        Customer customer=new Customer("phavi",2000);

        customer.setStockList(stockList.getProductsList());
        String actual=customer.addToCart("Apple",30);
        customer.addToCart("milk",10);
        customer.addToCart("NewsPaper",3);
        String actualValue=customer.getBalance();

        Assert.assertEquals(actual,"Apple has less stocks than requested");
        Assert.assertEquals(actualValue,"1740.00 is the balance in your eWallet");
    }

    @Test
    public void testWithLowBalance()
    {
        StockList stockList=new StockList();
        Customer customer=new Customer("phavi",100);

        customer.setStockList(stockList.getProductsList());
        String actual=customer.addToCart("Apple",30);
        customer.addToCart("milk",10);
        customer.addToCart("NewsPaper",3);
        String actualValue=customer.getBalance();

        Assert.assertEquals(actual,"Apple has less stocks than requested");
        Assert.assertEquals(actualValue,"low Balance,Please add amount to your EWallet");
    }
}
