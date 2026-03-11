package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Consola implements IEntradaSalida{
	
	private Scanner sc;
	
	public Consola() {
		this.sc=sc;
	}
	
	public void imprimir(String texto) {
		System.out.println(texto);
	}
	
	public void imprimirLinea(String texto) {
		System.out.println(sc.nextLine());
	}
	
	public String leerTexto(String mensaje) {
		return sc.nextLine();
	}
	
	public int leerEntero(String mensaje) {
		int value=0;
		boolean error;
		
		do {
			try{
				value = sc.nextInt();
				error = false;
			}catch (InputMismatchException e) {
				System.err.println("El número introducido no es un entero válido");
				error = true;
			}
		}while(error);
		
		return value;
		
	}
	
	public double leerImporte(String mensaje) {
		double value=0;
		boolean error;
		
		do {
			try {
				value = (double)sc.nextInt();
				error = false;
			}catch (InputMismatchException e) {
				System.err.println("El número introducido no es válido.");
				error = true;
			}
		}while (error);
		
		return value;
	}
	
	public void mostrarMenu() {
		System.out.println("1 - Contratar empleado");
		System.out.println("2 - Listar todos los empleados");
		System.out.println("3 - Listar empleados con filtro");
		System.out.println("4 - Salir");
	}
	
	public void limpiarPantalla() {
		for (int i=1;i==50;i++) {
			System.out.println("");
		}
	}
	
	public void pausa() {		
		System.out.println("Pulse una tecla para continuar...");
		sc.next();
	}
	
}
