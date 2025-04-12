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

    public Libro obtenerLibroPorIsbn(String isbn){
        return repoLibro.buscarPorIsbn(isbn);
    }

    public Libro obtenerLibroPorAutor(String autor){
        return repoLibro.buscarLibroPorAutor(autor);
    }

    public Libro guardarLibro(Libro lib){
        return repoLibro.guardar(lib);
    }

    public Libro actualizarLibro(Libro lib){
        return repoLibro.actualizar(lib);
    }

    public String eliminarLibro(int id){
        repoLibro.eliminar(id);
        return "Libro eliminado";
    }
}
