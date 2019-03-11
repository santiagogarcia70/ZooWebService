package co.edu.konrad.zoowebservice.persistence;

import co.edu.konrad.zoowebservice.entities.AnimalEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro
 */
@Stateless
public class AnimalPersistence {
    
    @PersistenceContext (unitName = "marketplacePU")
    protected EntityManager em;
    
    /**
     * Metodo que retorna todos los elementos de la tabla animal
     * @return List<AnimalEntity>
     */
    public List<AnimalEntity> findAll(){
        Query all = em.createQuery("select p from AnimalEntity p");
        return all.getResultList();
    }
    /**
     * Metodo que permite traer un objeto de la tabla animal
     * @param id
     * @return ProductEntity
     */
    public AnimalEntity findById(long id){
        return em.find(AnimalEntity.class, id);
    }
    /**
     * Metodo que permite insertar un objeto a la tabla animal
     * @param entity
     * @return AnimalEntity
     */
    public AnimalEntity insert(AnimalEntity entity){
        em.persist(entity);
        return entity;
    }
    /**
     * Metodo que actualiza informacion en la tabla animal
     * @param entity
     * @return AnimalEntity
     */
    public AnimalEntity update(AnimalEntity entity){
        return em.merge(entity);
    }
    /**
     * Metodo que elimina un registro
     * @param id
     * @return AnimalEntity
     */
    public AnimalEntity delete(long id){
        AnimalEntity temp = em.find(AnimalEntity.class, id);
        em.remove(temp);
        return temp;
    }
}
