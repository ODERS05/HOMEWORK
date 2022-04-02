package entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "news")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NewsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "news_headline", nullable = false)
    String newsHeadline;

    @Column(name = "news_text", nullable = false)
    String newsText;
    @OneToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    NewsCategoryEntity newsCategory;

    @Column(name = "time_post")
    LocalDateTime localDateTime;

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", newsHeadline='" + newsHeadline + '\'' +
                ", newsText='" + newsText + '\'' +
                ", newsCategory=" + newsCategory +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
