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
public class Profesor implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre, email;
    private double puntuacion;

    @OneToMany(mappedBy = "profesor")
    private List<CursoOnline> cursoOnline = new ArrayList<>();

    public Profesor(String nombre, String email, double puntuacion){
        this.nombre=nombre;
        this.email=email;
        this.puntuacion=puntuacion;
    }
}
