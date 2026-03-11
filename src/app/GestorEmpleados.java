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
				String opcion2="";
				consola.imprimirLinea("Qué tipo de empleado quiere contratar: \n1 - Técnico\\n 2 - Comercial\n");
				switch(opcion2) {
				case "1"->{
					//solicitar datos Técnico
				}
				case "2"->{
					//solicitar datos Comercial
				}
				default->{
					consola.imprimir("Opción no válida");
				}
				}
			}
			case "2"->{
				
			}
			case"3"->{
				consola.imprimirLinea("Introduce un nombre o apellido para filtrar empleados: ");
				plantilla.getEmpleadoPorNombre("");
			}
			case"4"->{
				
			}
			default->{
				consola.imprimir("Opción no válida");
			}
			}
		}while(!opcion.equals("4"));
		
	}
	
	private void contratarEmpleado() {
		
	}
	
	private void listarTodos() {
		
	}
	
	private void listarPorFiltro() {
		
	}
	
	private void listarEmpleado() {
		
	}
	
	private void ordenarPorNombre(List<Empleado> empleados) {
		
	}
}
