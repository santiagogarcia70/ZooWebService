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
 * @author valeria
 */
@Entity
public class ZooEntity implements Serializable{
    
    /**
     * Llave primaria
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_zoo")
    private long idZoo;
    
    /**
     * Atributo nombre
     */
    @Column(name = "name")
    private String name;

    /**
     * Atributo unico de telefono
     */
    @Column(name = "phone", unique = true)
    private long phone;

    /**
     * Atributo unico de direccion
     */
    @Column(name = "address", unique = true)
    private String address;


    public long getIdZoo() {
        return idZoo;
    }

    public void setIdZoo(long idZoo) {
        this.idZoo = idZoo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
