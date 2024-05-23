public class TotalOrder implements OrderCalculator
{
    public void calculateTotal(double price, int quantity)
    {
        double total = price * quantity;
        System.out.println("Order total: $" + total);
    }

}