/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.persistence;


import co.edu.konrad.zoowebservice.entities.IdentificationTypeEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Configuration of Identification type persistence By: Jhosep García
 */
@Stateless
public class IdentificationTypePersistence {
   /*
	*Driver from the entity
     */
    @PersistenceContext(unitName = "zoowebservicePU")
    protected EntityManager em;

    /*    
    Search entity
     */
    public List<IdentificationTypeEntity> findAll() {
        Query todos = em.createQuery("select P from AppointmentEntity P ");
        return todos.getResultList();
    }

    /*
    Find By ID
     */
    public IdentificationTypeEntity findId(Long id) {
        return em.find(IdentificationTypeEntity.class, id);
    }

    /*
    insertion of records

     */
    public IdentificationTypeEntity insertRegistry(IdentificationTypeEntity entity) {
        em.persist(entity);
        return entity;
    }

    /*
    Update of an entity's data
     */
    public IdentificationTypeEntity updateRegistry(IdentificationTypeEntity entity) {
        return em.merge(entity);
    }

    /*   
     Removal of data from an entity
     */
    public void deleteRegistry(Long id) {

        IdentificationTypeEntity deleteIdType = em.find(IdentificationTypeEntity.class, id);
        em.remove(deleteIdType);
    }
}
