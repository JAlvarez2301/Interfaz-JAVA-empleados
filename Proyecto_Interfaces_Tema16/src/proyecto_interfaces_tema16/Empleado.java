package proyecto_interfaces_tema16;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Usuario
 */
public abstract class Empleado {

    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private int edad;
    private String formacionAcademica;
    private int añosExperiencia;
    private int horas_trabajadas;
    private int pagoPorHora;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String dni, String direccion, int edad, String formacionAcademica, int añosExperiencia, int horas_trabajadas, int pagoPorHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.edad = edad;
        this.formacionAcademica = formacionAcademica;
        this.añosExperiencia = añosExperiencia;
        this.horas_trabajadas = horas_trabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEdad() {
        return edad;
    }

    public String getFormacionAcademica() {
        return formacionAcademica;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public int getPagoPorHora() {
        return pagoPorHora;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFormacionAcademica(String formacionAcademica) {
        this.formacionAcademica = formacionAcademica;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public void setPagoPorHora(int pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

        public abstract String imprimirReciboPago(); 
    public abstract int horasExtras(); 
    public abstract int cant_horas_extras(); 
    public abstract double sueldoBruto(); 
    public abstract double sueldoNeto();  
}
