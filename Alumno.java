//practica 
package practica;

public class Alumno {
    private String codigo;
    private String nombre;
    private int nota1;
    private int nota2;
    private int nota3;

    public Alumno(String codigo, String nombre, int nota1, int nota2, int nota3) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public Alumno() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }
    
    public void mostarDatos(){
        System.out.print("["+nombre+" , "+codigo+" , "+nota1+" , "+nota2+" , "+nota3+"] ->");
    }
    public void mostarNotasAlumno(){
        System.out.println("\nEstas son las notas del alumno "+nombre+ " -> "+nota1+" , "+nota2+" , "+nota3);
        
    }
}
