/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.DTO;

import co.edu.konrad.zoowebservice.entities.FoodEntity;

/**
 *
 * @author valeria
 */
public class FoodDTO {
    /**
     * llave primaria
     */
    private long idFood;
    
    /**
     * Atributo  nombre
     */
    private String name;
    
    /**
     * Atributo descripcion
     */
    private String description;

    public FoodDTO(FoodEntity food) {
        this.idFood = food.getIdFood();
        this.name = food.getName();
        this.description = food.getDescription();
    }

    public FoodEntity toEntity(){
        FoodEntity foodEntity = new FoodEntity();
        foodEntity.setIdFood(this.idFood);
        foodEntity.setName(this.name);
        foodEntity.setDescription(this.description);
        return foodEntity;
    }
    
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
