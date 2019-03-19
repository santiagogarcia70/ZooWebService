package co.edu.konrad.zoowebservice.logic;

import co.edu.konrad.zoowebservice.DTO.ShowDTO;
import co.edu.konrad.zoowebservice.entities.ShowEntity;
import co.edu.konrad.zoowebservice.persistence.ShowPersistence;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alejandro
 */
@Stateless
public class ShowLogic {

    @Inject
    private ShowPersistence showPersistence;

    /**
     * Metodo que retorna todos los shows.
     *
     * @return ListShowEntity
     */
    public List<ShowEntity> findAll() {
        return showPersistence.findAll();
    }

    /**
     * Metodo que retorna un show por un id dado
     *
     * @param id
     * @return ShowEntity
     */
    public ShowEntity findById(long id) {
        ShowEntity show = showPersistence.findById(id);
        if (show == null) {
            throw new IllegalArgumentException("No existe un show registrado con el identificador " + id);
        }
        return show;
    }

    /**
     * Metodo para crear un show
     *
     * @param show
     * @return ShowEntity
     */
    public ShowEntity createShow(ShowEntity show) {
        return showPersistence.insert(show);
    }

    /**
     * Metodo para modificar un show
     *
     * @param show
     * @return ShowEntity
     */
    public ShowEntity updateShow(ShowEntity show) {
        return showPersistence.update(show);
    }

    /**
     * Metodo para eliminar un show
     *
     * @param id
     * @return ShowEntity
     */
    public ShowEntity deleteShow(long id) {
        return showPersistence.delete(id);
    }
    /**
     * Metodo para convertir lista de ShowEntity a ShowsDTO
     * @param shows
     * @return showsDTO
     */
    public List<ShowDTO> toShowList(List<ShowEntity> shows){
        List<ShowDTO> showsDTO = new ArrayList<>();
        for(ShowEntity show: shows){
            showsDTO.add(new ShowDTO(show));
        }
        return showsDTO;
    }
}
