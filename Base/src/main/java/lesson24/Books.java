package lesson24;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "books")
public class Books {
    @Id
    @Column(name = "Id")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AuthorID")
    private Authors Author;

    @Column(name = "BookName", nullable = false)
    private String bookName;

    @Column(name = "LinkBook")
    private String linkBook;

    @Column(name = "PageCount")
    private String pageCount;

}

