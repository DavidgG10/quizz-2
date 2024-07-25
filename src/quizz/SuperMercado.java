/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizz;

/**
 *
 * @author David
 */
public class SuperMercado {
   private String nombreSuper;
   private int codigoSuper;
   private String empleadoEntrega;
   private int cedulaEmpleado;

    public SuperMercado() {
        this.codigoSuper = 0;
        this.cedulaEmpleado = 0;
      
    }

    public SuperMercado(String nombreSuper, String empleadoEntrega) {
        this.nombreSuper = nombreSuper;
        this.empleadoEntrega = empleadoEntrega;
    }

    public String getNombreSuper() {
        return nombreSuper;
    }

    public void setNombreSuper(String nombreSuper) {
        this.nombreSuper = nombreSuper;
    }

    public int getCodigoSuper() {
        return codigoSuper;
    }

    public void setCodigoSuper(int codigoSuper) {
        this.codigoSuper = codigoSuper;
    }

    public String getEmpleadoEntrega() {
        return empleadoEntrega;
    }

    public void setEmpleadoEntrega(String empleadoEntrega) {
        this.empleadoEntrega = empleadoEntrega;
    }

    public int getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(int cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }
   
}
