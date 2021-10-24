package com.activity.E06Modelos_de_datos.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@Getter @Setter
@AllArgsConstructor @Builder
public class Producto {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private double pvp;

    @ManyToOne
    private Categoria categoria;

    public void addCategoria(Categoria c){
        this.categoria = c;
        c.getProductos().add(this);
    }

    public void removeCategoria(Categoria c){
        c.getProductos().remove(this);
        this.categoria = null;
    }
}
