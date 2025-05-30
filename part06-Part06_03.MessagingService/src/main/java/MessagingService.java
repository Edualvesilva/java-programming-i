
import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> message;

    public MessagingService() {
        this.message = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() > 280) {
            return;
        }

        this.message.add(message);

    }

    public ArrayList<Message> getMessages() {

        return this.message;
    }

}
