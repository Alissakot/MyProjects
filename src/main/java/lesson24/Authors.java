package lesson24;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "authors")
public class Authors {
    @Id
    @Column(name = "Id")
    private String id;
    @Column(name = "AuthorId")
    private String authorId;
    @Column(name = "AuthorName")
    private String AuthorName;

}