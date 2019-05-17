
package p2examen1_luisenriquez;

import java.util.ArrayList;
import java.util.Scanner;

public class P2Examen1_LuisEnriquez {

    public static void main(String[] args) {
        int masterOp = 0;
        Scanner l = new Scanner(System.in);
        boolean logeado = false;
        boolean admin = false;
        ArrayList<Usuario> users = new ArrayList();
        ArrayList<Libros> libros = new ArrayList();
        
        // 3 Usuarios (int code, String nombre, String apellido, int edad)
        users.add(new Usuario(0022, "Luis", "Enriquez", 19));
        users.add(new Usuario(0023, "Luis", "Pero mas cool", 20));
        users.add(new Usuario(0024, "Luis", "Tercero", 19));
        
        // 10 libros pre-hechos
        libros.add(new Libros("Willy Wonka", "Liberen a Wonka", "Terror", "Zapata SC", 1720, "0000-0000-0000-0001", 2016, "Disponible"));
        libros.add(new Libros("Juan O.H.", "El presidente narco", "Romance", "Mumford", 2010, "0000-0000-0000-0002", 2017, "Disponible"));
        libros.add(new Libros("Adolf Hitlar", "El pacifismo", "Documental", "Los Judios SC", 1914, "0000-0000-0000-0003", 2017, "Disponible"));
        libros.add(new Libros("Mark Twain", "Huckleberry Finn", "Aventura/Comedia", "Zapata SC", 1780, "0000-0000-0000-0004", 2019, "Disponible"));
        libros.add(new Libros("Ela Hutor", "Elly Broh", "Fantasia", "Sega", 2014 , "0000-0000-0000-0005", 2011, "Disponible"));
        libros.add(new Libros("Dross Rotzank", "Luna de Pluton", "Fantasia", "Yutubi", 2014 , "0000-0000-0000-0006", 2012, "Disponible"));
        libros.add(new Libros("Roberto Alatriz", "Darkar", "Comedia", "Aquiles SA", 2008 , "0000-0000-0000-0007", 2012, "Disponible"));
        libros.add(new Libros("Ana Lisa", "Mel Ganso", "Misterio", "BraSSers", 2014 , "0000-0000-0000-0008", 2016, "Disponible"));
        libros.add(new Libros("Bill Cosby", "El arte de conquistar mujeres", "Informativo", "Hee-Hee", 2014 , "0000-0000-0000-0009", 2016, "Disponible"));
        libros.add(new Libros("Adam Sandler", "El comediante", "Comedia", "Sega", 2014 , "0000-0000-0000-0010", 2009, "Disponible"));
        
        while (masterOp != 5) { // Verificar que no le de a salir
            
            System.out.println("Menu: ");
            System.out.println("1. Log in / Agregar cliente");
            System.out.println("2. Inventario");
            System.out.println("3. Busqueda");
            System.out.println("4. Prestamos");
            System.out.println("5. Salir");
            p("Opcion: ");
            masterOp = l.nextInt();
            
            System.out.println();
            
            if (masterOp == 1 && !logeado) {
                
                System.out.println("Que quiere hacer?");
                System.out.println("1. Crear cliente");
                System.out.println("2. Log In (Admin o empleado");
                p("Opcion: "); int op = l.nextInt();
                
                System.out.println();
                
                if (op == 1) {
                    System.out.println("Bien!");
                    try {
                        int code = users.size();
                        p("Nombre: "); String nom = l.next();
                        p("Apellido: "); String ape = l.next();
                        p("Edad: "); int ed = l.nextInt();
                        
                        users.add(new Usuario(code,nom,ape,ed));
                        
                        System.out.println("Agregado exitosamente!");
                    }
                    catch (Exception e) {
                        System.out.println("Hubo un error y no pudimos guardar los cambios!");
                    }
                    
                    
                }
                
                if (op == 2) {
                    System.out.println("Prehechos: ");
                    System.out.println("admin 1234");
                    System.out.println("user1 contra1");
                    System.out.println("user2 contra2");
                    System.out.println();
                    p("Usuario: "); String iUser = l.next();
                    p("Contra: "); String iPass = l.next();
                    
                    if (iUser.equals("admin") && iPass.equals("1234")) {
                        System.out.println("Logeado como admin!");
                        admin = true;
                        logeado = true;
                        
                    }
                    
                    if (iUser.equals("user1") && iPass.equals("contra1")) {
                        System.out.println("Logeado exitosamente!");
                        
                        logeado = true;
                        
                    }
                    
                    if (iUser.equals("user2") && iPass.equals("contra2")) {
                        System.out.println("Logeado exitosamente!");
                        
                        logeado = true;
                        
                    }
                    
                    if (!logeado) {
                        System.out.println("Usuario o contrasena incorrectos!");
                    }
                }   
            }else{
                if (masterOp == 1) {
                    System.out.println("Ya estas logeado!");
                }
            }
            
            if (masterOp == 2 && logeado) {
                
                System.out.println("Bien!");
                System.out.println("1. Listar libros");
                System.out.println("Si eres admin:");
                System.out.println("2. Agregar libro");
                System.out.println("3. Eliminar libro");
                p("Opcion: "); int op = l.nextInt();
                
                if (op == 1) {
                    printA(libros);
                }
                if (op == 2 && admin) {
                    
                    try {
                        //(String autor, String titulo, String genero, String editorial, int ano, String ISBN, int anoIngreso, String estado)
                        p("Autor: "); l.nextLine(); String autor = l.nextLine();
                        p("Titulo: "); l.nextLine();String tit = l.nextLine();
                        p("Genero: "); String gen = l.next();
                        p("Editorial: "); l.nextLine(); String edi = l.nextLine();
                        p("Ano de creacion: "); int ax = l.nextInt();
                        boolean verificado = false;
                        String cod = "YEET! Error! :v";
                        while (!verificado) {
                            System.out.println("No puede repetirse! ####-####-####-####");
                            p("Codigo: "); cod = l.next();
                            verificado = verISBN(cod, libros);
                        }
                        libros.add(new Libros (autor,tit,gen,edi,ax,cod,2019,"Disponible"));
                        System.out.println("Agregado exitosamente!");
                    }
                    catch (Exception e){
                        System.out.println("Error! Intenta mas tarde!");
                    }
                    
                }
                
                if (op == 3 && admin) {
                    printA(libros);
                    try {
                        p("Ingrese posicion a eliminar: "); int opc = l.nextInt();
                        libros.remove(opc);
                    }
                    catch (Exception e) {
                        System.out.println("Hubo un error! Intenta mas tarde!");
                    }
                }
                
                if (!admin) {
                    System.out.println("Si no eres administrador, algunas opciones podrian estar bloqueadas!");
                }
            }
            
            if (masterOp == 3 && logeado) {
                
                System.out.println("BUSQUEDA");
                System.out.println("Filtro de busqueda: ");
                System.out.println("1. ISBN");
                System.out.println("2. Titulo");
                System.out.println("3. Genero");
                System.out.println("4. Autor");
                p("Opcion: "); int opic = l.nextInt();
                String aBuscar = "";
                boolean found = false;
                
                if (opic == 1) {
                    p("ISBN: "); aBuscar = l.next();
                    for (Libros t : libros) {           
                        if (aBuscar.equals(t.getISBN())) {
                            System.out.println("MATCH FOUND!");
                            System.out.println(t);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No se encontro!");
                    }
                }
                if (opic == 2) {
                    p("Titulo: "); l.nextLine(); aBuscar = l.nextLine();
                    for (Libros t : libros) {           
                        if (aBuscar.equals(t.getTitulo())) {
                            System.out.println("MATCH FOUND!");
                            System.out.println(t);
                            found = true;
                        }
                    } 
                    if (!found) {
                        System.out.println("No se encontro!");
                    }
                }
                
                if (opic == 3) {
                    p("Genero: "); aBuscar = l.next();
                    for (Libros t : libros) {           
                        if (aBuscar.equals(t.getGenero())) {
                            System.out.println("MATCH FOUND!");
                            System.out.println(t);
                            found = true;
                        }
                    }  
                    if (!found) {
                        System.out.println("No se encontro!");
                    }
                }
                
                if (opic == 4) {
                    p("Autor: "); l.nextLine(); aBuscar = l.nextLine();
                    for (Libros t : libros) {           
                        if (aBuscar.equals(t.getAutor())) {
                            System.out.println("MATCH FOUND!");
                            System.out.println(t);
                            found = true;
                        }
                    }  
                    if (!found) {
                        System.out.println("No se encontro!");
                    }
                }
                
            }
            
            if (masterOp == 4 && logeado) {
                try {
                    System.out.println("Prestamos!");
                    System.out.println("Usuarios:");
                    printA(users);
                    p("Usuario a prestar: ");
                    int pox = l.nextInt();

                    if (users.get(pox).getPrestados().size() < 5) {
                        System.out.println("Libros: ");
                        printA(libros);
                        p("Libro a prestar: ");
                        int poz = l.nextInt();
                        if (libros.get(poz).getEstado().equals("Disponible")) {
                            users.get(pox).getPrestados().add(libros.get(poz));
                            users.get(pox).getHistorial().add(libros.get(poz));
                            libros.get(poz).setEstado("Prestado");
                            libros.get(poz).setPersona(users.get(pox).getNombre());
                            libros.get(poz).setCuenta(users.get(pox).getCode());
                            System.out.println("Prestado exitosamente!");
                        }
                        
                    }else{
                        System.out.println("Error! Ese usuario llego al limite de prestamos!");
                    }
                }
                catch (Exception e) {
                    System.out.println("Hubo un error! Intenta mas tarde!");
                }
            }
            
            if (!logeado) {
                System.out.println("Quiza debas iniciar sesion!");
            }
            
            System.out.println();
        }
    }
    
    public static void p(String n) {
        System.out.print(n);
    }
    
    public static void printA(ArrayList x) {
        for (int i = 0; i < x.size(); i++) {
            System.out.println(i + ". " + x.get(i));
        }
    }
    
    public static boolean verISBN(String c, ArrayList<Libros> x) {
        boolean ver = true;
        for (Libros t : x) {
            
            if (c.equals(t.getISBN()) || c.charAt(4) != '-' || c.charAt(9) != '-' || c.charAt(14) != '-') {
                ver = false;
            }
        }
        return ver;
    }
}
