/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.logic;

import co.edu.konrad.zoowebservice.DTO.AnimalDTO;
import co.edu.konrad.zoowebservice.entities.AnimalEntity;
import co.edu.konrad.zoowebservice.persistence.AnimalPersistence;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Alejandro
 */
@Stateless
public class AnimalLogic {

    @Inject
    private AnimalPersistence animalPersistence;

    /**
     * Metodo que retorna todos los animales.
     *
     * @return ListAnimalEntity
     */
    public List<AnimalEntity> findAll() {
        return animalPersistence.findAll();
    }

    /**
     * Metodo que retorna un animal por un id dado
     *
     * @param id
     * @return AnimalEntity
     */
    public AnimalEntity findById(long id) {
        AnimalEntity animal = animalPersistence.findById(id);
        if (animal == null) {
            throw new IllegalArgumentException("No existe un animal registrado con el identificador " + id);
        }
        return animal;
    }

    /**
     * Metodo para crear un animal
     *
     * @param animal
     * @return AnimalEntity
     */
    public AnimalEntity createAnimal(AnimalEntity animal) {
        return animalPersistence.insert(animal);
    }

    /**
     * Metodo para modificar un animal
     *
     * @param animal
     * @return AnimalEntity
     */
    public AnimalEntity updateAnimal(AnimalEntity animal) {
        return animalPersistence.update(animal);
    }

    /**
     * Metodo para eliminar un animal
     *
     * @param id
     * @return AnimalEntity
     */
    public AnimalEntity deleteAnimal(long id) {
        return animalPersistence.delete(id);
    }
    /**
     * Metodo para convertir lista de AnimalEntity a AnimalDTO
     * @param animals
     * @return animalsDTO
     */
    public List<AnimalDTO> toAnimalList(List<AnimalEntity> animals){
        List<AnimalDTO> animalsDTO = new ArrayList<>();
        for(AnimalEntity animal: animals){
            animalsDTO.add(new AnimalDTO(animal));
        }
        return animalsDTO;
    }
}
