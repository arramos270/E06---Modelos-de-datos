package com.activity.E06Modelos_de_datos.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter @Setter
@AllArgsConstructor @Builder
public class Video implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private int orden;
    private String titulo,descripcion,url;

    @ManyToOne
    private CursoOnline cursoOnline;

    public void addCursoOnline(CursoOnline c){
        this.cursoOnline = c;
        c.getVideos().add(this);
    }

    public void removeCursoOnline(CursoOnline c){
        c.getVideos().remove(this);
        this.cursoOnline = null;
    }
}
