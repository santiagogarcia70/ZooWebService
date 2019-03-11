/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Alejandro
 */
@Entity
public class WorkerEntity implements Serializable{
    /**
     * Atributo identificado del trabajador
     */
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id_worker")
    private long idWorker;
    /**
     * Atributo nombre del trabajador
     */
    @Column (name = "firstname_worker")
    private String firstName;
    /**
     * Atributo identificado del trabajador
     */
    @Column (name = "lastname_worker")
    private String lastName;
}
