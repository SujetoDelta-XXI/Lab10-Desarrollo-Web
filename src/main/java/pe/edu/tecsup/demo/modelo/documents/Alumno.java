package pe.edu.tecsup.demo.modelo.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "alumnos")
public class Alumno {
    @Id
    private String codigo;
    private String nombres;
    private String apellidos;
    private String fechaNac;
    private String sexo;
    private int ciclo; // Campo extra

    public Alumno() {
    }

    public Alumno(String codigo, String nombres, String apellidos, String fechaNac, String sexo, int ciclo) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
        this.ciclo = ciclo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        if (ciclo < 1 || ciclo > 6) {
            throw new IllegalArgumentException("Ciclo debe estar entre 1 y 6");
        }
        this.ciclo = ciclo;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "codigo='" + codigo + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNac='" + fechaNac + '\'' +
                ", sexo='" + sexo + '\'' +
                ", ciclo=" + ciclo +
                '}';
    }
}