/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.logic;

import co.edu.konrad.zoowebservice.DTO.WorkerDTO;
import co.edu.konrad.zoowebservice.entities.WorkerEntity;
import co.edu.konrad.zoowebservice.persistence.WorkerPersistence;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Alejandro
 */
@Stateless
public class WorkerLogic {

    @Inject
    private WorkerPersistence workerPersistence;

    /**
     * Metodo que retorna todos los trabajadores.
     *
     * @return ListWorkerEntity
     */
    public List<WorkerEntity> findAll() {
        return workerPersistence.findAll();
    }

    /**
     * Metodo que retorna un trabajador por un id dado
     *
     * @param id
     * @return WorkerEntity
     */
    public WorkerEntity findById(long id) {
        WorkerEntity worker = workerPersistence.findById(id);
        if (worker == null) {
            throw new IllegalArgumentException("No existe un trabajador registrado con el identificador " + id);
        }
        return worker;
    }

    /**
     * Metodo para crear un trabajador
     *
     * @param worker
     * @return WorkerEntity
     */
    public WorkerEntity createShow(WorkerEntity worker) {
        return workerPersistence.insert(worker);
    }

    /**
     * Metodo para modificar un trabajador
     *
     * @param worker
     * @return WorkerEntity
     */
    public WorkerEntity updateShow(WorkerEntity worker) {
        return workerPersistence.update(worker);
    }

    /**
     * Metodo para eliminar un trabajador
     *
     * @param id
     * @return WorkerEntity
     */
    public WorkerEntity deleteShow(long id) {
        return workerPersistence.delete(id);
    }
    /**
     * Metodo para convertir lista de WorkerEntity a WorkerDTO
     * @param workers 
     * @return workersDTO
     */
    public List<WorkerDTO> toWorkerList(List<WorkerEntity> workers){
        List<WorkerDTO> workersDTO = new ArrayList<>();
        for(WorkerEntity worker: workers){
            workersDTO.add(new WorkerDTO(worker));
        }
        return workersDTO;
    }
}
