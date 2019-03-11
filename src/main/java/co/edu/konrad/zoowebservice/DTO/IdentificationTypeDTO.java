/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.DTO;

import co.edu.konrad.zoowebservice.entities.IdentificationTypeEntity;

/**
 *
 * @author jhosep
 */
public class IdentificationTypeDTO {

    /*
    *Primary Key "id"
     */
    private long id;
    /*
    *Attribute name 
     */
    private String name;

    public IdentificationTypeDTO(IdentificationTypeEntity identificationType) {
        this.id = identificationType.getId();
        this.name = identificationType.getName();
    }

    public IdentificationTypeEntity toEntity() {
        IdentificationTypeEntity identificationTypeEntity = new IdentificationTypeEntity();
        identificationTypeEntity.setId(this.id);
        identificationTypeEntity.setName(this.name);
        return identificationTypeEntity;

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
