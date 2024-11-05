import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("----------Media------------");
        Media m1 = new Media("Animal Farm","George Orwell","978-3-16-148410-0",50);
        Media m2 = new Media();

        System.out.println(m1.toString());

        System.out.println("----------Book------------");
        Book b1= new Book("The Adventures of Huckleberry Finn","Mark Twain","978-3-16-148410-1", 79.99,10);
        System.out.println(b1.toString());
        Book b2= new Book("A Christmas Carol\t","Charles Dickens","978-3-16-248412-1", 79.99,10);
        Book b3= new Book("David Copperfield\t","Charles Dickens","978-3-16-144410-14", 79.99,10);
        Book b4= new Book("A Tale of Two Cities\t","Charles Dickens","978-3-16-148440-11", 79.99,10);

        System.out.println("----------Music------------");
        Music mu1 = new Music("A Brand New Day","Luther Vandross","978-3-16-148410-2",24.99,"Michael Jackson");
        Music mu2 = new Music("Smooth Criminal", "Michael Jackson","998-2-16-148410-3",23.99,"Michael Jackson");
        Music mu3 = new Music("Billie Jean", "Michael Jackson","978-3-16-111410-2",22.99,"Michael Jackson");
        Music mu4 = new Music("Darkside","David Kushner","978-3-66-348410-3",29.99,"David Kushner");
        System.out.println(mu1.toString());

        System.out.println("----------Movie------------");
        Movie mo1 = new Movie("Dawn","jack j","978-3-16-148410-3",15.99,120);
        System.out.println(mo1.toString());

        System.out.println("----------Novel------------");
        Novel n1 = new Novel("Ants in the dust","Mohammed Alharbi","978-3-16-148410-4",1.99,1000,"Horror - Action");
        System.out.println(n1.toString());

        System.out.println("----------AcademicBook------------");
        AcademicBook a1 = new AcademicBook("Introduction to Math","Einstien","978-3-16-148410-5",9.99,15,"Math");
        System.out.println(a1.toString());

        System.out.println("----------Store------------");

        Store jarir = new Store();

        jarir.addMedia(m1);
        jarir.addMedia(b1);
        jarir.addMedia(b2);
        jarir.addMedia(b3);
        jarir.addMedia(b4);
        jarir.addMedia(mu1);
        jarir.addMedia(mu2);
        jarir.addMedia(mu3);
        jarir.addMedia(mu4);
        jarir.addMedia(mo1);
        jarir.addMedia(n1);
        jarir.addMedia(a1);

        jarir.displayMedia();

        System.out.println("----------User------------");
        User mohammed= new User("Mohammed Saad Alharbi","mohammed@gmail.com");
        jarir.addUser(mohammed);
        jarir.displayUsers();
        mohammed.addToCart(a1);
        mohammed.addToCart(mu1);
        mohammed.addToCart(b1);
        System.out.println("Shopping cart:"+mohammed.getShoppingCart());
        System.out.println("---------------------------");
        mohammed.removeFromCart(mu1);
        System.out.println("Cart after the remove: "+mohammed.getShoppingCart());
        System.out.println("---------checkout----------");
        mohammed.checkout();
        System.out.println("---------------------------");
        System.out.println("Bill: "+mohammed.getPurchaseMediaList());
        System.out.println("Cart after Checkout: "+mohammed.getShoppingCart());
        System.out.println("---------------------------");
        System.out.println("----------Review------------");
        Review mohammedb1review = new Review("Mohammed Saad",4.85,"I liked the adventures book");
        Review mohanedb1review = new Review("mohaned Saeed",3.88,"There's better books");
        Review mamdohdb1review = new Review("mamdohd Saud",2.99,"Not bad not good");
        Review majedb1review = new Review("majed masauad",5,"The adventures book IS AWESOME");

        System.out.println(mohammedb1review.toString());
        b1.addReview(mohammedb1review);
        b1.addReview(mohanedb1review);
        b1.addReview(mamdohdb1review);
        b1.addReview(majedb1review);
        System.out.println("The average for "+b1.getTitle()+" is "+b1.getAverageRating());

        System.out.println("--------different scenarios--------");
        System.out.println("--------media class testing----------");
        // media class testing all unused methods scenarios.
        m1.getMediaType();
        m2.setTitle("The cat & and the mouse");
        m2.setAuthor("MBC3");
        m2.setISBN("978-3-16-144410-4");
        m2.setPrice(99.9);
        System.out.println(m2.toString()); // DONE
        System.out.println("--------Book class testing----------");
        // Book class testing all unused methods scenarios.
        System.out.println(b1.getTitle()+" stock "+b1.getStock());
        b1.purchase(mohammed);
        System.out.println(b1.getTitle()+" stock "+b1.getStock());
        b1.setStock(8);
        System.out.println(b1.getTitle()+" stock "+b1.getStock());
        b1.restock(12);
        System.out.println(b1.getTitle()+" stock "+b1.getStock());

        if (b1.isBestseller()){
            System.out.println(b1.getTitle()+" Is best seller with average rating of "+b1.getAverageRating());
        }else System.out.println(b1.getTitle()+" Is not a best seller with average rating of "+b1.getAverageRating());

        System.out.println("--------Music class testing----------");
        // Music class testing all unused methods scenarios.
        User mohanned = new User("Mohanned", "mohanned@gmail.com");
        mu1.listen(mohanned);
        System.out.println(mohanned.toString());
        System.out.println("-----------------------------------");
        ArrayList<Music> musicCatalog = new ArrayList<>();
        musicCatalog.add(mu1);
        musicCatalog.add(mu2);
        musicCatalog.add(mu3);
        musicCatalog.add(mu4);
        mu2.generatePlaylist(musicCatalog);
        System.out.println("-----------------------------------");
        Music mu5 = new Music();
        mu5.setArtist("David Kushnerr");
        mu5.setTitle("Lio & io");
        mu5.setAuthor("David Kushnerr");
        mu5.setISBN("978-3-16-112450-3");
        mu5.setPrice(32.99);
        System.out.println("Music title: "+mu5.getTitle()+", authored by "+mu5.getAuthor()+".\n" +
                "Artist: "+mu5.getArtist()+"\n"+
                "|ISBN|: "+mu5.getISBN()+"\n" +
                "Cost: "+mu5.getPrice()+"$");
        System.out.println(mu5.getMediaType());

        System.out.println("--------Movie class testing----------");
        // Movie class testing all unused methods scenarios.

        Movie mo2 = new Movie("sunrise","jack j","978-3-16-148410-3",15.99,111);
        Movie mo3 = new Movie("after sun rise","jack j","978-3-16-148410-3",15.99,112);
        Movie mo4 = new Movie("after after sun rise","jack j","978-3-16-148410-3",15.99,113);

        ArrayList<Movie> movieCatalog= new ArrayList<>();
        movieCatalog.add(mo1);
        movieCatalog.add(mo2);
        movieCatalog.add(mo3);
        movieCatalog.add(mo4);
        mo1.recommendSimilarMovies(movieCatalog);

        System.out.println("-----------------------------------");
        Movie mo5 = new Movie();
        mo5.setTitle("Jacky Chan & The 7 treasures");
        mo5.setAuthor("Chun Lee");
        mo5.setISBN("988-6-26-148410-3323");
        mo5.setDuration(123);
        mo5.setPrice(7.77);
        System.out.println(mo5.toString());
        System.out.println(mo5.getMediaType());

        System.out.println("--------Novel class testing----------");
        // Novel class testing all unused methods scenarios.

        Novel n2 = new Novel();
        n2.setTitle("Dusts in the ant");
        n2.setAuthor("Alharbi Mohammed");
        n2.setGenre("Horror - Action");
        n2.setISBN("978-3-16-448411-333");
        n2.setPrice(21.99);
        n2.setStock(22);
        System.out.println(n2.toString());
        System.out.println(n1.getMediaType());

        System.out.println("--------AcademicBook class testing----------");
        // AcademicBook class testing all unused methods scenarios.
        AcademicBook a2 = new AcademicBook();
        a2.setTitle("Quantum Physics");
        a2.setAuthor("Oppenheimer");
        a2.setSubject("Physics");
        a2.setISBN("878-3-16-448411-333");
        a2.setPrice(21.99);
        a2.setStock(22);
        System.out.println(a2.toString());

        Review r1 = new Review("Khaled", 4.99,"I Like Physics");
        Review r2 = new Review("Fahad", 5,"I really Like Physics");

        a1.addReview(r1);
        a1.addReview(r2);
        System.out.println(a1.getMediaType());
        System.out.println("--------User------------");

        User u1 = new User();

        u1.setUsername("Saad");
        u1.setEmail("saad@gmail.com");
        System.out.println(u1.toString());

        System.out.println("--------Store------------");

        if(jarir.searchBook(b1.getTitle()) == null){
            System.out.println("Book not found !!");
        }else System.out.println(jarir.searchBook(b1.getTitle()));

        System.out.println("--------Review------------");

        Review r3 = new Review();
        r3.setUsername("Osama");
        r3.setRating(3.75);
        r3.setComment("Hello");
        System.out.println(r3.toString());



    }
}