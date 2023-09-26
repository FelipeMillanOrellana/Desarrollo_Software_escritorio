package duoc.cl.veterinaria;

import duoc.cl.veterinaria.Models.Mascota;
import java.util.Scanner;

public class Veterinaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mascota[] arrMascota = new Mascota[15];
        int contadorMascotas = 0;

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Crear una mascota");
            System.out.println("2. Editar una mascota");
            System.out.println("3. Eliminar una mascota");
            System.out.println("4. Listar las mascotas creadas");
            System.out.println("5. Salir del sistema");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de nextInt()

            switch (opcion) {
                case 1 -> {
                    if (contadorMascotas < arrMascota.length) {
                        System.out.print("Ingrese el nombre de la mascota: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese la fecha de nacimiento: ");
                        String fechaNacimiento = scanner.nextLine();
                        System.out.print("Ingrese el número de chip: ");
                        String Nchip = scanner.nextLine();
                        System.out.print("Ingrese el nombre del dueño: ");
                        String NombreDueño = scanner.nextLine();

                        arrMascota[contadorMascotas] = new Mascota(nombre, fechaNacimiento, Nchip, NombreDueño);
                        contadorMascotas++;
                        System.out.println("Mascota creada con éxito.");
                    } else {
                        System.out.println("No se pueden crear más mascotas. Limite alcanzado.");
                    }
                }
                case 2 -> {
                    System.out.print("Ingrese el número de chip de la mascota a editar: ");
                    String chipEditar = scanner.nextLine();
                    boolean encontrada = false;
                    for (int i = 0; i < contadorMascotas; i++) {
                        if (arrMascota[i] != null && arrMascota[i].getNchip().equals(chipEditar)) {
                            System.out.print("Ingrese el nuevo nombre: ");
                            String nuevoNombre = scanner.nextLine();
                            arrMascota[i].setNombre(nuevoNombre);
                            System.out.println("Mascota editada con éxito.");
                            encontrada = true;
                            break;
                        }
                    }
                    if (!encontrada) {
                        System.out.println("Mascota no encontrada.");
                    }
                }
                case 3 -> {
                    System.out.print("Ingrese el número de chip de la mascota a eliminar: ");
                    String chipEliminar = scanner.nextLine();
                    for (int i = 0; i < contadorMascotas; i++) {
                        if (arrMascota[i] != null && arrMascota[i].getNchip().equals(chipEliminar)) {
                            arrMascota[i] = null;
                            System.out.println("Mascota eliminada con éxito.");
                            break;
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Listado de mascotas:");
                    for (int i = 0; i < contadorMascotas; i++) {
                        if (arrMascota[i] != null) {
                            System.out.println("Nombre: " + arrMascota[i].getNombre());
                            System.out.println("Fecha de Nacimiento: " + arrMascota[i].getFechaNacimiento());
                            System.out.println("Número de Chip: " + arrMascota[i].getNchip());
                            System.out.println("Nombre del Dueño: " + arrMascota[i].getNombreDueño());
                            System.out.println("-----------------------------");
                        }
                    }
                }
                case 5 -> {
                    System.out.println("Saliendo del sistema.");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}