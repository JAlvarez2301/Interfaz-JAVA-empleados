/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_interfaces_tema16;

/**
 *
 * @author Usuario
 */
public abstract class InformeEmpleado extends Empleado {
    private int cant_hijos; 
private String hacienda;  
private String rentencion; 

    public InformeEmpleado(int cant_hijos, String hacienda, String rentencion) {
        this.cant_hijos = cant_hijos;
        this.hacienda = hacienda;
        this.rentencion = rentencion;
    }

    public InformeEmpleado(int cant_hijos, String hacienda, String rentencion, String nombre, String apellido, String dni, String direccion, int edad, String formacionAcademica, int añosExperiencia, int horas_trabajadas, int pagoPorHora) {
        super(nombre, apellido, dni, direccion, edad, formacionAcademica, añosExperiencia, horas_trabajadas, pagoPorHora);
        this.cant_hijos = cant_hijos;
        this.hacienda = hacienda;
        this.rentencion = rentencion;
    }

    public InformeEmpleado() {
    }

    public void setCant_hijos(int cant_hijos) {
        this.cant_hijos = cant_hijos;
    }

    public void setHacienda(String hacienda) {
        this.hacienda = hacienda;
    }

    public void setRentencion(String rentencion) {
        this.rentencion = rentencion;
    }

    public int getCant_hijos() {
        return cant_hijos;
    }

    public String getHacienda() {
        return hacienda;
    }

    public String getRentencion() {
        return rentencion;
    }


       @Override
    public int horasExtras() {
       return super.getPagoPorHora()*2;
        
    }

    @Override
    public int cant_horas_extras() {
        int horasExtras = 0;
       if(super.getHoras_trabajadas()>40){
           horasExtras++;
       }
       return horasExtras;
    }

    @Override
    public double sueldoBruto() {
       return super.getHoras_trabajadas()*super.getPagoPorHora();
    }

    @Override
    public double sueldoNeto() {
       double sueldoNeto = 0; //Tengo que hacerlo
        return sueldoNeto;
        
    }

    private double pension(){
        if( Integer.parseInt(rentencion) ==2.5){
            return sueldoBruto()*0.0025;
        } else if(Integer.parseInt(rentencion) == 1.5){
            return sueldoBruto()*0.0015;
        } else {
            return 0;
        }
    }
    private double bonoHijos(){
        double bonoHijos = 0;
        if(cant_hijos == 1 || cant_hijos ==2){
            bonoHijos = 0.035;
            return bonoHijos;
        } else if(cant_hijos >=3 || cant_hijos <=4){
            return bonoHijos = 0.05;
        } else if(cant_hijos >=6){
            return bonoHijos = 0.075;
        }else{
            return bonoHijos = 0;
        }
    }
}