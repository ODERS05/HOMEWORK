package entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

//    @Column(name = "create_time", nullable = false)
//    @CreationTimestamp
//    LocalDateTime createTime;
//
//    @Column(name = "update_time")
//    LocalDateTime updateTime;
//
//    @PreUpdate
//    public void preUpdate() {
//        this.updateTime = LocalDateTime.now();
//    }
}