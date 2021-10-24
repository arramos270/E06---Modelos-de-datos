package com.activity.E06Modelos_de_datos.repos;

import com.activity.E06Modelos_de_datos.model.Categoria;
import com.activity.E06Modelos_de_datos.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    List<Producto> findByCategoria(Categoria categoria);
}
