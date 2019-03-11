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
 * Configuracion de la persistencia IdentificationType
 * @Author Jhosep García
 */
@Stateless
public class IdentificationTypePersistence {
   /*
	*Manejador de la Entidad
     */
    @PersistenceContext(unitName = "zoowebservicePU")
    protected EntityManager em;

    /*    
    Busqueda en la entidad
     */
    public List<IdentificationTypeEntity> findAll() {
        Query todos = em.createQuery("select P from AppointmentEntity P ");
        return todos.getResultList();
    }

    /*
    Busqueda por ID
     */
    public IdentificationTypeEntity findId(Long id) {
        return em.find(IdentificationTypeEntity.class, id);
    }

    /*
    Inserción de registros
     */
    public IdentificationTypeEntity insertRegistry(IdentificationTypeEntity entity) {
        em.persist(entity);
        return entity;
    }

    /*
    Actualización de datos de la entidad
    */
    public IdentificationTypeEntity updateRegistry(IdentificationTypeEntity entity) {
        return em.merge(entity);
    }

    /*   
     Remover datos de la entidad
     */
    public void deleteRegistry(Long id) {

        IdentificationTypeEntity deleteIdType = em.find(IdentificationTypeEntity.class, id);
        em.remove(deleteIdType);
    }
}
