package com.enzoranelli.ecommerce.controller;

import com.enzoranelli.ecommerce.model.Producto;
import com.enzoranelli.ecommerce.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/public")
public class ProductoController {
    private final ProductoService productoService;
    @Autowired
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/productos")
    public List<Producto> obtenerProductos (){
        return  productoService.obtenerProductos();
    }
    @PostMapping("/agregar-producto")
    public Producto agregarProducto(@RequestBody Producto producto){
        productoService.agregarProducto(producto);
        return producto;
    }
}
