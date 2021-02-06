package model;

import constantes.Constantes;

public class TipoOperacion {

	private String tipoOperacion;
	
	public String TipoOperaciones(String op) {
		
		if( op.equals("a") ) {
			tipoOperacion = Constantes.OPERACION_SUMA;
//			System.out.println("Usted escogió la opción de suma");
			return tipoOperacion;
		}
		else if( op.equals("b") ) {
			tipoOperacion = Constantes.OPERACION_RESTA;
//			System.out.println("Usted escogió la opción de resta");
			return tipoOperacion;
		}
		else if( op.equals("c") ) {
			tipoOperacion = Constantes.OPERACION_MULTIPLICACION;
//			System.out.println("Usted escogió la opción de multiplicación");
			return tipoOperacion;
		}
		else if( op.equals("d") ){
			tipoOperacion = Constantes.OPERACION_DIVISION;
//			System.out.println("Usted escogió la opción de división");
			return tipoOperacion;
		}
		else {
//			System.out.println("El valor indicado no esta contemplado en las opciones");
			tipoOperacion = Constantes.OPERACION_NULA;
			return tipoOperacion;
		}
	}
}
