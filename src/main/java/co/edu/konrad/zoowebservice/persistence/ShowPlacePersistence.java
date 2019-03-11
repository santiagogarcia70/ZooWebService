/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.persistence;


import co.edu.konrad.zoowebservice.entities.ShowPlaceEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Configuration of show place persistence By: Jhosep García
 */
@Stateless
public class ShowPlacePersistence {

    /*
	*Driver from the entity
     */
    @PersistenceContext(unitName = "zoowebservicePU")
    protected EntityManager em;

    /*    
    Search entity
     */
    public List<ShowPlaceEntity> findAll() {
        Query todos = em.createQuery("select P from AppointmentEntity P ");
        return todos.getResultList();
    }

    /*
    Find By ID
     */
    public ShowPlaceEntity findId(Long id) {
        return em.find(ShowPlaceEntity.class, id);
    }

    /*
    insertion of records

     */
    public ShowPlaceEntity insertRegistry(ShowPlaceEntity entity) {
        em.persist(entity);
        return entity;
    }

    /*
    Update of an entity's data
     */
    public ShowPlaceEntity updateRegistry(ShowPlaceEntity entity) {
        return em.merge(entity);
    }

    /*   
     Removal of data from an entity
     */
    public void deleteRegistry(Long id) {

        ShowPlaceEntity deleteShowPlace = em.find(ShowPlaceEntity.class, id);
        em.remove(deleteShowPlace);
    }

}
