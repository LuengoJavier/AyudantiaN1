import java.util.Scanner;

public class Ventana {

	public void main(String[] args) {
		menu();
	}

	private static void menu() {
		ListaTareas listaTareas = new ListaTareas();
		Scanner leer = new Scanner(System.in);
		int opcion;
		String frase;
		do{
			System.out.println("MENU \n 1.- Agregar Tarea. \n 2.- Eliminar Tarea. \n 3.- Mostrar Tarea \n 4.- Salir");
			opcion = leer.nextInt();

			switch (opcion) {
				case 1:
					System.out.println("Ingrese nombre de la tarea a agregar: " );
					frase = leer.nextLine();
					listaTareas.agregarTarea(frase);
					break;
				case 2:
					System.out.println("Ingrese nombre de la tarea a eliminar: " );
					frase = leer.nextLine();
					listaTareas.eliminarTarea(frase);
					break;
				case 3:
					System.out.println("Mostrando su lista de tareas...\n");
					listaTareas.mostrarTareas();
					break;
				case 4:
					salir();
					break;
			}
		} while(opcion >= -100000 && opcion <=40000000);

	}
	private static void salir() {
			Scanner leer = new Scanner(System.in);
			int opcion;
			do {
				System.out.println("Desea terminar el programa:\n 1.- SI  2.- NO");
				opcion = leer.nextInt();
			} while (opcion != 1 && opcion !=2);
			if (opcion == 2) {
				menu();
			} else {
				System.out.println("Se ha cerrado la sesión");
			}

	}
}