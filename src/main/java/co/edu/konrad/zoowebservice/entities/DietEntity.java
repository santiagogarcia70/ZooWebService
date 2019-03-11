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

/**
 *
 * @author valeria
 */
@Entity
public class DietEntity implements Serializable{
    
    /**
     * Llave foranea de especie
     */
    @Id
    @Column(name = "id_specie")
    private long idSpecie;
    
    /**
     * Llave foranea de comida
     */
    @ManyToOne
    @JoinColumn(name = "id_food")
    private long idFood;
    
    /**
     * Atributo cantidad de comida
     */
    @Column(name = "food_quantity")
    private long foodQuantity;


    public long getIdSpecie() {
        return idSpecie;
    }

    public void setIdSpecie(long idSpecie) {
        this.idSpecie = idSpecie;
    }

    public long getIdFood() {
        return idFood;
    }

    public void setIdFood(long idFood) {
        this.idFood = idFood;
    }

    public long getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(long foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    
}

