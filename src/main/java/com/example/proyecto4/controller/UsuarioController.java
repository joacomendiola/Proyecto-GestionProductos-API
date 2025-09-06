package com.example.proyecto4.controller;

import com.example.proyecto4.model.Producto;
import com.example.proyecto4.model.Usuario;
import com.example.proyecto4.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    //GET:Listar todos los productos
    @GetMapping
    public List<Usuario> listar(){
        return usuarioRepository.findAll();
    }

    //GET:Buscar producto por ID
    @GetMapping("/{id}")
    public Optional<Usuario> obtenerPorId(@PathVariable Long id){
        return usuarioRepository.findById(id);
    }

    //POST:Crear un nuevo producto
    @PostMapping
    public Usuario crear(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    //PUT:Actualizar un producto existente
    @PutMapping({"/{id}"})
    public Usuario actualizar(@PathVariable Long id, @RequestBody Usuario usuario){
        return usuarioRepository.findById(id)
                .map(p->{
                    p.setNombre(usuario.getNombre());
                    p.setCorreo(usuario.getCorreo());
                    return usuarioRepository.save(p);
                })
                .orElseThrow(()->new RuntimeException("Producto no encontrado con id" +id));
    }
    //DELETE: Eliminar un producto
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id){
      usuarioRepository.deleteById(id);
    }
}
