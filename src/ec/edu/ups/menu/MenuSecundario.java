/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.menu;

import java.awt.*;

/**
 *
 * @author Dutan2000
 */
public class MenuSecundario {
    public static void main(String []args){
        //Frame  
        Frame miventana=new Frame();
        miventana.setTitle("Practica de laboratorio 04 ");
        miventana.setSize(600,400);
        
       //borderlayout
       GridLayout layout=new GridLayout(5, 1);
       
       //panel General con un borderlayout
       Panel panelGeneral=new Panel(layout);
        
       //declarar botones 
       Button boton1=new Button("Registrar");
       Button boton2=new Button("Borrar");
       Button boton3 =new Button("Modificar");
       Button boton4=new Button("Buscar telefono");
       Button boton5=new Button("Listar Telefonos");
       
       //agrgar botones al panel secudario
       panelGeneral.add(boton1);
       panelGeneral.add(boton2);
       panelGeneral.add(boton3);
       panelGeneral.add(boton4);
       panelGeneral.add(boton5);
       
       //agregar panel secundario al panel principal 
      

       
       miventana.add(panelGeneral);
       miventana.setVisible(true);
       
       
       
    }
}
