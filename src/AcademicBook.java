public class AcademicBook extends Book{

    private String subject;

    AcademicBook(){}
    AcademicBook(String title, String author, String ISBN, double price,int stock, String subject){
        super(title, author, ISBN, price, stock);
        this.subject= subject;
    }
    public void setSubject(String subject){this.subject= subject;}
    public String getSubject(){return subject;}


    @Override
    public String getMediaType(){
        if ( getAverageRating()>= 4.5){
            return "Bestselling AcademicBook";}else return "AcademicBook";}

    public String toString() {
        return "Book title: "+getTitle()+", authored by "+getAuthor()+".\n" +
                "Subject: "+getSubject()+".\n"+
                "|ISBN|: "+getISBN()+"\n" +
                "Cost: "+getPrice()+"$\n" +
                "Stock: "+getStock();
    }

}
