import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<User> users;
    private List<Media> media;

    Store() {
        this.users = new ArrayList<>();
        this.media = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void displayUsers() {
        int i = 1;
        for (User m : users) {
            System.out.println("-------User" + i + "----------");
            System.out.println(m);
            System.out.println("----------------------");
            i++;
        }
    }

        public void addMedia(Media media){
            this.media.add(media);
        }

        public void displayMedia() {
            int i = 1;
            for (Media m : media) {
                System.out.println("-------Item" + i + "----------");
                System.out.println(m);
                System.out.println("----------------------");
                i++;
            }
        }

        public Book searchBook(String title){
            for (Media media : media) {
                if (title == media.getTitle()) {
                    return (Book) media;
                }
            }

            return null;
        }


}
