/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.logic;

import co.edu.konrad.zoowebservice.entities.AnimalsListEntity;
import co.edu.konrad.zoowebservice.persistence.AnimalsListPersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author valeria
 */
@Stateless
public class AnimalsListLogic {
    
    @Inject
    private AnimalsListPersistence persistence;
    
    /**
     * Obtener todos los AnimalsList
     * @return lista de AnimalsList
     */
    public List<AnimalsListEntity> obtainAll(){
        List<AnimalsListEntity> todos = persistence.findAll();
        return todos;
    }
    
    /**
     * Obtener AnimalsList por id
     * @param id
     * @return AnimalsList
     */
    public AnimalsListEntity obtainById(long id){
        AnimalsListEntity busqueda = persistence.findById(id);
        if (busqueda == null) {
            throw new IllegalArgumentException("la lista de animales solicitada no existe");
        }
        return busqueda;
    }
    
    /**
     * Crear AnimalsList
     * @param prod
     * @return AnimalsList creado
     */
    public AnimalsListEntity createAnimalsList(AnimalsListEntity prod){
        persistence.insert(prod);
        return prod;
    }
    
    
    /**
     * Actualizar AnimalsList
     * @param prod
     * @return AnimalsList actualizado
     */
    public AnimalsListEntity updateAnimalsList(long id,AnimalsListEntity prod){
        AnimalsListEntity updated = persistence.update(prod);
        return updated;
    }
    
    public void deleteAnimalsList(long id){
        persistence.delete(id);
    }    
}
