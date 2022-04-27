package entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "news")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class NewsEntity extends BaseEntity{

    @Column(name = "news_header")
    private String newsHeader;

    @Column(name = "news_text")
    private String newsText;

    @Column(name = "post_time")
    private LocalDateTime postTime;

    @ManyToOne
    @JoinColumn(name = "news_category_id")
    NewsCategoryEntity newsCategory;
}
