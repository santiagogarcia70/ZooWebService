/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.logic;


import co.edu.konrad.zoowebservice.entities.ZooEntity;
import co.edu.konrad.zoowebservice.persistence.ZooPersistence;
import java.util.List;
import javax.inject.Inject;

/**
 * Clase para modelar la logica de negocio de Zoo
 * @author valeria
 */
public class ZooLogic {
    
    @Inject
    private ZooPersistence persistence;
    
    /**
     * Obtener todos las Zoo
     * @return lista de Zoo
     */
    public List<ZooEntity> obtainAll(){
        List<ZooEntity> todos = persistence.findAll();
        return todos;
    }
    
    /**
     * Obtener Zoo por id
     * @param id
     * @return Zoo
     */
    public ZooEntity obtainById(long id){
        ZooEntity busqueda = persistence.findById(id);
        if (busqueda == null) {
            throw new IllegalArgumentException("El Zoo solicitado no existe");
        }
        return busqueda;
    }
    
    /**
     * Crear Zoo
     * @param prod
     * @return Zoo creado
     */
    public ZooEntity createDiet(ZooEntity prod){
        persistence.insert(prod);
        return prod;
    }
    
    
    /**
     * Actualizar Zoo
     * @param prod
     * @return Zoo actualizado
     */
    public ZooEntity updateDiet(long id,ZooEntity prod){
        ZooEntity updated = persistence.update(prod);
        return updated;
    }
    
    public void deleteDiet(long id){
        persistence.delete(id);
    }       
}
