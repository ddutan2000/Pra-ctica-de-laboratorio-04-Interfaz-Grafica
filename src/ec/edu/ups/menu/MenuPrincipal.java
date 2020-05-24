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
public class MenuPrincipal {
    public static void main(String []args){
        //creamos marco
        Frame marco=new Frame();
        marco.setTitle("Menu");
        marco.setSize(600,400);
        
        //creamos gridLayout
        GridLayout layout=new GridLayout(3, 1);
        
        //creamos panel principal con parametros de gridLayout
        Panel panelPrincipal=new Panel(layout);
        
        //creamos botones
        Button boton1=new Button("Iniciar Sesion");
        Button boton2=new Button("Registrarse");
        Button boton3=new Button("Mas");
        
        //agregar botones a panel
        panelPrincipal.add(boton1);
        panelPrincipal.add(boton2);
        panelPrincipal.add(boton3);
        
        //agregar panel a marco 
        marco.add(panelPrincipal);
        marco.setVisible(true);
        
        
        
                
    }
}
