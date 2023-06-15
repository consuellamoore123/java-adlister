public class BeanTest {
    public static void main(String[] args) {
        // Instantiate some Album objects
        Album album1 = new Album();
        album1.setId(1);
        album1.setTitle("Album 1");
        album1.setArtist("Artist 1");

        Album album2 = new Album();
        album2.setId(2);
        album2.setTitle("Album 2");
        album2.setArtist("Artist 2");

        // Instantiate some Author objects
        Author author1 = new Author();
        author1.setId(1);
        author1.setName("Author 1");

        Author author2 = new Author();
        author2.setId(2);
        author2.setName("Author 2");

        // Instantiate some Quote objects and associate them with authors
        Quote quote1 = new Quote();
        quote1.setId(1);
        quote1.setContent("Quote 1");
        quote1.setAuthor(author1);

        Quote quote2 = new Quote();
        quote2.setId(2);
        quote2.setContent("Quote 2");
        quote2.setAuthor(author2);

        // Print the details of the instantiated objects
        System.out.println("Album 1: " + album1.getTitle() + " by " + album1.getArtist());
        System.out.println("Album 2: " + album2.getTitle() + " by " + album2.getArtist());
        System.out.println("Author 1: " + author1.getName());
        System.out.println("Author 2: " + author2.getName());
        System.out.println("Quote 1: " + quote1.getContent() + " by " + quote1.getAuthor().getName());
        System.out.println("Quote 2: " + quote2.getContent() + " by " + quote2.getAuthor().getName());
    }
}
