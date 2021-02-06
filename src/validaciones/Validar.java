package validaciones;

//import java.awt.event.KeyEvent;

public class Validar {

	public boolean validarEntrada(String cadena) {
		
		try {
			Integer.parseInt(cadena);
			return true;
		} 
		catch (NumberFormatException nfe) {
			return false;
		}
		
	}
	
	/*public void validarEntrada2(KeyEvent ke) {		
		char caracter = ke.getKeyChar();
		
	      // Verificar si la tecla pulsada no es un digito
	      if(((caracter < '0') || (caracter > '9')) && (caracter != '\b')){
	         ke.consume();  // ignorar el evento de teclado
	      }
	}*/
}
