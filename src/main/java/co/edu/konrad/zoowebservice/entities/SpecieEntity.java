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

/**
 *
 * @author valeria
 */
@Entity
public class SpecieEntity implements Serializable{
    
    /**
     * Llave primaria
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_specie")
    private long idSpecie;
    
    /**
     * Atributo unico de nombre
     */
    @Column(name = "name", unique=true)
    private String name;


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

