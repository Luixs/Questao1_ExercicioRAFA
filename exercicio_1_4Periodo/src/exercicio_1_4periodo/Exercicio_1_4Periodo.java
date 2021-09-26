/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_1_4periodo;
import java.util.Scanner;
public class Exercicio_1_4Periodo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        trapezio t1 = new trapezio();
        //INFORMANDO OS PARMS
        System.out.print("Informe a altura do trapézio: ");
        t1.setAltura(input.nextFloat());
        System.out.print("Informe a base maior do trapézio: ");
        t1.setBaseMaior(input.nextFloat());
        System.out.print("Informe a base menor do trapézio: ");
        t1.setBaseMenor(input.nextFloat());
        
        //AREA
        System.out.println("A area é: " + t1.area());
        System.out.println("A mediana de Euler é: " + t1.euler());
    }
    
}
