/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.DTO;

import co.edu.konrad.zoowebservice.entities.SpecieEntity;

/**
 *
 * @author valeria
 */
public class SpecieDTO {
    
    /**
     * Llave primaria
     */
    private long idSpecie;
    
    /**
     * Atributo unico de nombre
     */
    private String name;

    public SpecieDTO(SpecieEntity diet) {
        this.idSpecie = diet.getIdSpecie();
        this.name = diet.getName();
    }

    public SpecieEntity toEntity(){
        SpecieEntity specieEntity = new SpecieEntity();
        specieEntity.setIdSpecie(this.idSpecie);
        specieEntity.setName(this.name);
        return specieEntity;
    }
    
    public long getIdSpecie() {
        return idSpecie;
    }

    public void setIdSpecie(long idSpecie) {
        this.idSpecie = idSpecie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
