import java.util.List;

public interface Ads {
    // get a list ogit checkout -b jdbc-exercisef all the ads
    List<Ad> all();
    // insert a new ad and return the new ad's id
    Long insert(Ad ad);
}
