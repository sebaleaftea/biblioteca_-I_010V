package biblioteca.example.biblioteca.repository;

import jakarta.annotation.PostConstruct;
import biblioteca.example.biblioteca.model.Libro;
import org.springframework.stereotype.Repository;

import java.util.List;

import java.util.ArrayList;

@Repository
public class LibroRepository {

    private List<Libro> listaLibros = new ArrayList<>();

    @PostConstruct
    public void init(){
        listaLibros.add(new Libro(3, "978-1491950357", "Designing Data-Intensive Applications", "O'Reilly Media", 2017, "Martin Kleppmann"));
        listaLibros.add(new Libro(4, "978-0132350884", "Clean Code", "Prentice Hall", 2008, "Robert C. Martin"));
        listaLibros.add(new Libro(1, "978-0134685991", "Effective Java", "Addison-Wesley", 2018, "Joshua Bloch"));
        listaLibros.add(new Libro(2, "978-1617294945", "Spring in Action", "Manning", 2020, "Craig Walls"));
    }

    public List<Libro> obtenerLibros(){
        return listaLibros;

    }

    public Libro buscarLibroPorId(int id){

        for(Libro libro : listaLibros){
            if(libro.getId() == id);
        }

        return null;
    }

    // Buscar libro por isbn
    public Libro buscarPorIsbn(String isbn){
        
        for(Libro libro : listaLibros){
            if(isbn == libro.getIsbn()){
                return libro;
            }
        }
        return null;
    }


    // Buscar libro por autor
    public Libro buscarLibroPorAutor(String autor){

        for(Libro libro : listaLibros){
            if(autor == libro.getAutor()){
                return libro;
            }        
        }
        return null;
    }


    //Actualizar Libro
    public Libro actualizar(Libro lib){

        int id = 0;
        int idPosicion = 0;

        for(int i = 0; i < listaLibros.size(); i++){
            if(listaLibros.get(i).getId() == lib.getId()){
                id = lib.getId();
                idPosicion = i;
            }
        }
        Libro libro1 = new Libro();
        libro1.setId(id);
        libro1.setTitulo(lib.getTitulo());
        libro1.setAutor(lib.getAutor());
        libro1.setEditorial(lib.getEditorial());
        libro1.setFechaPublicacion(lib.getFechaPublicacion());
        libro1.setIsbn(lib.getIsbn());



        return libro1;
    }

    public void eliminar(int id){
        Libro libro = buscarLibroPorId(id);

            if(libro != null){
                listaLibros.remove(id);
            }            
        }
}