package imagenPackage;

import java.awt.*;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class LaminaConImagen extends JPanel{
	
	private Image imagen;
	
    public void paintComponent(Graphics g) { //creo una lamina para poder dibujar
    	
	  super.paintComponent(g);    //invocamos paintComponent de la clase Jcomponent 
	                            //me sirve para poder hacer funciones como colores de
	                            //fondo, tipos de letras, tamaño de letras, botones, etc.
	  /*
	   * 
	   IOException 
	   * 
	   */
	  try { //intento cargar la imagen que tengo en el escritorio
		  imagen=ImageIO.read(new File("C:/Users/raul/Desktop/circulo.png"));
		  }
	
		  catch(IOException e) {//si no lo encuentra...
			  System.out.println("no se encontro la imagen");
		  }
		
	  
	  /*
	   * 
	   RuntimeException 
	   * 
	   */
	  
	  if(imagen==null) {//si no pongo esto, cuando no halle una imagen, lo que va a pasar
		                //es que va a producirse una excepcion no comprobada: RuntimeException
		                //si bien hice el try y catch, si la imagen es nula las operaciones 
		                //que siguen a continuacion no las puedo hacer
		  
		  g.drawString("no podemos cargar la imagen",10,10);
	  }
	  else {
	  g.drawImage(imagen, 0, 0, null); //aca pinto la imagen, y le paso por parametros la imagen
	                                   //coordenadaX, coordenaY, y lo ultimo se refiere si queremos 
	                                   //informar a alguien sobre la conversion de la imagen
	  
	  int anchoImagen = imagen.getWidth(this); 
	  
	  int alturaImagen = imagen.getHeight(this);
	  
	  for(int i=0;i<10;i++) {//el ciclo for es para imprimir varias veces la imagen
		  
		  for(int j=0; j<10;j++) {
			  
			  if(i+j>0) {
				  
				  g.copyArea(0, 0, anchoImagen, alturaImagen, anchoImagen*i, alturaImagen*j);
				  //los dos primeros argumentos me dicen desde que punto empiezo a copiar
				  //los otros dos el ancho y alto que deseo copiar basandome en el punto
				  //inicial mencionado. Y los dos ultimos digo a que distancia quiero que 
				  //este la copia de mi imagen
			   }
		   }
	     }
	  }
   }
}
