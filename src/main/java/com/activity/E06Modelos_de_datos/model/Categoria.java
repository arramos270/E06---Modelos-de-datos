package com.activity.E06Modelos_de_datos.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Entity
@Getter @Setter
@NoArgsConstructor  @AllArgsConstructor @Builder
public class Categoria {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "categoria")
    private List<Producto> productos = new ArrayList<>();

    @OneToMany
    private Optional<Long> categoriaPadreId;

    private Categoria(String nombre, Optional<Long> categoriaPadreId){
        this.nombre=nombre;
        this.categoriaPadreId=categoriaPadreId;
    }

}
