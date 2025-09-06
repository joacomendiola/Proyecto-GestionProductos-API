package com.example.proyecto4.repository;

import com.example.proyecto4.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository le da a ProductoRepository todos los métodos CRUD (findAll, save, findById, deleteById, etc.)
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
