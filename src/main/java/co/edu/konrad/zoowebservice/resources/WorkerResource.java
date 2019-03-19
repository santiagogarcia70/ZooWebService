/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.resources;

import co.edu.konrad.zoowebservice.DTO.WorkerDTO;
import co.edu.konrad.zoowebservice.entities.WorkerEntity;
import co.edu.konrad.zoowebservice.logic.WorkerLogic;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Alejandro
 */
@Path("/worker")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class WorkerResource {
    
    @EJB
    private WorkerLogic workerLogic;

    /**
     * Metodo que retorna todos los trabajadores
     * @return ListWorkerDTO
     */
    @GET
    public List<WorkerDTO> getWorkers() {
        List<WorkerEntity> workers = workerLogic.findAll();
        return workerLogic.toWorkerList(workers);
    }

    /**
     * Metodo que retorna un trabajador por el id dado
     *
     * @param id
     * @return WorkerDTO
     */
    @GET
    @Path("{id: \\d+}")
    public WorkerDTO getWorkerById(@PathParam(":id") long id) {
        WorkerEntity worker = workerLogic.findById(id);
        if (worker == null) {
            throw new RuntimeException("El worker solicitado no existe.");
        }
        return new WorkerDTO(worker);
    }

    /**
     * Metodo para crear trabajador
     *
     * @param worker 
     * @return WorkerDTO
     */
    @POST
    public WorkerDTO createWorker(WorkerDTO worker) {
        return new WorkerDTO(workerLogic.createShow(worker.toEntity()));
    }

    /**
     * Metodo para actualizar trabajador
     *
     * @param id
     * @param worker
     * @return WorkerDTO
     */
    @PUT
    @Path("{id: \\d+}")
    public WorkerDTO updateWorker(@PathParam("id") long id, WorkerDTO worker) {
        WorkerEntity workerEntity = workerLogic.findById(id);
        if (workerEntity == null) {
            throw new RuntimeException("El trabajador solicitado no existe");
        }
        return new WorkerDTO(workerLogic.createShow(workerEntity));
    }

    /**
     * Metodo para eliminar trabajador
     *
     * @param id
     */
    @DELETE
    @Path("{id: \\d+}")
    public void deleteWorker(@PathParam("id") long id) {
        WorkerEntity workerEntity = workerLogic.findById(id);
        if (workerEntity == null) {
            throw new RuntimeException("El trabajdor solicitado no existe");
        }
        workerLogic.deleteShow(id);
    }
}
