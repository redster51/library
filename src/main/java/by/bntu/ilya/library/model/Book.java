package by.bntu.ilya.library.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "uuid", nullable = false)
    private Long uuid;

    @Column
    private String title;

    @Column
    private String text;

    @Column
    private String description;

    @Column
    private String author;

    @Column
    private String imageUrl;

    @ElementCollection
    @CollectionTable(name = "book_tags", joinColumns = @JoinColumn(name = "book_uuid"))
    @Column(name = "tag")
    private List<String> tags = new ArrayList<>();
}
