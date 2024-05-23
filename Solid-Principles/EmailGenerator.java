public class EmailGenerator implements Notification
{
    public void sendEmailNotification(String email)
    {
        System.out.println("Email notification sent to: " + email);
    }
}