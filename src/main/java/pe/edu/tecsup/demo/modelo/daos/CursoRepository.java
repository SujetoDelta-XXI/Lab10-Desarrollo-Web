package pe.edu.tecsup.demo.modelo.daos;
import org.springframework.data.mongodb.repository.MongoRepository;
import pe.edu.tecsup.demo.modelo.documents.Curso;

public interface CursoRepository extends MongoRepository<Curso, String> {
}