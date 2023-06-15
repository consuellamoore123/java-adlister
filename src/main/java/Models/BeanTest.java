package Models;

public class BeanTest {
    public static void main(String[] args) {
        // Instantiate some Album objects
        Album album1 = new Album();
        album1.setId(1);
        album1.setName("Thriller");
        album1.setArtist("Michael");

        Album album2 = new Album();
        album2.setId(2);
        album2.setName("Back in Black");
        album2.setArtist("ACDC");

        // Instantiate some Author objects
        Author author1 = new Author();
        author1.setId(1);
        author1.setFirstName("T.R");
        author1.setLastName("Ragan");

        Author author2 = new Author();
        author2.setId(2);
        author2.setFirstName("Paulo");
        author2.setLastName("Coelho");

        // Instantiate some Quote objects and associate them with authors
        Quote quote1 = new Quote();
        quote1.setId(1);
        quote1.setContent("If you change the way you look at things, the things you look at change");
        quote1.setAuthor("Wayne Dyer");

        Quote quote2 = new Quote();
        quote2.setId(2);
        quote2.setContent("When you get tired, learn to rest, not quit");
        quote2.setAuthor("Banksy");

        // Print the details of the instantiated objects
        System.out.println("Album 1: " + album1.getName() + " by " + album1.getArtist());
        System.out.println("Album 2: " + album2.getName() + " by " + album2.getArtist());
        System.out.println("Author 1: " + author1.getFirstName() + author1.getLastName());
        System.out.println("Author 2: " + author2.getFirstName() + author2.getLastName());
        System.out.println("Quote 1: " + quote1.getContent() + " by " + quote1.getAuthor());
        System.out.println("Quote 2: " + quote2.getContent() + " by " + quote2.getAuthor());
    }
}
