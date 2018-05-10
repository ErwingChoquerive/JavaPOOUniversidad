/*
 * Archivo que contiene la Clase Principal del Programa
 * - En este ejemplo se muestra el principio de Herencia
 */
package bo.usfx.sis457;

import bo.usfx.sis457.entidades.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Marcelo
 */
public class POOHerenciaEjemplo {
    public static ArrayList<Persona> personas;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        personas = new ArrayList<>();
        
        personas.add(new Alumno("35-1", 1,"calculo"));
        personas.add(new Docente("Ingeniero en sistemas",2,"Licenciado en Informática", "222222", "Juan Perez", new GregorianCalendar(1980, 11,01)));
        personas.add(new Alumno("35-2", 1,"fisica"));
        personas.add(new Alumno("35-3", 1,"fisica"));
        personas.add(new Docente("Ingeniero Sistemas",2, "Programacion Basica"));
        personas.add(new Alumno("35-4", 1,"fisica"));
        
        menuPrincipal();
    }
    
    public static void menuPrincipal() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Programa: Universidad                            |");
        System.out.println("| - Ejemplo de Herencia                            |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Gestión de Personas                           |");
        System.out.println("| 2) Gestión de Docentes                           |");
        System.out.println("| 3) Gestión de Alumnos                            |");
        System.out.println("| 0) Salir                                         |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                menuPersonas();
                break;
            case "2":
                menuDocentes();
                break;
            case "3":
                menuAlumnos();
                break;
            default:
                System.out.println("Salió del Programa");
        }        
    }
    
    public static void menuPersonas() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Personas                              |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Personas                               |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarPersonas();
                volverMenu();
                menuPersonas();
                break;
            default:
                menuPrincipal();
        }
    }
    
    public static void menuDocentes() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Docentes                              |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Docente                                |");
        System.out.println("| 2) Añadir Docente                                |");
        System.out.println("| 3) Modificar Docente                             |");
        System.out.println("| 4) Borrar Docente                                |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarDocente();
                volverMenu();
                menuDocentes();
                break;
            case "2":
                anadirDocente();
                volverMenu();
                menuDocentes();
                break;
            case "3":
                modificarDocente();
                volverMenu();
                menuDocentes();
                break;
            case "4":
                borrarDocente();
                volverMenu();
                menuDocentes();
                break;
            default:
                menuPrincipal();
        }
    }
    
    public static void menuAlumnos() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Alumnos                               |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Alumnos                                |");
        System.out.println("| 2) Añadir Alumno                                 |");
        System.out.println("| 3) Modificar Alumno                              |");
        System.out.println("| 4) Borrar Alumno                                 |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarAlumnos();
                volverMenu();
                menuAlumnos();
                break;
            case "2":
                anadirAlumno();
                volverMenu();
                menuAlumnos();
                break;
            case "3":
                modificarAlumno();
                volverMenu();
                menuAlumnos();
                break;
            case "4":
                borrarAlumno();
                volverMenu();
                menuAlumnos();
                break;
            default:
                menuPrincipal();
        }
    }
    
    public static void volverMenu() {
        String opcion;
        Scanner entradaTeclado = new Scanner(System.in);
        while(true) {
            System.out.print("\nPresione M para continuar...");
            opcion = entradaTeclado.next();
            if ((opcion.equals("M"))||(opcion.equals("m"))) {
                break;
            }
        }
    }
    
    public static void listarPersonas() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Personas                              |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona persona: personas) {
            i++;
            System.out.println(i + ": " + persona);
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static int buscarPersona(int id) {
        boolean existe = false;
        int i = 0;
        for (Persona persona: personas) {
            if (persona.getId() == id) {
                existe = true;
                break;
            }
            i++;
        }
        return existe?i:-1;
    }
    
    public static void listarDocente() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Profesores                            |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona docente: personas) {
            if (docente instanceof Docente) {
                i++;
                System.out.println(i + ": " + docente);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static void anadirDocente() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        String asignatura;
        String titulo;
        int añosExperiencia;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Docente                                   |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introduzca el Asignatura: ");
            asignatura = entradaTeclado.readLine();
            System.out.print("Introduzca el Título: ");
            titulo = entradaTeclado.readLine();
            System.out.print("Introduzca Años de Experiencia: ");
            añosExperiencia = Integer.parseInt(entradaTeclado.readLine());
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            personas.add(new Docente(titulo,añosExperiencia ,asignatura,carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Profesor completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void modificarDocente() {
        int id;
        Docente docente;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Docente                                |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                docente = (Docente)personas.get(id);
                System.out.print("Modificar el Carnet de Identidad '" + docente.getCarnetIdentidad()+ "': ");
                docente.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + docente.getNombre() + "': ");
                docente.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(docente.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                docente.setFechaNacimiento(fechaNacimientoCalendario);
               /* System.out.print("Modificar el Contrato '" + docente.getContrato()+ "': ");
                docente.setContrato(entradaTeclado.readLine());*/
                System.out.print("Introduzca el Título Universitario: ");
                docente.setTitulo(entradaTeclado.readLine());
                personas.set(id, docente);
                System.out.println("Registro de Profesor modificado!");
            } else {
                System.out.println("El Registro de Profesor no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarDocente() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Docente                                   |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Docente borrado!");
            } else {
                System.out.println("El Registro de Docente no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void listarAlumnos() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Alumnos                               |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona alumno: personas) {
            if (alumno instanceof Alumno) {
                i++;
                System.out.println(i + ": " + alumno);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    
    public static void anadirAlumno() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        String carnetUniversitario;
        String asignatura;
        int semestre;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Alumno                                    |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introduzca el CU: ");
            carnetUniversitario = entradaTeclado.readLine();
            System.out.print("Introduzca el Semestre: ");
            semestre = Integer.parseInt(entradaTeclado.readLine());
            System.out.print("Introduzca la Asignatura: ");
            asignatura = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            personas.add(new Alumno(carnetUniversitario, semestre, asignatura , carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Profesor completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void modificarAlumno() {
        int id;
        Alumno alumno;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Alumno                                 |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Alumno a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                alumno = (Alumno)personas.get(id);
                System.out.print("Modificar el Carnet de Identidad '" + alumno.getCarnetIdentidad()+ "': ");
                alumno.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + alumno.getNombre() + "': ");
                alumno.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(alumno.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                alumno.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar el CU '" + alumno.getCarnetUniversitario() + "': ");
                alumno.setCarnetUniversitario(entradaTeclado.readLine());
                System.out.print("Introduzca el Semestre: ");
                alumno.setSemestre(Integer.parseInt(entradaTeclado.readLine()));
                personas.set(id, alumno);
                System.out.println("Registro de Alumno modificado!");
            } else {
                System.out.println("El Registro de Alumno no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarAlumno() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Alumno                                    |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Alumno a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Alumno borrado!");
            } else {
                System.out.println("El Registro de Alumno no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    /**
     * Método que limpia pantalla de la consola. Funciona fuera de NetBeans.
     */
    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
