import java.util.Observable;
import java.util.Observer;

class Server extends Observable {
    private String data;
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
        setChanged();
    }
}

class Phone implements Observer {

    Server subject;

    public Phone(Server server){
        subject = server;
    }

    @Override
    public void update(Observable o, Object args) {
        System.out.println(this.subject.getData());
    }
}
public class ObserverDemo{

    public static void main(String[] main){
        Server cloud = new Server();
        Phone iPhone = new Phone(cloud);
        Phone pixel = new Phone(cloud);
        cloud.addObserver(iPhone);
        cloud.addObserver(pixel);
        cloud.setData("New Data");
        cloud.notifyObservers();
    }
}