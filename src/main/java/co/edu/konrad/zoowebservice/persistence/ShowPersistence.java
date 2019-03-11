/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.persistence;

import co.edu.konrad.zoowebservice.entities.ShowEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Alejandro
 */
@Stateless
public class ShowPersistence {
    
    @PersistenceContext (unitName = "marketplacePU")
    protected EntityManager em;
    
    /**
     * Metodo que retorna todos los elementos de la tabla show
     * @return List<ShowEntity>
     */
    public List<ShowEntity> findAll(){
        Query all = em.createQuery("select p from ShowEntity p");
        return all.getResultList();
    }
    /**
     * Metodo que permite traer un objeto de la tabla show
     * @param id
     * @return ProductEntity
     */
    public ShowEntity findById(long id){
        return em.find(ShowEntity.class, id);
    }
    /**
     * Metodo que permite insertar un objeto a la tabla show
     * @param entity
     * @return ShowEntity
     */
    public ShowEntity insert(ShowEntity entity){
        em.persist(entity);
        return entity;
    }
    /**
     * Metodo que actualiza informacion en la tabla show
     * @param entity
     * @return ShowEntity
     */
    public ShowEntity update(ShowEntity entity){
        return em.merge(entity);
    }
    /**
     * Metodo que elimina un registro
     * @param id 
     * @return ShowEntity
     */
    public ShowEntity delete(long id){
        ShowEntity temp = em.find(ShowEntity.class, id);
        em.remove(temp);
        return temp;
    }
}
