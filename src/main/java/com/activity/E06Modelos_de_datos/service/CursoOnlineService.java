package com.activity.E06Modelos_de_datos.service;

import com.activity.E06Modelos_de_datos.model.CursoOnline;
import com.activity.E06Modelos_de_datos.repos.CursoOnlineRepository;
import com.activity.E06Modelos_de_datos.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class CursoOnlineService  extends BaseService<CursoOnline, Long, CursoOnlineRepository> {
}
