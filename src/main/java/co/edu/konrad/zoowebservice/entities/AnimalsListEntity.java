/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.entities;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author valeria
 */
@Entity
public class AnimalsListEntity implements Serializable{
    
    /**
     * Llave primaria/foranea
     */
    @Id
    @OneToOne
    @JoinColumn(name = "id_zoo")
    private long idZoo;

    /**
     * Llave primaria/foranea
     */
    @Id
    @OneToOne
    @JoinColumn(name = "id_animal")
    private long idAnimal;
    
    /**
     * Atributo locacion
     */
    @Column(name = "locatioon")
    private String location;


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

