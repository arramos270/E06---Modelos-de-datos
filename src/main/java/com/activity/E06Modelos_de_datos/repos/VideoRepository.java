package com.activity.E06Modelos_de_datos.repos;

import com.activity.E06Modelos_de_datos.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
