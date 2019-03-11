/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.DTO;

import co.edu.konrad.zoowebservice.entities.AppointmentEntity;

/**
 *
 * @author jhosep
 */
public class AppointmentDTO {

    /*
    *Llave primaria "id"
     */
    private long id;
    /*
    *Atributo name 
     */
    private String name;

    public AppointmentDTO(AppointmentEntity appointment) {
        this.id = appointment.getId();
        this.name = appointment.getName();

    }

    public AppointmentEntity toEntity() {
        AppointmentEntity appointmentEntity = new AppointmentEntity();
        appointmentEntity.setId(this.id);
        appointmentEntity.setName(this.name);
        return appointmentEntity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
