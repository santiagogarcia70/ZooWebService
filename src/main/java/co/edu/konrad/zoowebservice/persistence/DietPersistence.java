/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.persistence;


import co.edu.konrad.zoowebservice.entities.DietEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Manejador de la tabla Diet
 * @author Valeria R.
 */

@Stateless
public class DietPersistence {
    
    /**
     *  Manejador
     */
    @PersistenceContext(unitName = "zoowebservicePU")
    protected EntityManager em;
    
    /**
     *  Metodo que permite traer todos los elementos de la tabla
     */
    public List<DietEntity> findAll(){
        Query all  = em.createQuery("select p from DietEntity p");
        return all.getResultList();
    }
    
    /**
     *  Metodo que permite encontrar un elemento por id de la tabla Diet
     */
    public DietEntity findById(long id){
        return em.find(DietEntity.class, id);
    }
    
    /**
     *  Metodo que Inserta datos a la tabla diet 
     * @param entity
     * @return DietEntity
     */
    public DietEntity insert(DietEntity entity){
        em.persist(entity);
        return entity;
    }
    
    /**
     *  Metodo que actualiza los datos de un objeto de diet
     * @param entity
     * @return DietEntity actualizado
     */
    public DietEntity update(DietEntity entity){
        return em.merge(entity);
    }
    
    /**
     *  Metodo que elimina un registro de diet
     * @param id
     */
    public void delete(long id){
        DietEntity animalListDelete = em.find(DietEntity.class, id);
        em.remove(animalListDelete);
    }
}

