/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Alejandro
 */
@Entity
public class AnimalEntity implements Serializable {

    /**
     * Atributo identificador del animal
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_animal")
    private long idAnimal;
    /**
     * Atributo nombre del animal
     */
    @Column(name = "name_animal")
    private String nameAnimal;
    /**
     * Atributo nombre cientifico del animal
     */
    @Column(name = "scientific_name_animal")
    private String scientificNameAnimal;
    /**
     * Atributo edad del animal
     */
    @Column (name = "age_animal")
    private int ageAnimal;
    /**
     * Atributo description del animal
     */
    @Column (name = "description_animal")
    private String descriptionAnimal;
    /**
     * Atributo especie del animal del animal
     */
    @ManyToOne
    @JoinColumn (name = "id_specie")
    private Specie specieAnimal;
    /**
     * Atributo cuidador del animal
     */
    @ManyToOne
    @JoinColumn (name = "id_caretacker")
    private Worker caretackerAnimal;
    /**
     * Atributo hora de almuerzo del animal
     */
    @Temporal (TemporalType.TIME)
    @Column (name = "lunchtime_animal")
    private String lunchTimeAnimal;
}
