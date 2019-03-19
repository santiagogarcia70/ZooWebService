/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.persistence;

import co.edu.konrad.zoowebservice.entities.AnimalsListEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Manejador de la tabla AnimalsList
 * @author Valeria R.
 */

@Stateless
public class AnimalsListPersistence {
    
    /**
     *  Manejador
     */
    @PersistenceContext(unitName = "zoowebservicePU")
    protected EntityManager em;
    
    /**
     *  Metodo que permite traer todos los elementos de la tabla
     * @return lista de AnimalsList
     */
    public List<AnimalsListEntity> findAll(){
        Query all  = em.createQuery("select p from AnimalsListEntity p");
        return all.getResultList();
    }
    
    /**
     *  Metodo que permite encontrar un elemento por id de la tabla AnimalsList
     * @param id
     * @return AnimalsList
     */
    public AnimalsListEntity findById(long id){
        return em.find(AnimalsListEntity.class, id);
    }
    
    /**
     *  Metodo que Inserta datos a la tabla AnimalsList 
     * @param entity
     * @return AnimalsListEntity
     */
    public AnimalsListEntity insert(AnimalsListEntity entity){
        em.persist(entity);
        return entity;
    }
    
    /**
     *  Metodo que actualiza los datos de un objeto de AnimalsList
     * @param entity
     * @return AnimalsListEntity actualizado
     */
    public AnimalsListEntity update(AnimalsListEntity entity){
        return em.merge(entity);
    }
    
    /**
     *  Metodo que elimina un registro de AnimalsList
     * @param id
     */
    public void delete(long id){
        AnimalsListEntity animalListDelete = em.find(AnimalsListEntity.class, id);
        em.remove(animalListDelete);
    }
}

