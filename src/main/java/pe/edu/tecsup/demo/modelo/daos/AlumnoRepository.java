package pe.edu.tecsup.demo.modelo.daos;

import org.springframework.data.mongodb.repository.MongoRepository;
import pe.edu.tecsup.demo.modelo.documents.Alumno;

public interface AlumnoRepository extends MongoRepository<Alumno, String> {
}