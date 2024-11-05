import java.util.ArrayList;
import java.util.List;

public class Book extends Media{

    private int stock;
    private List<Review> reviews;

    Book(){}
    Book(String title, String author, String ISBN, double price,int stock){
        super(title, author, ISBN, price);
        this.stock=stock;
        this.reviews= new ArrayList<>();
    }

    public void setStock(int stock){this.stock= stock;}
    public int getStock(){return stock;}

    public void addReview(Review r){
        reviews.add(r);
    }

    public double getAverageRating(){
        double ratings = 0;
        for (Review review : reviews) {
             ratings += review.getRating();
        }
        return ratings / reviews.size();
    }

    public void purchase(User user) {
        if (stock > 0){
            user.addToCart(this);
            stock--;
        }else System.out.println("Stock is empty.");
    }

    public boolean isBestseller(){
        if (getAverageRating()>4.5){return true;
        }else return false;
    }
    public void restock(int quantity){
        System.out.println("Stock updated.");
        this.stock+= quantity;
    }

@Override
    public String getMediaType(){
        if (getAverageRating()>= 4.5){
        return "Bestselling Book";
    }else return "Book";
}

public String toString(){
    return "Book title: "+getTitle()+", authored by "+getAuthor()+".\n" +
            "|ISBN|: "+getISBN()+"\n" +
            "Cost: "+getPrice()+"$\n" +
            "Stock: "+getStock();
}

}
