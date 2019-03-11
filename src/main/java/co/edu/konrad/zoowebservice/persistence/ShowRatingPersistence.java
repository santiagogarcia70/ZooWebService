/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.persistence;


import co.edu.konrad.zoowebservice.entities.ShowRatingEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Configuration of Show Rating persistence By: Jhosep García
 */
@Stateless
public class ShowRatingPersistence {

    /*
	*Driver from the entity
     */
    @PersistenceContext(unitName = "zoowebservicePU")
    protected EntityManager em;

    /*    
    Search entity
     */
    public List<ShowRatingEntity> findAll() {
        Query todos = em.createQuery("select P from AppointmentEntity P ");
        return todos.getResultList();
    }

    /*
    Find By ID
     */
    public ShowRatingEntity findId(Long id) {
        return em.find(ShowRatingEntity.class, id);
    }

    /*
    insertion of records

     */
    public ShowRatingEntity insertRegistry(ShowRatingEntity entity) {
        em.persist(entity);
        return entity;
    }

    /*
    Update of an entity's data
     */
    public ShowRatingEntity updateRegistry(ShowRatingEntity entity) {
        return em.merge(entity);
    }

    /*   
     Removal of data from an entity
     */
    public void deleteRegistry(Long id) {

        ShowRatingEntity deleteShowR = em.find(ShowRatingEntity.class, id);
        em.remove(deleteShowR);
    }

}
