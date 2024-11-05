import java.util.ArrayList;
import java.util.List;

public class Music extends Media{

    private String artist;

    Music(){}
    Music(String title, String author, String ISBN, double price,String artist){
        super(title, author, ISBN, price);
        this.artist= artist;
    }

    public void setArtist(String artist){this.artist=artist;}
    public String getArtist(){return artist;}

    public void listen(User user){
        user.addToPurchased(this);
        System.out.println("Enjoy listing.");
    }
    public List<Music> generatePlaylist(List<Music> musicCatalog){
        for (Music music : musicCatalog) {
            if (music.getArtist().equalsIgnoreCase(this.artist) && !music.equals(this)) {
                System.out.println(" - " + music.getTitle()+" by "+music.getArtist());
            }
    }
        return musicCatalog;
    }

    @Override
    public String getMediaType(){
        if (super.getPrice() >= 10){return "Premium Music";
        }else return "Music";
    }

    public String toString(){
        return "Music title: "+getTitle()+", authored by "+getAuthor()+".\n" +
                "Artist: "+getArtist()+"\n"+
                "|ISBN|: "+getISBN()+"\n" +
                "Cost: "+getPrice()+"$";
    }

}

