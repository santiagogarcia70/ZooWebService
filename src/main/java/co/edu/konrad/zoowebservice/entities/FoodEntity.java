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
public class FoodEntity implements Serializable{
    /**
     * llave primaria
     */
        @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_food")
    private long idFood;
    
    /**
     * Atributo  nombre
     */
    @Column(name = "name")
    private String name;
    
    /**
     * Atributo descripcion
     */
    @Column(name = "description")
    private String description;


    public long getIdFood() {
        return idFood;
    }

    public void setIdFood(long idFood) {
        this.idFood = idFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
}

