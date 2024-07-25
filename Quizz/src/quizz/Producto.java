/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizz;

/**
 *
 * @author David
 */
public class Producto {
    private int codigo;
    private String nombre;
    private String empleado;
    private int cedula;
    private int cantidad;
    private double precioBase;
    private double precioBruto;
    private int alimento;
    private int bebidas;
    private int higiene;
    private int limpieza;
    private double gananciaEsperada;

    public Producto() {
       
        this.cantidad = 0;
        this.precioBase = 0.00;
    }

    public Producto(int codigo, String nombre, String empleado, int cedula,String tipo,double gananciaEsperada, double precioBruto, int alimento,int bebidas, int higiene,int limpieza) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.empleado = empleado;
        this.cedula = cedula;
        this.gananciaEsperada=0;
        this.precioBruto=0;
        this.alimento=alimento;
        this.bebidas=bebidas;
        this.higiene=higiene;
        this.limpieza=limpieza;
        
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precioBase;
    }

    public void setPrecio(double precio) {
        this.precioBase = precio;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getAlimento() {
        return alimento;
    }

    public void setAlimento(int alimento) {
        this.alimento = alimento;
    }

    public int getBebidas() {
        return bebidas;
    }

    public void setBebidas(int bebidas) {
        this.bebidas = bebidas;
    }

    public int getHigiene() {
        return higiene;
    }

    public void setHigiene(int higiene) {
        this.higiene = higiene;
    }

    public int getLimpieza() {
        return limpieza;
    }

    public void setLimpieza(int limpieza) {
        this.limpieza = limpieza;
    }
    

    public double getGananciaEsperada() {
        return gananciaEsperada;
    }

    public void setGananciaEsperada(double gananciaEsperada) {
        this.gananciaEsperada = precioBase-precioBruto*cantidad;
    }

    public void setPrecioBruto(double precioBruto) {
        this.precioBruto = 0;
        if (alimento > 0) {
            precioBruto += precioBase * 0.20 + precioBase;
            if (bebidas > 0) {
                precioBruto += precioBase * 0.30 + precioBase;
                if (higiene > 0) {
                    precioBruto += precioBase * 0.25 + precioBase + 500;
                    if (limpieza > 0) {
                        precioBruto += precioBase * 0.19 + precioBase * 0.04 + 1000 + precioBase;
                    }
                }
            }
        }

    }
    

    void setnombre(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}


