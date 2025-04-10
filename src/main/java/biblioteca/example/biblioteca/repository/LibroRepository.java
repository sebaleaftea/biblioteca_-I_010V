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

    public Libro<Libro> obtenerLibros(){
        return listaLibros;

    }

    public Libro buscarLibroPorId(int id){

        for(Libro libro : listaLibros){
            if(libro.getId() == id)
        }

        return null;
    }

    // Buscar libro por isbn

    // Buscar libro por autor

    public Libro actualizar(Libro lib){

        int id = 0;
        int idPosicion = 0;

        for(int i = 0; i < listaLibros.size(); i++){
            if(listaLibros.get(i).getId() == lib.getId()){
                id = lib.getId();
                idPosicion = i;
            }
        }
        return null;
    }
}    