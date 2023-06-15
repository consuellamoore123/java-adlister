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
    private String title;
    private String artist;
    // Include other properties as per your table structure
}




