package model;

public class Division {

	public double num1;
	public double num2;

	public Division(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	/**
	 * Este método te permitirá hacer restas Gozu...!!!
	 * */
	public Double dividir() {

		return num1 / num2;
	}
}
