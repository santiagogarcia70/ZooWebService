/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.persistence;


import co.edu.konrad.zoowebservice.entities.ZooEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Manejador de la tabla Carrito
 * @author Valeria R.
 */

@Stateless
public class ZooPersistence {
    
    /**
     *  Manejador
     */
    @PersistenceContext(unitName = "zoowebservicePU")
    protected EntityManager em;
    
    /**
     *  Metodo que permite traer todos los elementos de la tabla
     */
    public List<ZooEntity> findAll(){
        Query todos  = em.createQuery("select p from ZooEntity p");
        return todos.getResultList();
    }
    
    /**
     *  Metodo que permite encontrar un elemento por id de la tabla Zoo
     */
    public ZooEntity findById(long id){
        return em.find(ZooEntity.class, id);
    }
    
    /**
     *  Metodo que Inserta datos a la tabla Zoo 
     * @param entity
     * @return ZooEntity
     */
    public ZooEntity insert(ZooEntity entity){
        em.persist(entity);
        return entity;
    }
    
    /**
     *  Metodo que actualiza los datos de un objeto de Zoo
     * @param entity
     * @return ZooEntity actualizado
     */
    public ZooEntity update(ZooEntity entity){
        return em.merge(entity);
    }
    
    /**
     *  Metodo que elimina un registro de Zoo
     * @param id
     */
    public void delete(long id){
        ZooEntity zooDelete = em.find(ZooEntity.class, id);
        em.remove(zooDelete);
    }
}

