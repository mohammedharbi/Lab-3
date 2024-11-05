import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String email;
    private List<Media> purchaseMediaList;
    private List<Media> shoppingCart;

    User(){}
    User(String username, String email){
        this.username= username;
        this.email= email;
        this.purchaseMediaList= new ArrayList<>();
        this.shoppingCart= new ArrayList<>();
    }
    public void setUsername(String username){this.username= username;}
    public void setEmail(String email){this.email= email;}
    public String getEmail(){return email;}
    public String getUsername(){return username;}
    public List<Media> getPurchaseMediaList(){return purchaseMediaList;}
    public List<Media> getShoppingCart(){return shoppingCart;}

    public void addToCart(Media media){
        shoppingCart.add(media);
    }
    public void addToPurchased(Media media){
        purchaseMediaList.add(media);
    }
    public void removeFromCart(Media media){
        shoppingCart.remove(media);
    }
    public void checkout(){

        for(Media media: shoppingCart){
            purchaseMediaList.add(media);
        }
        shoppingCart.clear();
        System.out.println("Check out completed.");
    }

    public String toString(){
        return "Username: "+username+"\n"+
                "Email: "+email+"\n"+
                "Shopping cart: "+shoppingCart+"\n"+
                "Purchased items: "+purchaseMediaList;
    }
}
