/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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
    private SpecieEntity specieAnimal;
    /**
     * Atributo cuidador del animal
     */
    @ManyToOne
    @JoinColumn (name = "id_caretacker")
    private WorkerEntity caretackerAnimal;
    /**
     * Atributo hora de almuerzo del animal
     */
    @Temporal (TemporalType.TIME)
    @Column (name = "lunchtime_animal")
    private String lunchTimeAnimal;
    /**
     * Atributo lista de animales
     */
    @ManyToMany
    @JoinColumn(name = "animalshow_list")
    private List<ShowEntity> animalShowList;
    public AnimalEntity() {
    }

    public long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public String getScientificNameAnimal() {
        return scientificNameAnimal;
    }

    public void setScientificNameAnimal(String scientificNameAnimal) {
        this.scientificNameAnimal = scientificNameAnimal;
    }

    public int getAgeAnimal() {
        return ageAnimal;
    }

    public void setAgeAnimal(int ageAnimal) {
        this.ageAnimal = ageAnimal;
    }

    public String getDescriptionAnimal() {
        return descriptionAnimal;
    }

    public void setDescriptionAnimal(String descriptionAnimal) {
        this.descriptionAnimal = descriptionAnimal;
    }

    public SpecieEntity getSpecieAnimal() {
        return specieAnimal;
    }

    public void setSpecieAnimal(SpecieEntity specieAnimal) {
        this.specieAnimal = specieAnimal;
    }

    public WorkerEntity getCaretackerAnimal() {
        return caretackerAnimal;
    }

    public void setCaretackerAnimal(WorkerEntity caretackerAnimal) {
        this.caretackerAnimal = caretackerAnimal;
    }

    public String getLunchTimeAnimal() {
        return lunchTimeAnimal;
    }

    public void setLunchTimeAnimal(String lunchTimeAnimal) {
        this.lunchTimeAnimal = lunchTimeAnimal;
    }

    public List<ShowEntity> getAnimalShowList() {
        return animalShowList;
    }

    public void setAnimalShowList(List<ShowEntity> animalShowList) {
        this.animalShowList = animalShowList;
    }
    
}
