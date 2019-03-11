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
 * Configuracion de la persistencia Appointment
 * @Author Jhosep García
 */
@Stateless
public class AppointmentPersistence {

    /*
	*Manejador de la Entidad
     */
    @PersistenceContext(unitName = "zoowebservicePU")
    protected EntityManager em;

    /*    
    *Busqueda en la entidad
     */
    public List<AppointmentEntity> findAll() {
        Query todos = em.createQuery("select P from AppointmentEntity P ");
        return todos.getResultList();
    }

    /*
    Busqueda por ID
     */
    public AppointmentEntity findId(Long id) {
        return em.find(AppointmentEntity.class, id);
    }

    /*
    Inserción de registros
     */
    public AppointmentEntity insertRegistry(AppointmentEntity entity) {
        em.persist(entity);
        return entity;
    }

    /*
    Actualización de datos de la entidad
     */
    public AppointmentEntity updateRegistry(AppointmentEntity entity) {
        return em.merge(entity);
    }

    /*   
     Remover datos de la entidad
     */
    public void deleteRegistry(Long id) {

        AppointmentEntity deleteAppointment = em.find(AppointmentEntity.class, id);
        em.remove(deleteAppointment);
    }
}
