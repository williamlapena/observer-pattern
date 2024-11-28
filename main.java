public class main {
    public static void main(String[] args) {

        NewsAgency newsAgency = new NewsAgency();

        Subscriber Jeron = new Subscriber("Jeron");
        Subscriber Gian = new Subscriber("Gian");
        Subscriber Lorenz = new Subscriber("Lorenz");

        newsAgency.subscribe(Gian);
        newsAgency.publishNews("What the sigma?!");

        newsAgency.subscribe(Lorenz);
        newsAgency.publishNews("Watch out for this new guy!");

        newsAgency.subscribe(Jeron);
        newsAgency.publishNews("I am afraid of this man.");

        newsAgency.unsubscribe(Gian);
        newsAgency.publishNews("You guys took out the wrong guy!");
    }
}