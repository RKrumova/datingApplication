import java.util.Date;

public class Notification {
    private String title;
    private String message;
    private Date timestamp;
    private final User user;
    public Notification(User user) {

        this.user = user;
    }

    public void sendNotification(User user, String message) {
        // Send a notification to the user with the given message
        // You can use a third-party library like Firebase Cloud Messaging (FCM) or Amazon SNS to send push notifications
        // Alternatively, you can use an email or SMS service to send notifications to users who have opted in
    }
    public Notification(String title, String message, User user) {
        this.title = title;
        this.message = message;
        this.user = user;
        this.timestamp = new Date();
    }

    // getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
/**
 In this example, the Notification class has three attributes: title, message, and timestamp. The title and message attributes represent the content of the notification, while the timestamp attribute represents the time the notification was sent.

 The class has a constructor that takes in a title and message, sets the corresponding attributes, and initializes the timestamp to the current time using the Date() constructor.

 The class also has getter and setter methods for each attribute to allow for accessing and modifying the notification's content and timestamp.

 You could add more attributes to the Notification class as needed, such as an ID to uniquely identify each notification or a sender/receiver attribute to indicate who the notification is for.

 * */
/**
 * */