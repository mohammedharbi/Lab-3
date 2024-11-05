public class Review {

    private String username;
    private double rating;
    private String comment;

    Review(){}
    Review(String username, double rating, String comment){
        this.username= username;
        setRating(rating);
        this.comment= comment;
    }

    public void setUsername(String username){this.username=username;}
    public void setRating(double rating){
        if (rating > 0 && rating <= 5){
        this.rating=rating;
        }else System.out.println("Rating must be greater than 0 and less than 5.");
    }
    public void setComment(String comment){this.comment=comment;}
    public String getUsername(){return username;}
    public double getRating(){return rating;}
    public String getComment(){return comment;}

    public String toString(){
        return "User name: "+username+"\n"+
                "Rating: "+rating+"\n"+
                "Comment: "+comment;}
}
