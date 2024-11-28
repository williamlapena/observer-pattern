import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<SubscriberInterface> subscribers;

    public NewsAgency() {
        this.subscribers = new ArrayList<>();
    }
    public void subscribe(SubscriberInterface subscriber) {
        if (!subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
            System.out.println("A subscriber joined successfully.");
        }
    }
    public void unsubscribe(SubscriberInterface subscriber) {
        if (subscribers.remove(subscriber)) {
            System.out.println("A subscriber left successfully.");
        }
    }
    public void publishNews(String notifications) {
        System.out.println("News Update : " + notifications);
        for (SubscriberInterface subscriber : subscribers) {
            subscriber.Notifications(notifications);
        }
    }

}








