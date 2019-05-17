
package p2examen1_luisenriquez;

import java.util.ArrayList;

class Usuario {
    
    int code;
    String nombre;
    String apellido;
    int edad;
    ArrayList<Libros> prestados = new ArrayList();
    ArrayList<Libros> historial = new ArrayList();

    public Usuario() {
    }

    public Usuario(int code, String nombre, String apellido, int edad) {
        this.code = code;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Libros> getPrestados() {
        return prestados;
    }

    public void setPrestados(ArrayList<Libros> prestados) {
        this.prestados = prestados;
    }

    public ArrayList<Libros> getHistorial() {
        return historial;
    }

    public void setHistorial(ArrayList<Libros> historial) {
        this.historial = historial;
    }

    @Override
    public String toString() {
        return "Usuario{" + "code=" + code + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", prestados=" + prestados + ", historial=" + historial + '}';
    }
    
    
    
}
