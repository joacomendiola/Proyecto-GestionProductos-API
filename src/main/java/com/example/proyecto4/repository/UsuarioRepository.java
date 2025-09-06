package com.example.proyecto4.repository;

import com.example.proyecto4.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository le da a UsuarioRepository todos los métodos CRUD (findAll, save, findById, deleteById, etc.)
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
