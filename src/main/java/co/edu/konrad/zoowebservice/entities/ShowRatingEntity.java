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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *Configuracion de la entidad Show Rating
 *@Author Jhosep García
 */
@Entity
public class ShowRatingEntity implements Serializable {

    /*
    *Llave primaria id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    /*
     *Llave Foranea id_show
     */
    @ManyToOne
    @JoinColumn(name = "id_show")
    private long idShow;

    /*
    *Atributo user_name 
     */
    @Column(name = "user_name", unique = true)
    private String userName;
    /*
    *Atributo value 
     */
    @Column(name = "value_showr")
    private long valueShowR;

    public ShowRatingEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdShow() {
        return idShow;
    }

    public void setIdShow(long idShow) {
        this.idShow = idShow;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getValueShowR() {
        return valueShowR;
    }

    public void setValueShowR(long valueShowR) {
        this.valueShowR = valueShowR;
    }

}
