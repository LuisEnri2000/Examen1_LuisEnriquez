
package p2examen1_luisenriquez;


class Libros {
//    autores, titulo , genero , Editoriales , idioma , año que se escribio , ,ISBN(International Standard Book Number 
//            este es un número único para cada libro en la librería y tiene que tener la siguiente estructura para que 
//                    sea valido: ####-####-####-####) , año que ingresa en la librería, estado del libro (Prestado , 
//                            disponible y fuera de inventario) , Nombre de la persona prestado 
//            (Si no esta prestado a nadie solo se pondra ------) , numero de cuenta de la persona prestada (Si no esta prestado se usara 0000) .
    String autor;
    String titulo;
    String genero;
    String editorial;
    int ano;
    String ISBN;
    int anoIngreso;
    String estado;
    String persona = "-----";
    int cuenta = 0000;

    public Libros() {
    }

    public Libros(String autor, String titulo, String genero, String editorial, int ano, String ISBN, int anoIngreso, String estado) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.editorial = editorial;
        this.ano = ano;
        this.ISBN = ISBN;
        this.anoIngreso = anoIngreso;
        this.estado = estado;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getAnoIngreso() {
        return anoIngreso;
    }

    public void setAnoIngreso(int anoIngreso) {
        this.anoIngreso = anoIngreso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return ISBN + " " + titulo + " "+ "Autor: " + autor +", Estado: " + estado + ", Persona: " + persona + ", Cuenta: " + cuenta ;
    }
    
    
}
