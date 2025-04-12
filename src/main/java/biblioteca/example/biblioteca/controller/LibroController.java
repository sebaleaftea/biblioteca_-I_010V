package biblioteca.example.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import biblioteca.example.biblioteca.model.Libro;
import biblioteca.example.biblioteca.service.LibroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1/libro")
public class LibroController {

    @Autowired
    private LibroService libroservice;

    @GetMapping 
    public List <Libro> listarLibros(){
        return libroservice.sacarLibros();
    }

    @PostMapping
    public Libro agregarLibro(@RequestBody Libro libro){
        return libroservice.guardarLibro(libro);
    }

    //Falta implementar mappin para buscar libro por id , por isbn y por autor. 
    //Falta implementar actualizar y eliminar libro.


    
    
    
}
