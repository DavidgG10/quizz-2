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
public class Menu {
   private byte opc;
   
   public void mostrarMenu(){
      AgregarProducto r=new AgregarProducto();
      while(opc!=4){ 
         opc=Byte.parseByte(JOptionPane.showInputDialog(null,
                 "***MENÚ PRINCIPAL***\n\n"
                         + "1.Agregar producto\n"
                         + "2.Entrega Super\n"
                         + "3.Salir\n\n"
                         + "Digite su opción:"));
         switch(opc){
             case 1:{
                r.agregar();
                break;
             } 
             case 2:{
                r.infoSuper();
                break;
             }
             case 3:{
                System.exit(0);
                break;
             }
             default:{
                JOptionPane.showMessageDialog(null,"¡Opción incorrecta!");
             }
         }
      }
   }
}
