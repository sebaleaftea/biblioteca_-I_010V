package biblioteca.example.biblioteca.service;

import java.util.List;
import biblioteca.example.biblioteca.model.Libro;
import biblioteca.example.biblioteca.repository.LibroRepository;

public class LibroService {

    private LibroRepository repoLibro;

    public List<Libro>sacarLibros(){
        return repoLibro.obtenerLibros();
    }

    public Libro obtenerLibroPorId(int id){
        return repoLibro.buscarLibroPorId(id);
    }

    


}
