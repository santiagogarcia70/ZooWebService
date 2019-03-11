/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.DTO;

import co.edu.konrad.zoowebservice.entities.AnimalEntity;
import co.edu.konrad.zoowebservice.entities.ShowEntity;
import co.edu.konrad.zoowebservice.entities.ShowPlaceEntity;
import co.edu.konrad.zoowebservice.entities.WorkerEntity;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public class ShowDTO {

    /**
     * Atributo identificador del show
     */
    private long idShow;
    /**
     * Atributo fecha y hora del show
     */
    private Date dateShow;
    /**
     * Atributo entrenador encargado del show
     */
    private WorkerEntity trainer;
    /**
     * Atributo lugar del show del show
     */
    private ShowPlaceEntity showPlace;
    /**
     * Atributo nombre del show
     */
    private String nameShow;
    /**
     * Atributo length del show
     */
    private int lengthShow;
    /**
     * Atributo lista de animales del show
     */
    private List<AnimalEntity> animalShowList;

    public ShowDTO(ShowEntity showEntity) {
        this.idShow = showEntity.getIdShow();
        this.dateShow = showEntity.getDateShow();
        this.trainer = showEntity.getTrainer();
        this.showPlace = showEntity.getShowPlace();
        this.nameShow = showEntity.getNameShow();
        this.lengthShow = showEntity.getLengthShow();
        this.animalShowList = showEntity.getAnimalShowList();
    }

    public ShowEntity toEntity() {
        ShowEntity showEntity = new ShowEntity();
        showEntity.setIdShow(idShow);
        showEntity.setDateShow(dateShow);
        showEntity.setTrainer(trainer);
        showEntity.setShowPlace(showPlace);
        showEntity.setNameShow(nameShow);
        showEntity.setLengthShow(lengthShow);
        showEntity.setAnimalShowList(animalShowList);
        return showEntity;
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

    public List<AnimalEntity> getAnimalShowList() {
        return animalShowList;
    }

    public void setAnimalShowList(List<AnimalEntity> animalShowList) {
        this.animalShowList = animalShowList;
    }

}
