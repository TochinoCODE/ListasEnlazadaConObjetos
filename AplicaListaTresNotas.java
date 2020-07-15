//practica
package practica;

import java.util.Scanner;


public class AplicaListaTresNotas {
    static Scanner teclado = new Scanner(System.in);
    static ListaAlumnosTresNotas lista = new ListaAlumnosTresNotas();
    static Nodo nodo;
    public static void main(String[] args) {
        menu();
    }
    
    static void menu() {
        int opcion;

        do {
            System.out.println("\n\nMenú de Opciones");
            System.out.println("==================================");
            System.out.println("[1] Insertar final alumno");
            System.out.println("[2] Mostrar lista de alumnos");
            System.out.println("[3] Buscar alumno");
            System.out.println("[4] Eliminar Alumno");
            System.out.println("[5] Modificar nombre");
            System.out.println("[6] Modificar nota ");
            System.out.println("[7] Ordenar Alumnos por orden afabertico");
            System.out.println("===================================");
            System.out.println("[0] Salir de la Aplicación");

            System.out.print("Ingrese una Opción : ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    ingreso(pedirDatos());
                    break;
                case 2:
                    lista.mostrar();
                    break;
                case 3:
                    lista.buscar(pedirCodigoBusqueda());
                    break;
                case 4:
                    lista.eliminarUltimo();
                    break;
                case 5:
                    lista.cambiarNombre(pedirCodigoBusqueda(),pedirNombre());
                    break;
                case 6:
                    lista.cambiarNota(pedirCodigoBusqueda());
                    break;
                case 7:
                    lista.ordenarNombre();
                    break;
                case 0:
                    System.exit(0);
                    break;
                    default:System.out.println("Ingrese opcion valida ");
            }

        } while (opcion != 0);
    }

    static void ingreso(Alumno valor) {
//        lista.ingresarInicio(valor);
        lista.ingresarFinal(valor);
    }

    static Alumno pedirDatos() {
        //aqui se usa el constructor de la clase Alumno
        Alumno persona = new Alumno(pedirCodigo(), pedirNombre(), pedirNota(), pedirNota(), pedirNota());
        
        return persona;
    }
    
    static String pedirCodigo(){
        String codigo;
        do {
            System.out.print("Ingrese codigo del estudiante : ");
            teclado.nextLine();
            codigo = teclado.nextLine();
            if(codigo.equals("")){
                System.out.println("Rellene los campos");
            }
        }while (codigo.equals(""));
        return codigo;
        
    }
    
    static String pedirCodigoBusqueda(){
        String codigo;
        do{
        System.out.print("*Buscando alumno por codigo* Ingrese codigo : ");
           teclado.nextLine();
        codigo = teclado.nextLine();
        if(codigo.equals("")){
            System.out.println("**Rellene los campos**");
        }
        }while(codigo.equals(""));
        
        return codigo;
    }
    
    static String pedirNombre(){
        String nombre;
        do {
            System.out.print("Ingrese Nombre del estudiante : ");
            nombre = teclado.nextLine();
            if(nombre.equals("")){
                System.out.println("**Rellene los campos**");
            }
        }while (nombre.equals(""));
        return nombre;
    }
    
    static Byte pedirNota(){
    byte nota;
    do{
             System.out.print("Ingrese nota del alumno : ");
           nota = teclado.nextByte();
           if (nota > 20 || nota < 0){
               System.out.println("**El rango de notas es de 0 a 20**");
           }
           }while(nota > 20 || nota < 0);
    return nota;
    
}
    
    
}
