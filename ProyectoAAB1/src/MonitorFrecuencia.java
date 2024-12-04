import java.util.Scanner;
public class MonitorFrecuencia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double dia, mes, año, eD, eM, eA, fMax, fEMin, fEMax;
        int i = 1, lim, card;
        String nom, niv, ind;
        System.out.print("Ingrese su primer nombre: ");
        nom = in.next();  
        System.out.print("Ingrese su dia de nacimiento: ");
        dia = in.nextDouble();
        System.out.print("Ingrese su mes de nacimiento: ");
        mes = in.nextDouble();
        System.out.print("Ingrese su año de nacimiento: ");
        año = in.nextDouble();
        eD = 30 - dia;
        eM = 12 - mes;
        eA = 2024 - año;
        fMax = 220 - eA;
        fEMin = fMax * 0.5;
        fEMax = fMax * 0.85;
        System.out.printf("|\t%s\t|\t%s\t|\t%s\t|\t%s\t|", "NOMBRE", "FECHA DE NACIMIENTO", "FRECUENCIA MAXIMA", "FRECUENCIA ESPERADA");
        System.out.printf("\n|\t%s\t|\t%.2f %s %.2f %s %.2f\t|\t%.2f\t\t\t|\t%.2f %s %.2f\t|\n", nom, eD, "/", eM, "/", eA, fMax, fEMin, " - ", fEMax);
        System.out.print("Ingrese el limite de veces que se registra su estado: ");
        lim = in.nextInt();
        while (i <= lim)
        {
            System.out.print("Ingrese su nivel cardiaco actual: ");
            card = in.nextInt();
            System.out.print("Agregue un indicador adicional que usted considere relevante: ");
            ind = in.next();
            if (card > fEMax)
                niv = "Ritmo cardiaco demasiado elevado";
            else if (card < fEMin)
                niv = "Ritmo cardiaco demasiado reducido";
            else niv = "Ritmo esperado";
            System.out.printf("|\t%s\t|\t%s\t|\t%s\t|\t%s\t|", "TIEMPO", "RITMO", "ESTADO", "INDICADOR");
            System.out.printf("\n|\t%s\t|\t%d\t|\t%s\t|\t%s\t|\n", i, card, niv, ind);
            i++;
        }
    }
}
