package com.enzoranelli.ecommerce.service;

import com.enzoranelli.ecommerce.model.Producto;
import com.enzoranelli.ecommerce.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService
{
    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository)
    {
        this.productoRepository = productoRepository;
    }

    public List<Producto> obtenerProductos(){
        return productoRepository.findAll();
    }

    public void agregarProducto(Producto producto)
    {
        productoRepository.save(producto);
        System.out.println("Producto agregado con exito!");
    }
}
