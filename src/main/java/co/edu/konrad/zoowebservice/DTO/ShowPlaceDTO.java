/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.DTO;

import co.edu.konrad.zoowebservice.entities.ShowPlaceEntity;

/**
 *
 * @author jhosep
 */
public class ShowPlaceDTO {

    /*
    *Llave primaria "id"
     */
    private long id;
    /*
    *Atributo name 
     */
    private String name;

    public ShowPlaceDTO(ShowPlaceEntity showPlace) {
        this.id = showPlace.getId();
        this.name = showPlace.getName();
    }

    public ShowPlaceEntity toEntity() {
        ShowPlaceEntity showPlaceEntity = new ShowPlaceEntity();
        showPlaceEntity.setId(this.id);
        showPlaceEntity.setName(this.name);
        return showPlaceEntity;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
