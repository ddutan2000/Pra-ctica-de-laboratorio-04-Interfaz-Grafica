# Practica-de-laboratorio-04-Interfaz-Grafica
Crea interfaces gráficas de usuario empleando técnicas de modelado de objetos.


    package ec.edu.ups.menu;
**Import**

impportamos todas las clases awt para poder hacer nuestra ventana de menu.

    import java.awt.*;
@author Dutan2000

    public class Telefono {
      public static void main(String []args){

 **Frame** 
 
primero se crea un marco para poder guardar todos nuestro botones y paneles dentro del el. Para esto creamos una new Frame() y dentro de este marco vamos a añadir nuestros botones y paneles para que usuario pueda interactuar con el menu.  
 
        Frame miventana=new Frame();
       
Con los diversos metodos que tiene la clase Frame usuamos .setTitle y .setSize para nombrar el marco y para establecer un tamaño en especifico 

        miventana.setTitle("Telefono ");
        miventana.setSize(600,400);
        
**GridLayout** 

Creamos un new GridLayout() para que ordene nuestro menu en forma de tabla. En este caso el GridLayout necesita dos valores dentro de sus parametros para poder crear la tabla. de los valores que se ingresan dentro de los parentesis, el primero valor representa en numero de filas y el segundo valor representa el numero de columnas.    

       GridLayout layout=new GridLayout(5, 1);
       
**Panel** 

Ya que establecimos como queremos que ordenemos nuestro menu debemos crear un panel. Ahora recordemos que la manera en la que queremos que nuestro menu se ordene no esta incoporado todavia asi que anadimos el GridLayout al momento que se instancia el panel

       Panel panelGeneral=new Panel(layout);

**Botones** 

Nuestro menu debe tener diversas opciones, asi que dependiendo de cuantas opciones se va a necesitar seguimo creando new Button()
para no confundirnos al momento de vidualizar el boton en la interface podemos nombrar nuestros botones para poder identificarlos mas facilmente. La clase Button permite que se ingrese un string en sus parametros para poder nombrar al boton. 

       Button boton1=new Button("Registrar");
       Button boton2=new Button("Borrar");
       Button boton3 =new Button("Modificar");
       Button boton4=new Button("Buscar telefono");
       Button boton5=new Button("Listar Telefonos");
       
Ya que tenemos creados los botones y el panel debemos añadir todos los botones dentro del panel con el metodo .add(). 
PRECAUCION: El orden en el que se ingresan los botones es el orden en la que usuario visualizara los botones en el menu. 

       panelGeneral.add(boton1);
       panelGeneral.add(boton2);
       panelGeneral.add(boton3);
       panelGeneral.add(boton4);
       panelGeneral.add(boton5);
       
Ya que ingresamos nuestros botones en el orden que ceremos que se visualizen en nuestro panel. Lo ultimo que nos faltaria es ingresar nuestro panel dentro de nuestro marco. la clase Frame tambien tiene metodo .add() asi que utilizaremos el metodo para añadir nuestro panel. 
Algo muy importante que no se debe olvidar es permitir que el usuario los visualize, porque si coremos el programa ninguna ventana se desplazara. Para esto utilizamos el metodo .setVisible() que permite que el usuario visualize la ventana. Dentro de los parametros de este metodo se ingresa un nollean la cual si es "true" permite visualizar la ventana, caso contraior no se visualizara nada. 

       miventana.add(panelGeneral);
       miventana.setVisible(true);
       
