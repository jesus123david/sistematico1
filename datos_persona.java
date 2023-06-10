package persona;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class datos_persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		persona_main dt_persona = new persona_main ();
		
		
		// nombre
		JOptionPane.showMessageDialog(null, "nuevo usuario creado, ¡BIENVENIDO USUARIO!" );
		JOptionPane.showInputDialog("por favor ingresa tu nombre, ¿Cual es tu nombre? ");
		dt_persona.setNombre(entrada.nextLine());
		
		// edad 
		JOptionPane.showInputDialog("por favor ingresa tu edad, ¿Cual es tu edad? ");
		dt_persona.setEdad(entrada.nextByte());
		
		
		// DNI
		JOptionPane.showInputDialog("por favor ingresa tu DNI, ¿Cual es tu DNI? ");
		dt_persona.setDNI(entrada.nextLine());
		
		// mostrar datos 
		JOptionPane.showMessageDialog(null, "SUS DATOS SON \n"+ dt_persona.getNombre() + dt_persona.getEdad()+ dt_persona.getDNI());
	}

}
