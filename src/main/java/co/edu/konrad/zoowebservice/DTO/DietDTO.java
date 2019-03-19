/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.DTO;

import co.edu.konrad.zoowebservice.entities.DietEntity;
import co.edu.konrad.zoowebservice.entities.FoodEntity;

/**
 *
 * @author valeria
 */
public class DietDTO {
     /**
     * llave primaria
     */
    private long idDiet;
       
    /**
     * Llave foranea de especie
     */
    private long idSpecie;
    
    /**
     * Llave foranea de comida
     */
    private FoodEntity idFood;
    
    /**
     * Atributo cantidad de comida
     */
    private long foodQuantity;

     public DietDTO(DietEntity diet) {
        this.idDiet = diet.getIdDiet();
        this.idFood = diet.getIdFood();
        this.idSpecie = diet.getIdSpecie();
        this.foodQuantity = diet.getFoodQuantity();
    }

    public DietEntity toEntity(){
        DietEntity dietEntity = new DietEntity();
        dietEntity.setIdFood(this.idFood);
        dietEntity.setIdSpecie(this.idSpecie);
        dietEntity.setFoodQuantity(this.foodQuantity);
        return dietEntity;
    }
    
    public long getIdSpecie() {
        return idSpecie;
    }

    public void setIdSpecie(long idSpecie) {
        this.idSpecie = idSpecie;
    }

    public FoodEntity getIdFood() {
        return idFood;
    }

    public void setIdFood(FoodEntity idFood) {
        this.idFood = idFood;
    }

    public long getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(long foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    
}
