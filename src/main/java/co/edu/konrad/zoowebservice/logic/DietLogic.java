/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.logic;

import co.edu.konrad.zoowebservice.entities.DietEntity;
import co.edu.konrad.zoowebservice.persistence.DietPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Clase para modelar la logica de negocio de Diet
 * @author valeria
 */
@Stateless
public class DietLogic {
    
    @Inject
    private DietPersistence persistence;
    
    /**
     * Obtener todos las Dieta
     * @return lista de Dietas
     */
    public List<DietEntity> obtainAll(){
        List<DietEntity> todos = persistence.findAll();
        return todos;
    }
    
    /**
     * Obtener Dieta por id
     * @param id
     * @return Diet
     */
    public DietEntity obtainById(long id){
        DietEntity busqueda = persistence.findById(id);
        if (busqueda == null) {
            throw new IllegalArgumentException("la dieta solicitada no existe");
        }
        return busqueda;
    }
    
    /**
     * Crear Diet
     * @param prod
     * @return Diet creado
     */
    public DietEntity createDiet(DietEntity prod){
        persistence.insert(prod);
        return prod;
    }
    
    
    /**
     * Actualizar Diet
     * @param prod
     * @return Diet actualizado
     */
    public DietEntity updateDiet(long id,DietEntity prod){
        DietEntity updated = persistence.update(prod);
        return updated;
    }
    
    public void deleteDiet(long id){
        persistence.delete(id);
    }        
}
