import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiantes = {
                new Estudiante("Maria", 785),
                new Estudiante("Karla", 569),
                new Estudiante("Anyela", 154),
                new Estudiante("Mariana", 965),
                new Estudiante("Sheyla", 125)
        };
        Arrays.sort(estudiantes);


        int idABuscar = 234;
        int indiceBinario = busquedaBinaria.buscar(idABuscar);


        System.out.println("\nBúsqueda binaria:");
        if (indiceBinario != -1) {
            System.out.println("El estudiante con id " + idABuscar + " se encuentra en el índice " + indiceBinario);
        } else {
            System.out.println("El estudiante con id " + idABuscar + " no se encuentra en el arreglo");
        }

        System.out.println("\nEstudiantes ordenados por id:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getNombre() + " - " + estudiante.getId());
        }
    }
}