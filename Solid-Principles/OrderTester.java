public class OrderTester
{
    public static void main(String[] args)
    {
        Order order = new Order();
        TotalOrder totalOrder = new TotalOrder();
        EmailGenerator emailGenerator = new EmailGenerator();
        Invoice invoice = new Invoice();

        totalOrder.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");

        invoice.generateInvoice("order_123.pdf");
        emailGenerator.sendEmailNotification("johndoe@example.com");
    }
}