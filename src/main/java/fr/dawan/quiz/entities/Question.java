package fr.dawan.quiz.entities;

import fr.dawan.quiz.enums.Niveau;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)

@Entity
@Table(name = "questions")
public class Question extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Column(nullable = false, length = 350)
    private String intitule;

    @Column(length = 300)
    private String explication;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 15)
    private Niveau niveau;

    @ManyToOne
    private Qcm qcm;

    @OneToMany(mappedBy = "question")
    private Set<Reponse> reponses = new HashSet<>();


}
