package app;

import java.util.List;
import java.util.Scanner;

public class GestorEmpleados {
	
	private Plantilla plantilla = new Plantilla();
	private IEntradaSalida consola = new Consola();
	
	public GestorEmpleados(Plantilla plantilla, IEntradaSalida consola) {
		this.plantilla=plantilla;
		this.consola=consola;
	}
	
	public void ejecutar() {
		Scanner sc = new Scanner(System.in);
		String opcion="";
		
		do {
			consola.mostrarMenu();
			opcion=sc.nextLine();
			
			switch (opcion) {
				case "1"-> {
					contratarEmpleado();
				}
				case "2"->{
					listarTodos();
				}
				case"3"->{
					listarPorFiltro();
				}
				case"4"->{
					consola.limpiarPantalla();
					
				}
				default->{
					consola.imprimir("Opción no válida");
				}
			}
		}while(!opcion.equals("4"));
		
	}
	
	private void contratarEmpleado() {
		Scanner sc = new Scanner(System.in);
		String opcion2="";
		
//		String dni, nombre, apellidos;
//		double sueldoBase;
//		int categoria;
		consola.imprimirLinea("Qué tipo de empleado quiere contratar: \n1 - Técnico\\n 2 - Comercial\n");
		switch(opcion2) {
			case "1"->{
				//solicitar datos Técnico
				consola.imprimirLinea("Introduce los datos del Técnico: ");
				//Empleado tecnico = new Tecnico(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextInt());
//				consola.imprimir("DNI: ");
//				dni = sc.nextLine();
//				consola.imprimir("Nombre: ");
//				nombre = sc.nextLine();
//				consola.imprimir("Apellidos: ");
//				apellidos = sc.nextLine();
//				consola.imprimir("Sueldo base: ");
//				sueldoBase = sc.nextDouble();
//				consola.imprimir("Categoría: ");
//				categoria = sc.nextInt();
				
			}
			case "2"->{
				//solicitar datos Comercial
				consola.imprimirLinea("Introduce los datos del Comercial: ");
				consola.imprimir("DNI: ");
			}
			default->{
				consola.imprimir("Opción no válida");
			}
		}
	}
	
	private void listarTodos() {
		
	}
	
	private void listarPorFiltro() {
		Scanner sc = new Scanner(System.in);
		
		consola.imprimirLinea("Introduce un nombre o apellido para filtrar empleados: ");
		plantilla.getEmpleadoPorNombre(sc.nextLine());
		
		//listarEmpleados(empleados);
	
	}
	
	private void listarEmpleados(List<Empleado> empleados) {
		
		System.out.println(empleados);
	}
	
	private void ordenarPorNombre(List<Empleado> empleados) {
		
	}
}
