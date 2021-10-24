package com.activity.E06Modelos_de_datos.service;

import com.activity.E06Modelos_de_datos.model.Profesor;
import com.activity.E06Modelos_de_datos.repos.ProfesorRepository;
import com.activity.E06Modelos_de_datos.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProfesorService  extends BaseService<Profesor, Long, ProfesorRepository> {
}
