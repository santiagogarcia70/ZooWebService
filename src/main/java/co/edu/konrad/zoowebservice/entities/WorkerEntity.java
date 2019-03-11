/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Alejandro
 */
@Entity
public class WorkerEntity implements Serializable{
    /**
     * Atributo identificador del trabajador
     */
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (name = "id")
    private long idWorker;
    /**
     * Atributo nombre del trabajador
     */
    @Column (name = "firstname")
    private String firstName;
    /**
     * Atributo apellido del trabajador
     */
    @Column (name = "lastname")
    private String lastName;
    /**
     * Atributo documento de identificacion del trabajador
     */
    @Column (name = "infentification", unique = true)
    private String identificationWorker;
    /**
     * Atributo tipo de documento de identificacion del trabajador
     */
    @ManyToOne
    @JoinColumn (name = "identification_type")
    private IdentificationTypeEntity identificationType;
    /**
     * Atributo telefono del trabajador
     */
    @Column (name = "phone", unique = true)
    private long phoneWorker;
    /**
     * Atributo fecha de nacimiento
     */
    @Temporal (TemporalType.DATE)
    @Column (name = "birthday")
    private Date birthDayWorker;
    /**
     * Atributo cargo del trabajador
     */
    @ManyToOne
    @JoinColumn (name = "appointment")
    private Appointment appointmentWorker;

    public WorkerEntity() {
    }

    public long getIdWorker() {
        return idWorker;
    }

    public void setIdWorker(long idWorker) {
        this.idWorker = idWorker;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentificationWorker() {
        return identificationWorker;
    }

    public void setIdentificationWorker(String identificationWorker) {
        this.identificationWorker = identificationWorker;
    }

    public IdentificationTypeEntity getIdentificationType() {
        return identificationType;
    }

    public void setIdentificationType(IdentificationTypeEntity identificationType) {
        this.identificationType = identificationType;
    }

    public long getPhoneWorker() {
        return phoneWorker;
    }

    public void setPhoneWorker(long phoneWorker) {
        this.phoneWorker = phoneWorker;
    }

    public Date getBirthDayWorker() {
        return birthDayWorker;
    }

    public void setBirthDayWorker(Date birthDayWorker) {
        this.birthDayWorker = birthDayWorker;
    }
    
    public Appointment getAppointmentWorker() {
        return appointmentWorker;
    }

    public void setAppointmentWorker(Appointment appointmentWorker) {
        this.appointmentWorker = appointmentWorker;
    }
}
