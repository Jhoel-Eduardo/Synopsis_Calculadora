package view;

import java.util.Scanner;

import constantes.Constantes;
import model.Division;
import model.Multiplicacion;
import model.Resta;
import model.Suma;
import model.TipoOperacion;
import validaciones.Validar;

public class Calculadora {

	public static void main(String[] args) {

		// Variables temporales
		String num1, num2;
		String opcionEscogida, op;

		TipoOperacion tp = new TipoOperacion();
		Validar validacion = new Validar();

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Escoga una opcion:");
			System.out.println("\t" + "a- Si desea sumar");
			System.out.println("\t" + "b- Si desea restar");
			System.out.println("\t" + "c- Si desea multiplicar");
			System.out.println("\t" + "d- Si desea dividir");
			System.out.println("");
			System.out.print("Respuesta: ");
			op = scanner.next();

			opcionEscogida = tp.TipoOperaciones(op);

			if (opcionEscogida.equals(Constantes.OPERACION_SUMA)) {

				System.out.println("Usted elgió la opción " + Constantes.OPERACION_SUMA);
				System.out.println(" ");
				System.out.println("Ingrese el primer número a sumar: ");

				num1 = scanner.next();

				if (validacion.validarEntrada(num1)) {

					System.out.println("Ingrese el segundo número a sumar: ");
					num2 = scanner.next();

					Suma suma = new Suma(Double.parseDouble(num1), Double.parseDouble(num2));
					System.out.println("El resultado de la suma es: " + suma.sumar());
				} else {
					num1 = "";
					System.out.println("");
					System.err.println("Favor, solo ingresar números!");
					System.out.println("Ingrese el primer número a sumar: ");

					num1 = scanner.next();

					System.out.println("Ingrese el segundo número a sumar: ");

					num2 = scanner.next();

					if (validacion.validarEntrada(num2)) {

						Suma suma = new Suma(Integer.parseInt(num1), Integer.parseInt(num2));
						System.out.println("El resultado de la suma es: " + suma.sumar());
					} else {
						System.out.println("Ingrese el segundo número a sumar: ");
						num2 = scanner.next();

						Suma suma = new Suma(Double.parseDouble(num1), Double.parseDouble(num2));
						System.out.println("El resultado de la suma es: " + suma.sumar());
					}
				}
			} else if (opcionEscogida.equals(Constantes.OPERACION_RESTA)) {

				System.out.println("Usted elgió la opción " + Constantes.OPERACION_RESTA);
				System.out.println(" ");
				System.out.println("Ingrese el primer número a restar: ");

				num1 = scanner.next();

				if (validacion.validarEntrada(num1)) {

					System.out.println("Ingrese el segundo número a restar: ");
					num2 = scanner.next();

					Resta resta = new Resta(Double.parseDouble(num1), Double.parseDouble(num2));
					System.out.println("El resultado de la resta es: " + resta.restar());
				} else {
					num1 = "";
					System.out.println("");
					System.err.println("Favor, solo ingresar números!");
					System.out.println("Ingrese el primer número a restar: ");

					num1 = scanner.next();

					System.out.println("Ingrese el segundo número a restar: ");

					num2 = scanner.next();

					if (validacion.validarEntrada(num2)) {

						Resta resta = new Resta(Double.parseDouble(num1), Double.parseDouble(num2));
						System.out.println("El resultado de la resta es: " + resta.restar());
					} else {
						System.out.println("Ingrese el segundo número a restar: ");
						num2 = scanner.next();

						Resta resta = new Resta(Double.parseDouble(num1), Double.parseDouble(num2));
						System.out.println("El resultado de la resta es: " + resta.restar());
					}
				}
			} else if (opcionEscogida.equals(Constantes.OPERACION_MULTIPLICACION)) {

				System.out.println("Usted elgió la opción " + Constantes.OPERACION_MULTIPLICACION);
				System.out.println(" ");
				System.out.println("Ingrese el primer número a multiplicar: ");

				num1 = scanner.next();

				if (validacion.validarEntrada(num1)) {

					System.out.println("Ingrese el segundo número a multiplicar: ");
					num2 = scanner.next();

					Multiplicacion multiplicacion = new Multiplicacion(Double.parseDouble(num1), Double.parseDouble(num2));
					System.out.println("El resultado de la multiplicación es: " + multiplicacion.multplicar());
				} else {
					num1 = "";
					System.out.println("");
					System.err.println("Favor, solo ingresar números!");
					System.out.println("Ingrese el primer número a multiplicar: ");

					num1 = scanner.next();

					System.out.println("Ingrese el segundo número a multiplicar: ");

					num2 = scanner.next();

					if (validacion.validarEntrada(num2)) {

						Multiplicacion multiplicacion = new Multiplicacion(Double.parseDouble(num1),
								Double.parseDouble(num2));
						System.out.println("El resultado de la multiplicación es: " + multiplicacion.multplicar());
					} else {
						System.out.println("Ingrese el segundo número a multiplicar: ");
						num2 = scanner.next();

						Multiplicacion multiplicacion = new Multiplicacion(Double.parseDouble(num1),
								Double.parseDouble(num2));
						System.out.println("El resultado de la multiplicación es: " + multiplicacion.multplicar());
					}
				}
			} else if (opcionEscogida.equals(Constantes.OPERACION_DIVISION)) {

				System.out.println("Usted elgió la opción " + Constantes.OPERACION_DIVISION);
				System.out.println(" ");
				System.out.println("Ingrese el primer número a dividir: ");

				num1 = scanner.next();

				if (validacion.validarEntrada(num1)) {

					System.out.println("Ingrese el segundo número a dividir: ");
					num2 = scanner.next();

					Division division = new Division(Double.parseDouble(num1), Double.parseDouble(num2));
					System.out.println("El resultado de la división es: " + division.dividir());
				} else {
					num1 = "";
					System.out.println("");
					System.err.println("Favor, solo ingresar números!");
					System.out.println("Ingrese el primer número a dividir: ");

					num1 = scanner.next();

					System.out.println("Ingrese el segundo número a dividir: ");

					num2 = scanner.next();

					if (validacion.validarEntrada(num2)) {

						Division division = new Division(Double.parseDouble(num1), Double.parseDouble(num2));
						System.out.println("El resultado de la división es: " + division.dividir());
					} else {
						System.out.println("Ingrese el segundo número a dividir: ");
						num2 = scanner.next();

						Division division = new Division(Double.parseDouble(num1), Double.parseDouble(num2));
						System.out.println("El resultado de la división es: " + division.dividir());
					}
				}
			} else {
				System.out.println("Usted a escogido una opción: " + Constantes.OPERACION_NULA);
			}
		}
	}
}
