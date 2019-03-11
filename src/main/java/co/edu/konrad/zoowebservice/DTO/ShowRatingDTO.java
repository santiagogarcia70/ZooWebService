/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.konrad.zoowebservice.DTO;

import co.edu.konrad.zoowebservice.entities.ShowRatingEntity;

/**
 *
 * @author jhosep
 */
public class ShowRatingDTO {

    /*
    *Llave primaria  id
     */
    private long id;
    /*
     *Llave Foranea id_show
     */
    private long idShow;

    /*
    *Atributo user_name 
     */
    private String userName;
    /*
    *Atributo value 
     */
    private long valueShowR;

    public ShowRatingDTO(ShowRatingEntity showRating) {
        this.id = showRating.getId();
        this.idShow = showRating.getIdShow();
        this.userName = showRating.getUserName();
        this.valueShowR = showRating.getValueShowR();
    }

    public ShowRatingEntity toEntity() {
        ShowRatingEntity showRatingEntity = new ShowRatingEntity();
        showRatingEntity.setId(this.id);
        showRatingEntity.setIdShow(this.idShow);
        showRatingEntity.setUserName(this.userName);
        showRatingEntity.setValueShowR(this.valueShowR);

        return showRatingEntity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdShow() {
        return idShow;
    }

    public void setIdShow(long idShow) {
        this.idShow = idShow;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getValueShowR() {
        return valueShowR;
    }

    public void setValueShowR(long valueShowR) {
        this.valueShowR = valueShowR;
    }

}
