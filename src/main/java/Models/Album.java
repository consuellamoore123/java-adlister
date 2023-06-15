package Models;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor

public class Album implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String artist;
    private String name;
    private int release_date;
    private float sales;
    private String genre;
    // Include other properties as per your table structure
}




