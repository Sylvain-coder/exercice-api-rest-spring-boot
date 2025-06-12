package fr.dawan.quiz.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.EqualsAndHashCode.Exclude;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Version
    @Exclude
    @Setter(value = AccessLevel.NONE)
    private int version;

}
