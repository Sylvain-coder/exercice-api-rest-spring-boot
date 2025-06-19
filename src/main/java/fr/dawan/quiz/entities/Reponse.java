package fr.dawan.quiz.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)

@Entity
@Table(name = "reponses")
public class Reponse extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Column(nullable = false)
    private String texte;

    @Column(nullable = false)
    private boolean correct;

    @ManyToOne
    private Question question;

}
