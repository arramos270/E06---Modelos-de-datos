package com.activity.E06Modelos_de_datos.service;

import com.activity.E06Modelos_de_datos.model.Producto;
import com.activity.E06Modelos_de_datos.repos.ProductoRepository;
import com.activity.E06Modelos_de_datos.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ProductoService extends BaseService<Producto, Long, ProductoRepository> {
}
