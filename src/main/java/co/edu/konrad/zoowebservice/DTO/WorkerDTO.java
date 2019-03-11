/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.DTO;

import co.edu.konrad.zoowebservice.entities.AnimalEntity;
import co.edu.konrad.zoowebservice.entities.Appointment;
import co.edu.konrad.zoowebservice.entities.ShowEntity;
import co.edu.konrad.zoowebservice.entities.IdentificationTypeEntity;
import co.edu.konrad.zoowebservice.entities.WorkerEntity;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Alejandro
 */
public class WorkerDTO implements Serializable {

    /**
     * Atributo identificador del trabajador
     */
    private long idWorker;
    /**
     * Atributo nombre del trabajador
     */
    private String firstName;
    /**
     * Atributo apellido del trabajador
     */
    private String lastName;
    /**
     * Atributo documento de identificacion del trabajador
     */
    private String identificationWorker;
    /**
     * Atributo tipo de documento de identificacion del trabajador
     */
    private IdentificationTypeEntity identificationType;
    /**
     * Atributo telefono del trabajador
     */
    private long phoneWorker;
    /**
     * Atributo fecha de nacimiento
     */
    private Date birthDayWorker;
    /**
     * Atributo cargo del trabajador
     */
    private Appointment appointmentWorker;

    public WorkerDTO(WorkerEntity workerEntity) {
        this.idWorker = workerEntity.getIdWorker();
        this.firstName = workerEntity.getFirstName();
        this.lastName = workerEntity.getLastName();
        this.identificationWorker = workerEntity.getIdentificationWorker();
        this.identificationType = workerEntity.getIdentificationType();
        this.phoneWorker = workerEntity.getPhoneWorker();
        this.birthDayWorker = workerEntity.getBirthDayWorker();
        this.appointmentWorker = workerEntity.getAppointmentWorker();
    }

    public WorkerEntity toEntity() {
        WorkerEntity workerEntity = new WorkerEntity();
        workerEntity.setIdWorker(idWorker);
        workerEntity.setFirstName(firstName);
        workerEntity.setLastName(lastName);
        workerEntity.setIdentificationWorker(identificationWorker);
        workerEntity.setIdentificationType(identificationType);
        workerEntity.setPhoneWorker(phoneWorker);
        workerEntity.setBirthDayWorker(birthDayWorker);
        workerEntity.setAppointmentWorker(appointmentWorker);
        return workerEntity;
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
