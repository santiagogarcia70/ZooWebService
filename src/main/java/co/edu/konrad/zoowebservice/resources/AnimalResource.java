/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.resources;

import co.edu.konrad.zoowebservice.DTO.AnimalDTO;
import co.edu.konrad.zoowebservice.entities.AnimalEntity;
import co.edu.konrad.zoowebservice.logic.AnimalLogic;
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
@Path("/animal")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AnimalResource {

    @EJB
    private AnimalLogic animalLogic;

    /**
     * Metodo que retorna todos los animales
     *
     * @return
     */
    @GET
    public List<AnimalDTO> getAnimals() {
        List<AnimalEntity> animals = animalLogic.findAll();
        return animalLogic.toAnimalList(animals);
    }

    /**
     * Metodo que retorna un animal por el id dado
     *
     * @param id
     * @return
     */
    @GET
    @Path("{id: \\d+}")
    public AnimalDTO getAnimalById(@PathParam(":id") long id) {
        AnimalEntity animal = animalLogic.findById(id);
        if (animal == null) {
            throw new RuntimeException("El animal solicitado no existe.");
        }
        return new AnimalDTO(animal);
    }

    /**
     * Metodo para crear animal
     *
     * @param animal
     * @return AnimalDTO
     */
    @POST
    public AnimalDTO createAnimal(AnimalDTO animal) {
        return new AnimalDTO(animalLogic.createAnimal(animal.toEntity()));
    }

    /**
     * Metodo para actualizar animal
     *
     * @param id
     * @param animal
     * @return AnimalDTO
     */
    @PUT
    @Path("{id: \\d+}")
    public AnimalDTO updateAnimal(@PathParam("id") long id, AnimalDTO animal) {
        AnimalEntity animalEntity = animalLogic.findById(id);
        if (animalEntity == null) {
            throw new RuntimeException("El animal solicitado no existe");
        }
        return new AnimalDTO(animalLogic.updateAnimal(animalEntity));
    }

    /**
     * Metodo para eliminar animal
     *
     * @param id
     */
    @DELETE
    @Path("{id: \\d+}")
    public void deleteAnimal(@PathParam("id") long id) {
        AnimalEntity animalEntity = animalLogic.findById(id);
        if (animalEntity == null) {
            throw new RuntimeException("El animal solicitado no existe");
        }
        animalLogic.deleteAnimal(id);
    }
}
