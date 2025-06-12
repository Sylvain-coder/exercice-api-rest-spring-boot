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
@Table(name = "utilisateurs")
public class Utilisateur extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Column(nullable = false, length = 60)
    private String prenom;

    @Column(nullable = false, length = 60)
    private String nom;

    @Column(unique = true, nullable = false)
    private String email;

    @OneToMany(mappedBy = "utilisateur")
    private Set<Qcm> qcms = new HashSet<>();

}