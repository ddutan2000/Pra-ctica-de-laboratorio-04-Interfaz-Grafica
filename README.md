# Practica-de-laboratorio-04-Interfaz-Grafica
Crea interfaces gráficas de usuario empleando técnicas de modelado de objetos.


    package ec.edu.ups.menu;
**Import**

importamos todas las clases awt para poder crear nuestra ventana de menú.

    import java.awt.*;
@author Dutan2000

    public class Telefono {
      public static void main(String []args){

 **Frame** 
 
primero se crea un marco para poder guardar todos nuestro botones y paneles dentro del el. Para esto creamos un new Frame() y dentro de este marco vamos a añadir nuestros botones y paneles para que usuario pueda interactuar con el menú.  
 
        Frame miventana=new Frame();
       
Con los diversos métodos que tiene la clase Frame usamos .setTitle y .setSize para nombrar el marco y para establecer un tamaño en especifico del marco.

        miventana.setTitle("Telefono ");
        miventana.setSize(600,400);
        
**GridLayout** 

Creamos un new GridLayout () para que ordene nuestro menú en forma de tabla. En este caso el GridLayout necesita dos valores dentro de sus parámetros para poder crear la tabla. Los valores que se ingresan dentro de los paréntesis definen los siguiente: el primero valor representa en numero de filas y el segundo valor representa el numero de columnas.    

       GridLayout layout=new GridLayout(5, 1);
       
**Panel** 

Ya que establecimos como queremos que ordenemos nuestro menú debemos crear un panel. Ahora recordemos que la manera en la que queremos que nuestro menú se ordene no esta incorporado todavía así que añadimos el GridLayout al momento que se instancia el panel

       Panel panelGeneral=new Panel(layout);

**Botones** 

Nuestro menú debe tener diversas opciones, así que dependiendo de cuantas opciones se va a necesitar seguimos creando new Button() para no confundirnos al momento de visualizar el botón en la interface podemos nombrar nuestros botones para poder identificarlos mas fácilmente. La clase Button permite que se ingrese un string en sus parámetros para poder nombrar al botón.

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
       
Ya que ingresamos nuestros botones en el orden que queremos que se visualicen en nuestro panel. Lo ultimo que nos faltaría es ingresar nuestro panel dentro de nuestro marco. la clase Frame también tiene metodo .add() así que utilizaremos el metodo para añadir nuestro panel. Algo muy importante que no se debe olvidar es permitir que el usuario los visualice, porque si corremos el programa ninguna ventana se desplazara. Para esto utilizamos el metodo .setVisible() que permite que el usuario visualice la ventana. Dentro de los parámetros de este metodo se ingresa un bolean la cual si es "true" permite visualizar la ventana, caso contrario no se visualizará nada. 

       miventana.add(panelGeneral);
       miventana.setVisible(true);
       
