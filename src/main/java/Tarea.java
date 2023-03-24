import java.util.Date;

public class Tarea {
	private String nombre;

	public Tarea(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return getNombre()+" \n";
	}
}