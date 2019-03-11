/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.persistence;

import co.edu.konrad.zoowebservice.entities.AnimalRatingEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Configuration of Animal Rating persistence By: Jhosep García
 */
@Stateless
public class AnimalRatingPersistence {

    /*
	*Driver from the entity
     */
    @PersistenceContext(unitName = "zoowebservicePU")
    protected EntityManager em;

    /*    
    Search entity
     */
    public List<AnimalRatingEntity> findAll() {
        Query todos = em.createQuery("select P from AppointmentEntity P ");
        return todos.getResultList();
    }

    /*
    Find By ID
     */
    public AnimalRatingEntity findId(Long id) {
        return em.find(AnimalRatingEntity.class, id);
    }

    /*
    insertion of records

     */
    public AnimalRatingEntity insertRegistry(AnimalRatingEntity entity) {
        em.persist(entity);
        return entity;
    }

    /*
    Update of an entity's data
     */
    public AnimalRatingEntity updateRegistry(AnimalRatingEntity entity) {
        return em.merge(entity);
    }

    /*   
     Removal of data from an entity
     */
    public void deleteRegistry(Long id) {

        AnimalRatingEntity deleteAnimalR = em.find(AnimalRatingEntity.class, id);
        em.remove(deleteAnimalR);
    }
}
