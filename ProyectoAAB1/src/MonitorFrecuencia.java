import java.util.Scanner;
public class MonitorFrecuencia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double dia, mes, año, eA, fMax, fEMin, fEMax;
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
        eA = 2024 - año;
        fMax = 220 - eA;
        fEMin = fMax * 0.5;
        fEMax = fMax * 0.85;
        System.out.printf("|\t%s\t|\t%s\t|\t%s\t|\t%s\t|", "NOMBRE", "FECHA DE NACIMIENTO", "FRECUENCIA MAXIMA", "FRECUENCIA ESPERADA");
        System.out.printf("\n|\t%s\t|\t%.2f %s %.2f %s %.2f\t|\t%.2f\t\t\t|\t%.2f %s %.2f\t|\n", nom, dia, "/", mes, "/", año, fMax, fEMin, " - ", fEMax);
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
/***
 * run:
Ingrese su primer nombre: Matthew
Ingrese su dia de nacimiento: 2
Ingrese su mes de nacimiento: 4
Ingrese su a�o de nacimiento: 2006
|	NOMBRE	|	FECHA DE NACIMIENTO	|	FRECUENCIA MAXIMA	|	FRECUENCIA ESPERADA	|
|	Matthew	|	2,00 / 4,00 / 2006,00	|	202,00			|	101,00  -  171,70	|
Ingrese el limite de veces que se registra su estado: 3
Ingrese su nivel cardiaco actual: 100
Agregue un indicador adicional que usted considere relevante: a
|	TIEMPO	|	RITMO	|	ESTADO	|	INDICADOR	|
|	1	|	100	|	Ritmo cardiaco demasiado reducido	|	a	|
Ingrese su nivel cardiaco actual: 130
Agregue un indicador adicional que usted considere relevante: b
|	TIEMPO	|	RITMO	|	ESTADO	|	INDICADOR	|
|	2	|	130	|	Ritmo esperado	|	b	|
Ingrese su nivel cardiaco actual: 180
Agregue un indicador adicional que usted considere relevante: c
|	TIEMPO	|	RITMO	|	ESTADO	|	INDICADOR	|
|	3	|	180	|	Ritmo cardiaco demasiado elevado	|	c	|
BUILD SUCCESSFUL (total time: 33 seconds)
 */