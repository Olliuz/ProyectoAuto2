package sesion01;

/*
Esto es un comentario multilinea
 */

import java.util.Scanner;

public class CalcularSalarioBruto {


    public static void  main(String[] args){

        //Tipo de  Dato -  Nombre de la Variable
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Horas trabajadas");
        int horas = scanner.nextInt();

        //System.out.println("He ingresado " + horas + " horas ");
        System.out.println("Ingrese su tarifa de pago ");
        double tarifa =scanner.nextDouble();
        double salario= obtenerSalario(horas,tarifa);

        System.out.println("El salario bruto calculado es " + salario);
    }

    public static  double obtenerSalario(int horas , double tarifa){

        return  horas * tarifa;

    }
}
