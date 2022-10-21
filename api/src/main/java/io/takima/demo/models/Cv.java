package io.takima.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cvs")
public class Cv implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String prenom;
    @Column
    private String nom;
    @Column
    private String dateNaissance;
    @Column
    private String email;
    @Column
    private String telephone;
    @Column
    private String adresse;
    @Column
    private String description;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Experience> experiences = new ArrayList<>();

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Education> educations = new ArrayList<>();

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Hobby> hobbies = new ArrayList<>();

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Project> projets = new ArrayList<>();

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<ReseauSociaux> reseauxSx = new ArrayList<>();
/*    @Column
    private String education;
    @Column
    private String  competences;
    @Column
    private String hobbies;
    @Column
    private String projets;

    @Column
    private String reseauxSociaux;*/




}
