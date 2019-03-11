/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.persistence;

import co.edu.konrad.zoowebservice.entities.WorkerEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Alejandro
 */
public class WorkerPersistence {
    
    @PersistenceContext (unitName = "marketplacePU")
    protected EntityManager em;
    
    /**
     * Metodo que retorna todos los elementos de la tabla trabajador
     * @return List<WorkerEntity>
     */
    public List<WorkerEntity> findAll(){
        Query all = em.createQuery("select p from WorkerEntity p");
        return all.getResultList();
    }
    /**
     * Metodo que permite traer un objeto de la tabla trabajador
     * @param id
     * @return WorkerEntity
     */
    public WorkerEntity findById(long id){
        return em.find(WorkerEntity.class, id);
    }
    /**
     * Metodo que permite insertar un objeto a la tabla trabajador
     * @param entity
     * @return WorkerEntity
     */
    public WorkerEntity insert(WorkerEntity entity){
        em.persist(entity);
        return entity;
    }
    /**
     * Metodo que actualiza informacion en la tabla trabajador
     * @param entity
     * @return WorkerEntity
     */
    public WorkerEntity update(WorkerEntity entity){
        return em.merge(entity);
    }
    /**
     * Metodo que elimina un registro de la tabla trabajador
     * @param id 
     * @return WorkerEntity
     */
    public WorkerEntity delete(long id){
        WorkerEntity temp = em.find(WorkerEntity.class, id);
        em.remove(temp);
        return temp;
    }
}
