package com.devsuperior.dslist.projections;


import org.springframework.stereotype.Component;

@Component
public interface GameMinProjection {

    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();

}
