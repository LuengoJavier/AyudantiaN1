import java.util.Scanner;

public class Ventana {

	public static void main(String[] args) {
		Ventana ventana = new Ventana();
		ventana.menu();
	}
	public static void menu() {
		ListaTareas listaTareas = new ListaTareas();
		Scanner leer = new Scanner(System.in);
		int opcion;
		String frase;
		do{
			System.out.println("MENU \n 1.- Agregar Tarea. \n 2.- Eliminar Tarea. \n 3.- Mostrar Tarea \n 4.- Salir");
			opcion = leer.nextInt();

			switch (opcion) {
				case 1:
					frase = consultar(opcion);
					listaTareas.agregarTarea(frase);
					break;
				case 2:
					frase = consultar(opcion);
					listaTareas.eliminarTarea(frase);
					break;
				case 3:
					System.out.println("Mostrando su lista de tareas...\n");
					listaTareas.mostrarTareas();
					break;
				case 4:
					salir();
					break;
				default:
					break;
			}
		} while(opcion >= 1 && opcion <=4);

	}
	private static void salir() {
			Scanner leer = new Scanner(System.in);
			int opcion = 0;
			do {
				System.out.println("Desea terminar el programa:\n 1.- SI  2.- NO");
				opcion = leer.nextInt();
				if(opcion==1){
					System.out.println("Se ha cerrado la sesión");
					System.exit(0);
				} else if (opcion==2) {
					menu();
				}
			} while (opcion != 1 && opcion !=2);
	}
	private static String consultar(int opcion){
		Scanner leer = new Scanner(System.in);
		String frase = null;
		if (opcion == 1){
			System.out.println("Ingrese nombre de la tarea a agregar: " );
			frase = leer.nextLine();
		} else if (opcion == 2) {
			System.out.println("Ingrese nombre de la tarea a eliminar: " );
			frase = leer.nextLine();
		}
		return frase;
	}
}