import java.util.ArrayList;
import java.util.List;

public class Movie extends Media {

    private int duration;

    Movie(){}
    Movie(String title, String author, String ISBN, double price, int duration){
        super(title, author, ISBN, price);
        this.duration= duration;
    }
    public void setDuration(int duration){
        this.duration= duration;
    }
    public int getDuration(){return duration;}

    public void watch(User user){
        user.addToPurchased(this);
        System.out.println("Enjoy watching.");
    }

    public List<Movie> recommendSimilarMovies(List<Movie> movieCatalog) {
        for (Movie movie : movieCatalog) {
            if (movie.getAuthor().equalsIgnoreCase(super.getAuthor()) && !movie.equals(this)) {
                System.out.println(" - " + movie.getTitle() + " by " + movie.getAuthor());
            }
        }
        return movieCatalog;
    }


    @Override

    public String getMediaType(){
        if (duration >= 120){return "Long Movie";}else return "Movie";
}

    public String toString(){
        return "Movie title: "+getTitle()+", directed by "+getAuthor()+".\n" +
                "Duration: "+getDuration()+" minutes.\n"+
                "|ISBN|: "+getISBN()+"\n" +
                "Cost: "+getPrice()+"$";
    }
}