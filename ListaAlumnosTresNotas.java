//practica
package practica;

import java.util.Scanner;

public class ListaAlumnosTresNotas {
    static Scanner teclado = new Scanner(System.in);
    static Alumno alu;
    private Nodo inicio;
    private int tamaño;
    
    public boolean estaVacia(){
        return inicio == null;
    }
    
    public int getTamaño(){
        return tamaño;
    }
    
//    public void ingresarInicio(Alumno valor){
//        Nodo nuevo = new Nodo();
//        nuevo.setDatos(valor);
//        if (estaVacia()){
//           inicio = nuevo;
//        }else{
//            nuevo.enlazarA(inicio);
//            inicio = nuevo;
//        }
//        tamaño++;
//    }
    
    public void ingresarFinal(Alumno valor) {
        Nodo nuevo = new Nodo();
        nuevo.setDatos(valor);
        if (estaVacia()) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            //leer mejor
            while (aux.obtenerSiguiente()!= null) {
                aux = aux.obtenerSiguiente();
            }
            //leer
            aux.enlazarA(nuevo);
        }
        tamaño++;
    }
    
    public void mostrar(){
        int contador = 0; 
        Nodo temp;
        temp = inicio;
        if (estaVacia()){
            System.out.println("No hay alumnos");
        }else{
            while (contador < tamaño){
//            System.out.print("["+ temp.listar() +"] ->");
            temp.listar();
            temp = temp.obtenerSiguiente();   
            contador++;
            }
        }
    }
    
    //algoritmo creado por mi **************************************************
    public void eliminar(String codigo){
        int contador = 0;
        int contadorPos = 0;
        int aux = 0;
        Nodo temp = inicio;
        Nodo naux = inicio;
        if(estaVacia()){
            System.out.println("La lista esta vacia");
        }else{
            while (contador < tamaño){
                if(temp.obtenerCodigo().equals(codigo)){
                    aux = contador;
                    System.out.println("Se elimino correctamente... ");
                    break;
                }
                temp = temp.obtenerSiguiente();
                contador++;
            }
            while(contadorPos < aux-1){
                naux = naux.obtenerSiguiente();
                contadorPos++;
            }
            naux.enlazarA(temp.obtenerSiguiente());
            tamaño--;
        }
    }
//    //**************************************************************************
//    
//    public void borrarAlumno(String codigo){
//        int contador = 0;
//        Nodo temp , anterior;
//        temp= inicio ;
//        anterior = null;
//        while (contador < tamaño){
//            if (temp.obtenerCodigo().equals(codigo)){
//                
//                if (temp == inicio){
//                    inicio = inicio.obtenerSiguiente();
//                    break;
//                }
//                
//                System.out.println("**Se elimina a : "+temp.getDatos()+" **");
//                anterior.enlazarA(temp.obtenerSiguiente());
//                
//            }
//            anterior = temp;
//            temp = temp.obtenerSiguiente();
//            
//            contador++;
//        }
//        tamaño--;
//    }
    
    public void eliminarUltimo(){
        int contador = 0;
        Nodo temp ;
        temp= inicio ;
        while (contador < tamaño-1){
            temp = temp.obtenerSiguiente();
            contador++;
        }
         temp.enlazarA(null);
        System.out.println("se elimino correctamente....");
        tamaño--;
    }
    //metodo para bustar un alumno**********************************************
    public void buscar(String codigo){
        int contador = 0;
        Nodo temp;
        temp = inicio;
        while(contador<tamaño){
            if (temp.obtenerCodigo().equals(codigo)){
                System.out.println("\nBusqueda exitosa ..... ");
                System.out.println("resultados \n");
                temp.listar();
                break;
            }
            temp = temp.obtenerSiguiente();
            contador++;
        }
        
    }
    //metodo para ordenar alumnos alfaveticamente por su nombre*****************
    public void ordenarNombre(){
        int contador1 = 0;
        int contador2 = 0;
        Nodo temp1 = inicio;
        Nodo temp2 = inicio;
   
        while(contador1 < tamaño){
            while(contador2 < tamaño && contador2 != contador1){
                //si tamp1 es va antes que temp2 debuelve un valormneor a 0(entra al if )
                if ((temp1.obtenerNombre()).compareToIgnoreCase(temp2.obtenerNombre()) < 0){
                    //hacer un cambio de posicion
                    System.out.println("entro al if");
                    Nodo aux = temp1;
                    Nodo aux2 = temp2;
                    
                   temp1.setDatos(aux2.getDatos());
                   temp2.setDatos(aux.getDatos());
//                   aux.enlazarA(temp1.obtenerSiguiente());
                    
                }
                System.out.println("entro bucle");
                contador2++;
                temp2 = temp2.obtenerSiguiente();
            }
            temp1 = temp1.obtenerSiguiente();
            contador1++;
        }
    }
    
    public void cambiarNombre(String codigo, String nombre){
        int contador = 0;
        Nodo temp = inicio;
        if(estaVacia()){
            System.out.println("La lista esta vacia");
        }else{
            while (contador < tamaño){
                if(temp.obtenerCodigo().equals(codigo)){
                    temp.reenombrar(nombre);
                    break;
                }
                temp = temp.obtenerSiguiente();
                contador++;
            }
        }
    }
    
    public void cambiarNota(String codigo){
        int contador = 0;
        Nodo temp = inicio;
       
        if(estaVacia()){
            System.out.println("La lista esta vacia");
        }else{
            while (contador < tamaño){
                if(temp.obtenerCodigo().equals(codigo)){
                    //mostramos las 3 notas del alumno
                    temp.mostrarNotas();
                    Byte dato;
                   do{ 
                    System.out.print("\n¿que nota decea modificar? "
                            + "\n[1]primeria nota"
                            + "\n[2]segunda nota"
                            + "\n[3]tercera nota"
                            + "\n[0]salir");
                       System.out.print("\nIngrese una opcion : ");
                     dato = teclado.nextByte(); 
                    
                    switch(dato){
                        case 1: 
                            temp.cambiarNota1(pedirNota());
                        break;
                        
                        case 2: 
                            temp.cambiarNota2(pedirNota());
                        break;
                        
                        case 3: 
                            temp.cambiarNota3(pedirNota());
                        break;
                        case 0:
                            //cancela el camnio
                            break;
                            
                        default:System.out.println("Ingrese una opcion correcta");
                    }
                   }while(dato != 0);
                }
                temp = temp.obtenerSiguiente();
                contador++;
            }
        }
    }
    
    public Byte pedirNota(){
        Byte nota;
        do{
            System.out.print("Ingrese nueva nota:");
            nota= teclado.nextByte();
            if (nota > 20 || nota < 0){
                System.out.println("**rellene el espacio**");
            }
        }while(nota>20 || nota < 0);
        return  nota;
    }
    
    
}
