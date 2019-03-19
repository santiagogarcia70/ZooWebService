/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.logic;

import co.edu.konrad.zoowebservice.entities.SpecieEntity;
import co.edu.konrad.zoowebservice.persistence.SpeciePersistence;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Clase para modelar la logica de negocio de Specie
 * @author valeria
 */
@Stateless
public class SpecieLogic {
    
    @Inject
    private SpeciePersistence persistence;
    
    /**
     * Obtener todos las especies
     * @return lista de especies
     */
    public List<SpecieEntity> obtainAll(){
        List<SpecieEntity> todos = persistence.findAll();
        return todos;
    }
    
    /**
     * Obtener especie por id
     * @param id
     * @return Specie
     */
    public SpecieEntity obtainById(long id){
        SpecieEntity busqueda = persistence.findById(id);
        if (busqueda == null) {
            throw new IllegalArgumentException("la especie solicitada no existe");
        }
        return busqueda;
    }
    
    /**
     * Crear Specie
     * @param prod
     * @return Specie creado
     */
    public SpecieEntity createSpecie(SpecieEntity prod){
        persistence.insert(prod);
        return prod;
    }
    
    
    /**
     * Actualizar especie
     * @param prod
     * @return especie actualizado
     */
    public SpecieEntity updateDiet(long id,SpecieEntity prod){
        SpecieEntity updated = persistence.update(prod);
        return updated;
    }
    
    public void deleteDiet(long id){
        persistence.delete(id);
    }            
}
