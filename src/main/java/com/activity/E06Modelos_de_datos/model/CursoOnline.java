package com.activity.E06Modelos_de_datos.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter @Setter
@AllArgsConstructor @Builder
public class CursoOnline implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private double puntuacion;

    @ManyToOne
    private Profesor profesor;

    @OneToMany(mappedBy = "cursoOnline")
    private List<Video> videos = new ArrayList<>();

    public void addProfesor(Profesor p) {
        this.profesor = p;
        p.getCursoOnline().add(this);
    }

    public void removeProfesor(Profesor p) {
        p.getCursoOnline().remove(this);
        this.profesor = null;
    }
}
