package entity;

import enums.Category;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "category")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NewsCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "name", nullable = false, unique = true)
    Category name;

    @Override
    public String toString() {
        return "NewsCategoryEntity{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
