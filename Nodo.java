//practica
package practica;

public class Nodo {
    private Alumno datos;
    private Nodo siguiente;
    
    public void enlazarA(Nodo siguiente){
        this.siguiente = siguiente;
    }
    
    public Nodo obtenerSiguiente(){
        return this.siguiente;
    }
    
    public Alumno getDatos() {
        return datos;
    }

    public void setDatos(Alumno datos) {
        this.datos = datos;
    }
    //Metodo para mostrar todos los datros de un alumno*************************
    public void listar(){
        datos.mostarDatos();
    }
    
    //metodos para obtener el codigo de un alumno en particular*****************
    public String obtenerCodigo() {
        String codigo = datos.getCodigo();
        return codigo;
    }
    
    //metodos para obtener el nombre de un alumno en particular*****************
    public String obtenerNombre(){
        String nombre = datos.getNombre();
        return nombre;
    }
    
    //metodos para obtener las 3 notas de un alumno en particular***************
    public int obtenerNota1(){
        int nombre = datos.getNota1();
        return nombre;
    }
    public int obtenerNota2(){
        int nombre = datos.getNota2();
        return nombre;
    }
    public int obtenerNota3(){
        int nombre = datos.getNota3();
        return nombre;
    }
    //**************************************************************************
    
    //metodos para cambiar notas********************************************+***
    public void cambiarNota1(int cambio){
        datos.setNota1(cambio);
        System.out.print("\nSe modifico la primera nota\n");
    }
    
    public void cambiarNota2(int cambio){
        datos.setNota2(cambio);
        System.out.print("\nSe modifico la segunda nota\n");
    }
    
    public void cambiarNota3(int cambio){
        datos.setNota3(cambio);
        System.out.print("\n**Se modifico la tercera nota**\n");
    }
    //**************************************************************************
    
    //metodo para cambiar nombre************************************************
    public void reenombrar(String nombre){
        datos.setNombre(nombre);
        System.out.print("\n**Se modifico el nombre**\n");
    }
    //**************************************************************************
    
    //metodo para mostrar las notas de un alumno en particular******************
    public void mostrarNotas(){
        datos.mostarNotasAlumno();
    }
    //**************************************************************************
    
}
