package com.activity.E06Modelos_de_datos.repos;

import com.activity.E06Modelos_de_datos.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
