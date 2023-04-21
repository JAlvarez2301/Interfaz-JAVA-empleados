/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_interfaces_tema16;

/**
 *
 * @author Usuario
 */
public abstract class Empleado_Recibo extends Empleado {

    /**
     *
     * @return
     */
   private String recibo;

    public void setRecibo(String recibo) {
        this.recibo = recibo;
    }

    public String getRecibo() {
        return recibo;
    }

    @Override
    public String imprimirReciboPago() {
                return "INFORME DEL TRABAJADOR" + "\n" 
                + "----------------------" + "\n" 
                + "                       " + "\n" 
                + "Datos del Empleado" + "\n" 
                + "Nombres: " + super.getNombre() + "\n" 
                + "Apellidos: " + super.getApellido() + "\n" 
                + "DNI: " + super.getDni() + "\n" 
                + "Edad: " + super.getEdad() + "\n" 
                + "Dirección: " + super.getDireccion() + "\n" 
                + "Formación Academica: " + super.getFormacionAcademica() + "\n" 
                + "Años de experiencia: " + super.getAñosExperiencia() + "\n" 
                + "                        " + "\n" 
                + "Resumen de Pago " +this.recibo+ "\n" 
                + "Sueldo Bruto: S/ " + sueldoBruto() + "\n" 
                + "Horas Extras: " + cant_horas_extras() + "\n" 
                + "Pago por horas Extras: S/ " + horasExtras() + "\n" 
                + "Sueldo Neto: S/ " + sueldoNeto(); 
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
       double sueldoBruto = sueldoBruto();
       double horasExtras = horasExtras();
       sueldoNeto = sueldoBruto+horasExtras;
        return sueldoNeto;
      
    }


}