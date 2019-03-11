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
 * Configuracion de la persistencia ShowRating
 * @Author Jhosep García
 */
@Stateless
public class ShowRatingPersistence {

    /*
	*Manejador de la Entidad
     */
    @PersistenceContext(unitName = "zoowebservicePU")
    protected EntityManager em;

    /*    
    Busqueda en la entidad
     */
    public List<ShowRatingEntity> findAll() {
        Query todos = em.createQuery("select P from AppointmentEntity P ");
        return todos.getResultList();
    }

    /*
    Busqueda por ID
     */
    public ShowRatingEntity findId(Long id) {
        return em.find(ShowRatingEntity.class, id);
    }

    /*
    Inserción de registros

     */
    public ShowRatingEntity insertRegistry(ShowRatingEntity entity) {
        em.persist(entity);
        return entity;
    }

    /*
    Actualización de datos de la entidad
     */
    public ShowRatingEntity updateRegistry(ShowRatingEntity entity) {
        return em.merge(entity);
    }

    /*   
     Remover datos de la entidad
     */
    public void deleteRegistry(Long id) {

        ShowRatingEntity deleteShowR = em.find(ShowRatingEntity.class, id);
        em.remove(deleteShowR);
    }

}
