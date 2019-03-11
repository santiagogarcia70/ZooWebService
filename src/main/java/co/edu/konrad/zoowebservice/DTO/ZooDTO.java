/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.DTO;

import co.edu.konrad.zoowebservice.entities.ZooEntity;

/**
 *
 * @author valeria
 */
public class ZooDTO {
    
    /**
     * Llave primaria
     */
    private long idZoo;
    
    /**
     * Atributo nombre
     */
    private String name;

    /**
     * Atributo unico de telefono
     */
    private long phone;

    /**
     * Atributo unico de direccion
     */
    private String address;
    
    
    public ZooDTO(ZooEntity diet) {
        this.idZoo = diet.getIdZoo();
        this.name = diet.getName();
        this.address = diet.getAddress();
        this.phone = diet.getPhone();
    }

    public ZooEntity toEntity(){
        ZooEntity zooEntity = new ZooEntity();
        zooEntity.setIdZoo(this.idZoo);
        zooEntity.setName(this.name);
        zooEntity.setPhone(this.phone);
        zooEntity.setAddress(this.address);
        return zooEntity;
    }

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
