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
    @Column (name = "id_worker")
    private long idWorker;
    /**
     * Atributo nombre del trabajador
     */
    @Column (name = "firstname_worker")
    private String firstName;
    /**
     * Atributo apellido del trabajador
     */
    @Column (name = "lastname_worker")
    private String lastName;
    /**
     * Atributo documento de identificacion del trabajador
     */
    @Column (name = "infentification_worker")
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
    @Column (name = "phone_worker")
    private long phoneWorker;
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

    public Appointment getAppointmentWorker() {
        return appointmentWorker;
    }

    public void setAppointmentWorker(Appointment appointmentWorker) {
        this.appointmentWorker = appointmentWorker;
    }
}
