package app;

import java.util.ArrayList;
import java.util.List;

public class Plantilla {
	
	private List<Empleado> empleados;
	
	public Plantilla() {
		this.empleados=empleados;
	}
	
	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}
	
	public List<Empleado> getEmpleadoPorNombre(String filtroNombre){
		String filtro = filtroNombre.toLowerCase();
		if(empleados.contains(filtro)) {
			return empleados;
		}else if (filtro=="") {
			return empleados;
		}else
			return empleados;
	}
	
}
