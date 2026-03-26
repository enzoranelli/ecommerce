package com.enzoranelli.ecommerce.repository;

import com.enzoranelli.ecommerce.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
