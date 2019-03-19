/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.logic;

import co.edu.konrad.zoowebservice.entities.FoodEntity;
import co.edu.konrad.zoowebservice.persistence.FoodPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Clase para modelar la logica de negocio de Food
 * @author valeria
 */
@Stateless
public class FoodLogic {
    
    @Inject
    private FoodPersistence persistence;
    
    /**
     * Obtener todos los Foods
     * @return lista de Foods
     */
    public List<FoodEntity> obtainAll(){
        List<FoodEntity> todos = persistence.findAll();
        return todos;
    }
    
    /**
     * Obtener Food por id
     * @param id
     * @return Food
     */
    public FoodEntity obtainById(long id){
        FoodEntity busqueda = persistence.findById(id);
        if (busqueda == null) {
            throw new IllegalArgumentException("la comida solicitada no existe");
        }
        return busqueda;
    }
    
    /**
     * Crear Food
     * @param prod
     * @return Food creado
     */
    public FoodEntity createDiet(FoodEntity prod){
        persistence.insert(prod);
        return prod;
    }
    
    
    /**
     * Actualizar Food
     * @param prod
     * @return Food actualizado
     */
    public FoodEntity updateDiet(long id,FoodEntity prod){
        FoodEntity updated = persistence.update(prod);
        return updated;
    }
    
    public void deleteDiet(long id){
        persistence.delete(id);
    }        
}
