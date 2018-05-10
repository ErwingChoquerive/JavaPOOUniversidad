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
        System.out.println("| 4) Gestión de Administradores                    |");
        System.out.println("| 5) Gestión de Docentes Titulares                 |");
        System.out.println("| 6) Gestión de Docentes de Contrato               |");
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
            case "4" :
                menuAdministrativo();
                break;
            case "5" :
                menuDocenteTitular();
                break;
            case "6" :
                menuDocenteContrato();
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
    
    //SUB-MENU ADMINISTRATIVO
    public static void menuAdministrativo() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de Administrativo                        |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar Administracion                         |");
        System.out.println("| 2) Añadir Administracion                         |");
        System.out.println("| 3) Modificar Administracion                      |");
        System.out.println("| 4) Borrar Administracion                         |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarAdministrativo();
                volverMenu();
                menuAdministrativo();
                break;
            case "2":
                anadirAdministrativo();
                volverMenu();
                menuAdministrativo();
                break;
            case "3":
                modificarAdministrativo();
                volverMenu();
                menuAdministrativo();
                break;
            case "4":
                borrarAdministrativo();
                volverMenu();
                menuAdministrativo();
                break;
            default:
                menuPrincipal();
        }
    }
    
    //SUB-MENU DOCENTE-CONTRAT0
    public static void menuDocenteContrato() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de DocenteContrato                       |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar DocenteContrato                        |");
        System.out.println("| 2) Añadir DocenteContrato                        |");
        System.out.println("| 3) Modificar DocenteContrato                     |");
        System.out.println("| 4) Borrar DocenteContrato                        |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarDocenteContrato();
                volverMenu();
                menuDocenteContrato();
                break;
            case "2":
                anadirDocenteContrato();
                volverMenu();
                menuDocenteContrato();
                break;
            case "3":
                modificarDocenteContrato();
                volverMenu();
                menuDocenteContrato();
                break;
            case "4":
                borrarDocenteContrato();
                volverMenu();
                menuDocenteContrato();
                break;
            default:
                menuPrincipal();
        }
    }
    
    //SUB-MENU DOCENTE-TITULAR
    public static void menuDocenteTitular() {
        // Declaracion de las variables
        Scanner entradaTeclado;
        String opcion;

        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Gestión de DocenteTitular                        |");
        System.out.println("+==================================================+");
        System.out.println("| 1) Listar DocenteTitular                         |");
        System.out.println("| 2) Añadir DocenteTitular                         |");
        System.out.println("| 3) Modificar DocenteTitular                      |");
        System.out.println("| 4) Borrar DocenteTitular                         |");
        System.out.println("| 0) Volver al Menú Principal                      |");
        System.out.println("+==================================================+");
        System.out.print("Qué desea realizar? ");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.next();
        switch (opcion) {
            case "1":
                listarDocenteTitular();
                volverMenu();
                menuDocenteTitular();
                break;
            case "2":
                anadirDocenteTitular();
                volverMenu();
                menuDocenteTitular();
                break;
            case "3":
                modificarDocenteTitular();
                volverMenu();
                menuDocenteTitular();
                break;
            case "4":
                borrarDocenteTitular();
                volverMenu();
                menuDocenteTitular();
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
        System.out.println("| Listado de Docentes                            |");
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
    //titulo, años experiencia,asignatura
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
            personas.add(new Docente(titulo,añosExperiencia ,asignatura,carnetIdentidad,
                    nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Docente completado!");
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
                System.out.print("Modificar Asignatura '" + docente.getAsignaturas()+ "': ");
                docente.setAsignaturas(entradaTeclado.readLine());
                System.out.print("Modificar  Título : '" + docente.getTitulo() + "': ");
                docente.setTitulo(entradaTeclado.readLine());
                System.out.println("Modificar Años Experiencia'" + docente.getAñosExperiencia() + "': ");
                docente.setAñosExperiencia(Integer.parseInt(entradaTeclado.readLine()));
                personas.set(id, docente);
                System.out.println("Registro del Docente modificado!");
            } else {
                System.out.println("El Registro del Docente no existe!");
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
            personas.add(new Alumno(carnetUniversitario,semestre,asignatura , 
                    carnetIdentidad, nombre, fechaNacimientoCalendario));
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
                System.out.println("Modificar Asignatura '"+ alumno.getAsignaturas() + "' : ");
                alumno.setAsignaturas(entradaTeclado.readLine());
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
    
    //FUNCIONES DE SUB MENU DE ADMINISTRATIVO
    public static void listarAdministrativo() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Administradores                       |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona administrativo: personas) {
            if (administrativo instanceof Administrativo) {
                i++;
                System.out.println(i + ": " + administrativo);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    //cargo,lugar de trabajo, fecha de ingreso
    public static void anadirAdministrativo() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        String cargo;
        String lugarTrabajo;
        String fechaIngreso;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Administrador                             |");
            System.out.println("+==================================================+");
            System.out.print("Introduzca el Carnet de Identidad: ");
            carnetIdentidad = entradaTeclado.readLine();
            System.out.print("Introduzca el Nombre: ");
            nombre = entradaTeclado.readLine();
            System.out.print("Introduzca la Fecha de Nacimiento (ejemplo: 1980-01-01): ");
            fechaNacimiento = entradaTeclado.readLine();
            System.out.print("Introduzca Cargo: ");
            cargo = entradaTeclado.readLine();
            System.out.print("Introduzca el Lugar de Trabajo: ");
            lugarTrabajo = entradaTeclado.readLine();
            System.out.print("Introduzca Fecha de Ingreso: ");
            fechaIngreso = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            Date fechaIngresoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaIngreso);
            Calendar fechaIngresoCalendario = Calendar.getInstance();
            fechaIngresoCalendario.setTime(fechaIngresoDate);
            personas.add(new Administrativo(cargo,lugarTrabajo ,fechaIngresoCalendario,carnetIdentidad,
                    nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Administrador completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void modificarAdministrativo() {
        int id;
        Administrativo administrativo;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Administrador                          |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Administrador a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                administrativo = (Administrativo)personas.get(id);
                System.out.print("Modificar el Carnet de Identidad '" + administrativo.getCarnetIdentidad()+ "': ");
                administrativo.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + administrativo.getNombre() + "': ");
                administrativo.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(administrativo.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                administrativo.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar el Cargo '" + administrativo.getCargo()+ "': ");
                administrativo.setCargo(entradaTeclado.readLine());
                System.out.print("Modificar el Lugar de Trabajo: ");
                administrativo.setLugarTrabajo(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Ingreso '" + Utilitarios.getFechaCalendario(administrativo.getFechaIngreso()) + "': ");
                Date fechaIngresoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaIngresoCalendario = Calendar.getInstance();
                fechaIngresoCalendario.setTime(fechaIngresoDate);
                administrativo.setFechaIngreso(fechaIngresoCalendario);
                personas.set(id, administrativo);
                System.out.println("Registro de Administrador modificado!");
            } else {
                System.out.println("El Registro del Administrador no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarAdministrativo() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Administrador                             |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Administrador a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Administrador borrado!");
            } else {
                System.out.println("El Registro del Administrador no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    //FUNCIONES DE SUB-MENU DE DOCENTE-TITULAR
    public static void listarDocenteTitular() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Docentes-Titulares                    |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona docenteTitular: personas) {
            if (docenteTitular instanceof DocenteTitular) {
                i++;
                System.out.println(i + ": " + docenteTitular);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    // docente-titualr=examen de competencia y docente=titulo, años exper.. ,asignatura
    public static void anadirDocenteTitular() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        String asignatura;
        String titulo;
        int añosExperiencia;
        String examenCompetencia;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Docente-Titular                           |");
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
            System.out.print("Introduzca el Examen de Competencia: ");
            examenCompetencia = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            personas.add(new DocenteTitular(examenCompetencia,titulo,añosExperiencia ,asignatura,carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Docente-Titular completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void modificarDocenteTitular() {
        int id;
        DocenteTitular docenteTitular;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Docente-Titular                        |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente-Titular a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                docenteTitular = (DocenteTitular)personas.get(id);
                System.out.print("Modificar el Carnet de Identidad '" + docenteTitular.getCarnetIdentidad()+ "': ");
                docenteTitular.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + docenteTitular.getNombre() + "': ");
                docenteTitular.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(docenteTitular.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                docenteTitular.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar la Asignatura '" + docenteTitular.getAsignaturas()+ "': ");
                docenteTitular.setAsignaturas(entradaTeclado.readLine());
                System.out.print("Introduzca el Título del Docente: '"+ docenteTitular.getTitulo() + "': ");
                docenteTitular.setTitulo(entradaTeclado.readLine());
                System.out.println("Modificar Años de Experiencia: '" + docenteTitular.getAñosExperiencia()+"' : ");
                docenteTitular.setAñosExperiencia(Integer.parseInt(entradaTeclado.readLine()));
                System.out.print("Modificar Examen de Competencia '" + docenteTitular.getExamenCompetencia()+ "': ");
                docenteTitular.setExamenCompetencia(entradaTeclado.readLine());
                personas.set(id, docenteTitular);
                System.out.println("Registro de Docente-Titular modificado!");
            } else {
                System.out.println("El Registro del Docente-Titualr no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarDocenteTitular() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Docente-Titular                           |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente-Titular a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Docente-Titular borrado!");
            } else {
                System.out.println("El Registro de Docente-Titular no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    //FUNCIONES DE SUB-MENU DE DOCENTE-CONTRATO
    public static void listarDocenteContrato() {
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Listado de Docente-Contrato                      |");
        System.out.println("+==================================================+");
        int i = 0;
        for (Persona docenteContrato: personas) {
            if (docenteContrato instanceof DocenteTitular) {
                i++;
                System.out.println(i + ": " + docenteContrato);
            }
        }
        if (i == 0) {
            System.out.println("No existen registros");
        }
    }
    // docente-contrato=numero contrato y docente=titulo, años exper.. ,asignatura
    public static void anadirDocenteContrato() {
        String carnetIdentidad;
        String nombre;
        String fechaNacimiento;
        String asignatura;
        String titulo;
        int añosExperiencia;
        String numeroContrato;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        try {
            System.out.println("+==================================================+");
            System.out.println("| Añadir Docente-Contrato                          |");
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
            System.out.print("Introduzca el Numero de Contrato: ");
            numeroContrato = entradaTeclado.readLine();
            Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(fechaNacimiento);
            Calendar fechaNacimientoCalendario = Calendar.getInstance();
            fechaNacimientoCalendario.setTime(fechaNacimientoDate);
            personas.add(new DocenteContrato(numeroContrato,titulo,añosExperiencia ,asignatura,carnetIdentidad, nombre, fechaNacimientoCalendario));
            System.out.println("Registro de Docente-Contrato completado!");
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void modificarDocenteContrato() {
        int id;
        DocenteContrato docenteContrato;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Modificar Docente-Contrato                       |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente-Contrato a Modificar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                docenteContrato = (DocenteContrato)personas.get(id);
                System.out.print("Modificar el Carnet de Identidad '" + docenteContrato.getCarnetIdentidad()+ "': ");
                docenteContrato.setCarnetIdentidad(entradaTeclado.readLine());
                System.out.print("Modificar el Nombre '" + docenteContrato.getNombre() + "': ");
                docenteContrato.setNombre(entradaTeclado.readLine());
                System.out.print("Modificar la Fecha de Nacimiento '" + Utilitarios.getFechaCalendario(docenteContrato.getFechaNacimiento()) + "': ");
                Date fechaNacimientoDate = new SimpleDateFormat("yyyy-MM-dd").parse(entradaTeclado.readLine());
                Calendar fechaNacimientoCalendario = Calendar.getInstance();
                fechaNacimientoCalendario.setTime(fechaNacimientoDate);
                docenteContrato.setFechaNacimiento(fechaNacimientoCalendario);
                System.out.print("Modificar la Asignatura '" + docenteContrato.getAsignaturas()+ "': ");
                docenteContrato.setAsignaturas(entradaTeclado.readLine());
                System.out.print("Introduzca el Título del Docente: '"+ docenteContrato.getTitulo() + "' : ");
                docenteContrato.setTitulo(entradaTeclado.readLine());
                System.out.println("Modificar Años de Experiencia: '" + docenteContrato.getAñosExperiencia()+"' : ");
                docenteContrato.setAñosExperiencia(Integer.parseInt(entradaTeclado.readLine()));
                System.out.print("Modificar el Numero de Contrato '" + docenteContrato.getNumeroContrato()+ "': ");
                docenteContrato.setNumeroContrato(entradaTeclado.readLine());
                personas.set(id, docenteContrato);
                System.out.println("Registro de Docente-Contrato modificado!");
            } else {
                System.out.println("El Registro del Docente-Contrato no existe!");
            }
        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void borrarDocenteContrato() {
        int id;
        BufferedReader entradaTeclado = new BufferedReader(new InputStreamReader(System.in));
        
        limpiarConsola();
        System.out.println("+==================================================+");
        System.out.println("| Borrar Docente-Contrato                          |");
        System.out.println("+==================================================+");
        try {
            System.out.print("Introduzca el Id del Docente-Contrato a Borrar: ");
            id = buscarPersona(Integer.parseInt(entradaTeclado.readLine()));
            if (id > -1) {
                personas.remove(id);
                System.out.println("Registro de Docente-Contrato borrado!");
            } else {
                System.out.println("El Registro de Docente-Contrato no existe!");
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
