package imagenPackage;
import java.awt.*;
import javax.swing.*;

public class MarcoImagen extends JFrame{

	public MarcoImagen() {
		setVisible(true); //defino que este marco sea visible
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //digo que cuando cierre la ventana el programa finalice
		
		setResizable(false); //para que el usuario no pueda modificar el tamaño de mi ventana
		
		setTitle("Mi primer ventana"); //para dar un titulo a la ventana
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit(); //devuelve el medio por donde estas ejecutando tu programa,
		//es decir, guardamos nuestro sistema nativo de ventanas en esta variable
		
		Dimension tamanioDeMiPantalla = miPantalla.getScreenSize(); //devuelve un objeto de tipo Dimension 
		//que nos proporciona el tamaño del monitor principal. import java.awt.*;
		
		int alturaPantalla = tamanioDeMiPantalla.height;
		
	    int anchoPantalla = tamanioDeMiPantalla.width;
	    
	    setBounds(anchoPantalla/4, alturaPantalla/4,500, 300); //(posicionX, posicionY, ancho, altura)
	    
	    LaminaConImagen lamina = new LaminaConImagen(); //creamos una lamina donde en ella va a estar la imagen
	    
	    add(lamina); //añado mi lamina al marco
	}
	
}
