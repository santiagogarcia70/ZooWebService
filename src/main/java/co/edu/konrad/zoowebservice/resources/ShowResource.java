/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.resources;

import co.edu.konrad.zoowebservice.DTO.ShowDTO;
import co.edu.konrad.zoowebservice.entities.ShowEntity;
import co.edu.konrad.zoowebservice.logic.ShowLogic;
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
@Path("/show")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ShowResource {
    
    @EJB
    private ShowLogic showLogic;

    /**
     * Metodo que retorna todos los shows
     *
     * @return ListShowDTO
     */
    @GET
    public List<ShowDTO> getShows() {
        List<ShowEntity> shows = showLogic.findAll();
        return showLogic.toShowList(shows);
    }

    /**
     * Metodo que retorna un show por el id dado
     *
     * @param id
     * @return ShowDTO
     */
    @GET
    @Path("{id: \\d+}")
    public ShowDTO getShowById(@PathParam(":id") long id) {
        ShowEntity show = showLogic.findById(id);
        if (show == null) {
            throw new RuntimeException("El show solicitado no existe.");
        }
        return new ShowDTO(show);
    }

    /**
     * Metodo para crear show
     *
     * @param show
     * @return ShowDTO
     */
    @POST
    public ShowDTO createAnimal(ShowDTO show) {
        return new ShowDTO(showLogic.createShow(show.toEntity()));
    }

    /**
     * Metodo para actualizar show
     *
     * @param id
     * @param show
     * @return ShowDTO
     */
    @PUT
    @Path("{id: \\d+}")
    public ShowDTO updatedShow(@PathParam("id") long id, ShowEntity show) {
        ShowEntity showEntity = showLogic.findById(id);
        if (showEntity == null) {
            throw new RuntimeException("El show solicitado no existe");
        }
        return new ShowDTO(showLogic.updateShow(showEntity));
    }

    /**
     * Metodo para eliminar show
     *
     * @param id
     */
    @DELETE
    @Path("{id: \\d+}")
    public void deleteAShow(@PathParam("id") long id) {
        ShowEntity showEntity = showLogic.findById(id);
        if (showEntity == null) {
            throw new RuntimeException("El show solicitado no existe");
        }
        showLogic.deleteShow(id);
    }
}
