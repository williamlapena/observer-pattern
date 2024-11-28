public class Subscriber implements SubscriberInterface{
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void Notifications(String notifications) {
        System.out.println(name + " has received news: " + notifications);
    }
}