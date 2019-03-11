/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.entities;

import java.io.Serializable;
import java.util.Date;
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
public class ShowEntity implements Serializable{
    /**
     * Atributo identificador del show
     */
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id_show")
    private long idShow;
    /**
     * Atributo fecha y hora del show
     */
    @Temporal (TemporalType.TIMESTAMP)
    private Date dateShow;
    /**
     * Atributo entrenador encargado del show
     */
    @ManyToOne
    @JoinColumn (name = "trainer")
    private WorkerEntity trainer;
    /**
     * Atributo lugar del show del show
     */
    @ManyToOne
    @JoinColumn (name = "showplace")
    private ShowPlaceEntity showPlace;
    /**
     * Atributo nombre del show
     */
    @Column (name = "name_show")
    private String nameShow;
    /**
     * Atributo length del show
     */
    @Column (name = "length_show")
    private int lengthShow;
    /**
     * Atributo lista de animales del show
     */
    @ManyToMany
    @JoinColumn (name = "animalshow_list")
    private List<AnimalEntity> animalList;
    
    public ShowEntity() {
    }

    public long getIdShow() {
        return idShow;
    }

    public void setIdShow(long idShow) {
        this.idShow = idShow;
    }

    public Date getDateShow() {
        return dateShow;
    }

    public void setDateShow(Date dateShow) {
        this.dateShow = dateShow;
    }

    public WorkerEntity getTrainer() {
        return trainer;
    }

    public void setTrainer(WorkerEntity trainer) {
        this.trainer = trainer;
    }

    public ShowPlaceEntity getShowPlace() {
        return showPlace;
    }

    public void setShowPlace(ShowPlaceEntity showPlace) {
        this.showPlace = showPlace;
    }

    public String getNameShow() {
        return nameShow;
    }

    public void setNameShow(String nameShow) {
        this.nameShow = nameShow;
    }

    public int getLengthShow() {
        return lengthShow;
    }

    public void setLengthShow(int lengthShow) {
        this.lengthShow = lengthShow;
    }

    public List<AnimalEntity> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<AnimalEntity> animalList) {
        this.animalList = animalList;
    }
    
}
