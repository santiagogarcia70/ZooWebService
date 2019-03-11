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

/**
 * Configuracion de la entidad Animal Rating
 * @Author Jhosep García
 */
@Entity
public class AnimalRatingEntity implements Serializable {

    /*
    *Llave primaria id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    /*
     *Llave Foranea id_animal
     */
    @ManyToOne
    @JoinColumn(name = "id_animal")
    private long idAnimal;
    /*
    *Atributo user_name 
     */
    @Column(name = "user_name", unique = true)
    private String userName;
    /*
    *Atributo value 
     */
    @Column(name = "value_animalr")
    private long valueAnimalR;

    public AnimalRatingEntity() {
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
