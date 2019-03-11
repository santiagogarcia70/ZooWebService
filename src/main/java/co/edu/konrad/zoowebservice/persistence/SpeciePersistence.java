/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.persistence;

import co.edu.konrad.zoowebservice.entities.SpecieEntity;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * Manejador de la tabla Specie
 * @author Valeria R.
 */

@Stateless
public class SpeciePersistence {
    
    /**
     *  Manejador
     */
    @PersistenceContext(unitName = "zoowebservicePU")
    protected EntityManager em;
    
    /**
     *  Metodo que permite traer todos los elementos de la tabla
     */
    public List<SpecieEntity> findAll(){
        Query all  = em.createQuery("select p from SpecieEntity p");
        return all.getResultList();
    }
    
    /**
     *  Metodo que permite encontrar un elemento por id de la tabla Specie
     */
    public SpecieEntity findById(long id){
        return em.find(SpecieEntity.class, id);
    }
    
    /**
     *  Metodo que Inserta datos a la tabla specie 
     * @param entity
     * @return SpecieEntity
     */
    public SpecieEntity insert(SpecieEntity entity){
        em.persist(entity);
        return entity;
    }
    
    /**
     *  Metodo que actualiza los datos de un objeto de specie
     * @param entity
     * @return SpecieEntity actualizado
     */
    public SpecieEntity update(SpecieEntity entity){
        return em.merge(entity);
    }
    
    /**
     *  Metodo que elimina un registro de specie
     * @param id
     */
    public void delete(long id){
        SpecieEntity specieDelete = em.find(SpecieEntity.class, id);
        em.remove(specieDelete);
    }
}

