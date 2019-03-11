/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.DTO;

import co.edu.konrad.zoowebservice.entities.AnimalsListEntity;

/**
 * Mapeo objeto relacional de la entidad AnimalsList
 * @author valeria
 */
public class AnimalsListDTO {
        /**
     * Llave primaria/foranea
     */
    private long idZoo;

    /**
     * Llave primaria/foranea
     */
    private long idAnimal;
    
    /**
     * Atributo locacion
     */
    private String location;

    public AnimalsListDTO(AnimalsListEntity aList) {
        this.idZoo = aList.getIdZoo();
        this.idAnimal = aList.getIdAnimal();
        this.location = aList.getLocation();
    }

    public AnimalsListEntity toEntity(){
        AnimalsListEntity aListEntity = new AnimalsListEntity();
        aListEntity.setIdZoo(this.idZoo);
        aListEntity.setIdAnimal(this.idAnimal);
        aListEntity.setLocation(this.location);
        return aListEntity;
    }
    
    
    public long getIdZoo() {
        return idZoo;
    }

    public void setIdZoo(long idZoo) {
        this.idZoo = idZoo;
    }

    public long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    
}
