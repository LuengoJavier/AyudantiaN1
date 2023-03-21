import java.util.ArrayList;
import java.util.Date;

public class ListaTareas {
	private ArrayList<Tarea> tareas = new ArrayList<>();

	public Tarea agregarTarea(String nombre) {
		Tarea tarea = new Tarea(nombre);
		this.tareas.add(tarea);
		return tarea;
	}

	public Tarea buscarTarea(String nombre, Date fecha) {
		throw new UnsupportedOperationException();
	}

	public boolean eliminarTarea(String nombre) {
		for(Tarea tarea : this.tareas){
			if(tarea.getNombre().equals(nombre)){
				tareas.remove(tarea);
				return true;
			}
		}
		return false;
	}

	public void mostrarTareas() {
		for(Tarea tarea : this.tareas){
			System.out.print(tarea.toString());
		}
	}
}