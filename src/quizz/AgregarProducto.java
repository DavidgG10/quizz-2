/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizz;
import javax.swing.JOptionPane;
/**
 *
 * @author David
 */
public class AgregarProducto {
   private Producto inventario[]=new Producto[6];  
   private SuperMercado info []=new SuperMercado[6];

   
   
   public void agregar(){
      int x;
      for(x=0;x<4;x++){
          Producto p=new Producto();  
          
          
          p.setAlimento(Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos productos de aliementacion va a agregar?: ")));
          p.setBebidas(Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantas productos de bebidas va a agregar?: ")));
          p.setLimpieza(Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos productos de limpieza va a agregar?: ")));
          p.setHigiene(Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos productos de higiene va a agregar?: ")));
          p.setnombre(JOptionPane.showInputDialog(null,"Digite el nombre del producto:"));
          p.setCantidad(Integer.parseInt (JOptionPane.showInputDialog(null,"Digite la cantidad del producto:")));
          p.setPrecio(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el precio del producto:")));
          p.setCodigo(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el codigo del producto: ")));
        
          inventario[x]=p;
}
   }
   public void infoSuper(){
     int x;
      for(x=0;x<4;x++){
          SuperMercado s=new SuperMercado();
          s.setNombreSuper(JOptionPane.showInputDialog(null,"Digite el nombre del SuperMercado:"));
          s.setEmpleadoEntrega(JOptionPane.showInputDialog(null,"Digite el nombre del Empleado que realiza la entrega:"));
          s.setCedulaEmpleado(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cedula del Empleado que realiza la entrega:")));
          s.setCodigoSuper(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el codigo del SuperMercado: ")));
          info[x]=s;
    
}
}
    }



   

