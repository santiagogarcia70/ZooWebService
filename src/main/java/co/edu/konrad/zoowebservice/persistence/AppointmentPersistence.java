/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.persistence;

import co.edu.konrad.zoowebservice.entities.AppointmentEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Configuration of Appointment persistence By: Jhosep García
 */
@Stateless
public class AppointmentPersistence {

    /*
	*Driver from the entity
     */
    @PersistenceContext(unitName = "zoowebservicePU")
    protected EntityManager em;

    /*    
    Search entity
     */
    public List<AppointmentEntity> findAll() {
        Query todos = em.createQuery("select P from AppointmentEntity P ");
        return todos.getResultList();
    }

    /*
    Find By ID
     */
    public AppointmentEntity findId(Long id) {
        return em.find(AppointmentEntity.class, id);
    }

    /*
    insertion of records

     */
    public AppointmentEntity insertRegistry(AppointmentEntity entity) {
        em.persist(entity);
        return entity;
    }

    /*
    Update of an entity's data
     */
    public AppointmentEntity updateRegistry(AppointmentEntity entity) {
        return em.merge(entity);
    }

    /*   
     Removal of data from an entity
     */
    public void deleteRegistry(Long id) {

        AppointmentEntity deleteAppointment = em.find(AppointmentEntity.class, id);
        em.remove(deleteAppointment);
    }
}
