package pe.edu.tecsup.demo.servicios;

import pe.edu.tecsup.demo.modelo.documents.Alumno;

import java.util.List;

public interface AlumnoService {

    List<Alumno> listar();

    void grabar(Alumno alumno);

    Alumno buscar(String codigo);

    void eliminar(String codigo);
}