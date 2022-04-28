package entity;

import enums.Category;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "news_category")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class NewsCategoryEntity extends BaseEntity{

    @Column(name = "name")
    @Enumerated(value = EnumType.STRING)
    private Category name;
}
