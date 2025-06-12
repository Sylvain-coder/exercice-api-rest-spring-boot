package fr.dawan.quiz.entities;

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
@Table(name = "categories")
public class Categorie extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Column(length = 80)
    private String nom;

    private String description;

    @ManyToOne
    private Categorie parent;

    @OneToMany(mappedBy = "categorie")
    private Set<Qcm> quizs = new HashSet<>();


}
