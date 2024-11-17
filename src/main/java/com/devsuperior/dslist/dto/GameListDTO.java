package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO() {
    }

    public GameListDTO(GameList entity) {
        this.name = entity.getName();
        this.id = entity.getId();
    }

      public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
