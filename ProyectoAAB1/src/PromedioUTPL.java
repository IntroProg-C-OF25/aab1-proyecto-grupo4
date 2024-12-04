import java.util.Scanner;
import java.util.Random;
public class PromedioUTPL {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        String nombre, cedula, materia;
        double acd, ape, aa, suma, porcen, porcenApro, porcenRepro, recu, notaFinal;
        int estuApro = 0, estuRepro = 0;
        int i = 0, numEstu = 0;
        System.out.println("Ingrese el numero de estudiantes: ");
        numEstu = teclado.nextInt();
        while (i < numEstu) {
            nombre = "Estudiante" + (i + 1);
            long min = 1_000_000_000L;
            long max = 1_999_999_999L;
            long randomNumber = min + (long) (random.nextDouble() * (max - min + 1));
            cedula = "EC" + randomNumber;
            materia = "Materia" + (i + 1);
            acd = random.nextDouble() * 3.5;
            ape = random.nextDouble() * 3.5;
            aa = random.nextDouble() * 3.0;
            suma = acd + ape + aa;
            porcen = suma;
            System.out.printf("Estudiante: %s | Cédula: %s | Materia: %s%n", nombre, cedula, materia);
            System.out.printf("Calificaciones - ACD: %.2f | APE: %.2f | AA: %.2f%n", acd, ape, aa);
            System.out.printf("Suma de calificaciones: %.2f%n", porcen);
            if (porcen >= 7) {
                System.out.println("Aprobado");
                estuApro++;
            } else {
                System.out.println("Estas en supletorios");
                recu = random.nextDouble() * 3.5;
                System.out.printf("Nota de recuperación: %.2f%n", recu);
                notaFinal = suma * 0.6 + recu;
                if (notaFinal >= 7) {
                    System.out.println("Reprobado inicialmente, pero aprobado con examen de recuperacion");
                    estuApro++;
                } else {
                    System.out.println("Reprobado, examen de recuperacion no suficiente");
                    estuRepro++;
                }
            }

            i++;
        }
        porcenApro = (estuApro / numEstu) * 100;
        porcenRepro = (estuRepro / numEstu) * 100;
        System.out.println("Estadísticas finales:");
        System.out.printf("Estudiantes Aprobados: %d (%.2f%%)%n", estuApro, porcenApro);
        System.out.printf("Estudiantes Reprobados: %d (%.2f%%)%n", estuRepro, porcenRepro);
    }
}
