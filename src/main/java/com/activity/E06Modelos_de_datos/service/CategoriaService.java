package com.activity.E06Modelos_de_datos.service;

import com.activity.E06Modelos_de_datos.model.Categoria;
import com.activity.E06Modelos_de_datos.repos.CategoriaRepository;
import com.activity.E06Modelos_de_datos.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService extends BaseService<Categoria, Long, CategoriaRepository> {
}
