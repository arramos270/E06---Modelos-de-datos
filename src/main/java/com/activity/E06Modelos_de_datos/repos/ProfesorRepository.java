package com.activity.E06Modelos_de_datos.repos;

import com.activity.E06Modelos_de_datos.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}
