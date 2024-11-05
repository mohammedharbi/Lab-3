public class Novel extends Book{

    private String genre;

    Novel(){}
    Novel(String title, String author, String ISBN, double price,int stock, String genre){
        super(title, author, ISBN, price, stock);
        this.genre= genre;
    }

    public void setGenre(String genre){
        this.genre= genre;
    }
    public String getGenre(){
        return genre;
    }

    @Override
    public String getMediaType(){
        if ( getAverageRating()>= 4.5){
        return "Bestselling Novel";}else return "Novel";}

    public String toString(){
        return "Book title: "+getTitle()+", authored by "+getAuthor()+".\n" +
                "Genre: "+getGenre()+".\n"+
                "|ISBN|: "+getISBN()+"\n" +
                "Cost: "+getPrice()+"$\n" +
                "Stock: "+getStock();
    }
}
