/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.DTO;

import co.edu.konrad.zoowebservice.entities.AnimalEntity;
import co.edu.konrad.zoowebservice.entities.ShowEntity;
import co.edu.konrad.zoowebservice.entities.SpecieEntity;
import co.edu.konrad.zoowebservice.entities.WorkerEntity;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public class AnimalDTO implements Serializable {

    /**
     * Atributo identificador del animal
     */
    private long idAnimal;
    /**
     * Atributo nombre del animal
     */
    private String nameAnimal;
    /**
     * Atributo nombre cientifico del animal
     */
    private String scientificNameAnimal;
    /**
     * Atributo edad del animal
     */
    private int ageAnimal;
    /**
     * Atributo description del animal
     */
    private String descriptionAnimal;
    /**
     * Atributo especie del animal del animal
     */
    private SpecieEntity specieAnimal;
    /**
     * Atributo cuidador del animal
     */
    private WorkerEntity caretaker;
    /**
     * Atributo hora de almuerzo del animal
     */
    private String lunchTimeAnimal;
    /**
     * Atributo lista de animales
     */
    private List<ShowEntity> animalShowList;

    public AnimalDTO() {
    }

    public AnimalDTO(AnimalEntity animalEntity) {
        this.idAnimal = animalEntity.getIdAnimal();
        this.nameAnimal = animalEntity.getNameAnimal();
        this.scientificNameAnimal = animalEntity.getScientificNameAnimal();
        this.ageAnimal = animalEntity.getAgeAnimal();
        this.descriptionAnimal = animalEntity.getDescriptionAnimal();
        this.specieAnimal = animalEntity.getScientificNameAnimal();
        this.caretaker = animalEntity.getCaretaker();
        this.lunchTimeAnimal = animalEntity.getLunchTimeAnimal();
        this.animalShowList = animalEntity.getAnimalShowList();
    }
    
    public AnimalEntity toEntity(){
        AnimalEntity animalEntity = new AnimalEntity();
        animalEntity.setIdAnimal(idAnimal);
        animalEntity.setNameAnimal(nameAnimal);
        animalEntity.setScientificNameAnimal(scientificNameAnimal);
        animalEntity.setAgeAnimal(ageAnimal);
        animalEntity.setDescriptionAnimal(descriptionAnimal);
        animalEntity.setCaretaker(caretaker);
        animalEntity.setLunchTimeAnimal(lunchTimeAnimal);
        animalEntity.setAnimalShowList(animalShowList);
        return animalEntity;
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

    public WorkerEntity getCaretaker() {
        return caretaker;
    }

    public void setCaretaker(WorkerEntity caretaker) {
        this.caretaker = caretaker;
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
