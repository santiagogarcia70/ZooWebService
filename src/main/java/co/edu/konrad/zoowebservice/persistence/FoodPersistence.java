/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.persistence;


import co.edu.konrad.zoowebservice.entities.FoodEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Manejador de la tabla Food
 * @author Valeria R.
 */

@Stateless
public class FoodPersistence {
    
    /**
     *  Manejador
     */
    @PersistenceContext(unitName = "zoowebservicePU")
    protected EntityManager em;
    
    /**
     *  Metodo que permite traer todos los elementos de la tabla
     */
    public List<FoodEntity> findAll(){
        Query all  = em.createQuery("select p from FoodEntity p");
        return all.getResultList();
    }
    
    /**
     *  Metodo que permite encontrar un elemento por id de la tabla food
     */
    public FoodEntity findById(long id){
        return em.find(FoodEntity.class, id);
    }
    
    /**
     *  Metodo que Inserta datos a la tabla food 
     * @param entity
     * @return FoodEntity
     */
    public FoodEntity insert(FoodEntity entity){
        em.persist(entity);
        return entity;
    }
    
    /**
     *  Metodo que actualiza los datos de un objeto de food
     * @param entity
     * @return FoodEntity actualizado
     */
    public FoodEntity update(FoodEntity entity){
        return em.merge(entity);
    }
    
    /**
     *  Metodo que elimina un registro de food
     * @param id
     */
    public void delete(long id){
        FoodEntity foodDelete = em.find(FoodEntity.class, id);
        em.remove(foodDelete);
    }
}

