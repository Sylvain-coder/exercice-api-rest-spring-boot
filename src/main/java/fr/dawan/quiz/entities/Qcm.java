package fr.dawan.quiz.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)

@Entity
@Table(name = "qcms")
public class Qcm extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Column(nullable = false, length = 100)
    private String nom;

    private String description;

    @Column(nullable = false)
    private LocalDateTime creation = LocalDateTime.now();

    @Column(name = "temps_total")
    private int tempsTotal;

    @ManyToOne
    private Utilisateur utilisateur;

    @ManyToOne
    private Categorie categorie;

    @OneToMany(mappedBy = "qcm", cascade = CascadeType.ALL)
    private Set<Question> questions = new HashSet<>();

}
