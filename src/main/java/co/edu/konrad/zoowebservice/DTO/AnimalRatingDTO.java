/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.DTO;

import co.edu.konrad.zoowebservice.entities.AnimalRatingEntity;

/**
 *
 * @author jhosep
 */
public class AnimalRatingDTO {

    /*
    *Llave primaria id
     */
    private long id;
    /*
     *Llave Foranea id_animal
     */
    private long idAnimal;
    /*
    *Atributo user_name 
     */
    private String userName;
    /*
    *Atributo value 
     */
    private long valueAnimalR;

    public AnimalRatingDTO(AnimalRatingEntity animalRating) {
        this.id = animalRating.getId();
        this.idAnimal = animalRating.getId();
        this.userName = animalRating.getUserName();
        this.valueAnimalR = animalRating.getValueAnimalR();
    }

    public AnimalRatingEntity toEntity() {
        AnimalRatingEntity animalRatingEntity = new AnimalRatingEntity();
        animalRatingEntity.setId(this.id);
        animalRatingEntity.setIdAnimal(this.idAnimal);
        animalRatingEntity.setUserName(this.userName);
        animalRatingEntity.setValueAnimalR(this.valueAnimalR);
        return animalRatingEntity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getValueAnimalR() {
        return valueAnimalR;
    }

    public void setValueAnimalR(long valueAnimalR) {
        this.valueAnimalR = valueAnimalR;
    }

}
