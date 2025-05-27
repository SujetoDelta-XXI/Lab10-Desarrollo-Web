package pe.edu.tecsup.demo.servicios;
import pe.edu.tecsup.demo.modelo.documents.Curso;

import java.util.List;

public interface CursoService {

    public List<Curso> listar();

    public void grabar(Curso curso);

    public Curso buscar(String id);

    public void eliminar(String id);

}
