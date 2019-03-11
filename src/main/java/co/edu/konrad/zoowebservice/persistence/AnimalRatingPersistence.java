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
 * Configuracion de la persistencia AnimalRating
 * @Author Jhosep García
 */ 
@Stateless
public class AnimalRatingPersistence {

    /*
	*Manejador de la Entidad
     */
    @PersistenceContext(unitName = "zoowebservicePU")
    protected EntityManager em;

    /*    
    Busqueda en la entidad
     */
    public List<AnimalRatingEntity> findAll() {
        Query todos = em.createQuery("select P from AppointmentEntity P ");
        return todos.getResultList();
    }

    /*
    Busqueda por ID
     */
    public AnimalRatingEntity findId(Long id) {
        return em.find(AnimalRatingEntity.class, id);
    }

    /*
    Inserción de registros

     */
    public AnimalRatingEntity insertRegistry(AnimalRatingEntity entity) {
        em.persist(entity);
        return entity;
    }

    /*
    Actualización de datos de la entidad
     */
    public AnimalRatingEntity updateRegistry(AnimalRatingEntity entity) {
        return em.merge(entity);
    }

    /*   
     Remover datos de la entidad
     */
    public void deleteRegistry(Long id) {

        AnimalRatingEntity deleteAnimalR = em.find(AnimalRatingEntity.class, id);
        em.remove(deleteAnimalR);
    }
}
