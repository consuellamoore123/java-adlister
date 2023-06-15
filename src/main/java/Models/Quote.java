package Models;

import lombok.*;

import java.io.Serializable;
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor

public class Quote implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String content;
    private String author;
    // Include other properties as per your table structure
}

