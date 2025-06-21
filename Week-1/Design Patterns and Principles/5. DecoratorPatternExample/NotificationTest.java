public class NotificationTest {
    public static void main(String[] args) {
        // Basic email notifier
        Notifier notifier = new EmailNotifier();

        // Add SMS and Slack decorators
        notifier = new SMSNotifierDecorator(notifier);
        notifier = new SlackNotifierDecorator(notifier);

        // Send notification
        notifier.send("System maintenance at 10 PM tonight.");
    }
}
