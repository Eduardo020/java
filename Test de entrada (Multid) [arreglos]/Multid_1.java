/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multid;

import java.util.Scanner;

/**
 *
 * @author dci
 */
public class Multid_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 

        Scanner sc = new Scanner(System.in);
        int cant_Notas;
        int cant_Alum;
        int i, j;
        int N = 0;
        double suma_n = 0;
        double promedio_n = 0;
        double nota_maxima_n = 0;
        double nota_minima_n =70;
        double suma = 0;
        double promedio = 0;
        double nota_maxima = 0;
        double nota_minima = 70;
        double cant_Total;

        System.out.print("Ingrese cantidad de alumnos: ");
        cant_Alum = sc.nextInt();

        System.out.print("Ingrese cantidad de Notas por alumno: ");
        cant_Notas = sc.nextInt();

        double matriz[][] = new double[cant_Alum][cant_Notas];

        for (i = 0; i < matriz.length; i++) {
            System.out.println();
            for (j = 0; j < matriz[i].length; j++) {
                System.out.print("Alumno " + (i + 1) + " / Ingrese nota " + (j + 1) + ": ");
                matriz[i][j] = sc.nextDouble();

            }
        }
        System.out.println("");
        System.out.print("         |");
        for (i = 1;i  <= cant_Notas;i ++) {
            System.out.print("Notas " + i + "|");
        }
        for (i = 0; i < 1; i ++) {
            System.out.print("Max  |");
            System.out.print("Min |");
            System.out.print("Promedio |");
            
        }
        System.out.println("");
        for (i = 0; i < matriz.length; i++) {           
            System.out.print("Alumno " + (i + 1) + ": ");

            for (j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "     ");
                suma = suma + matriz[i][j];
                promedio = suma / cant_Notas;
                suma_n = suma_n + matriz[i][j];
                cant_Total = cant_Notas*cant_Alum;    
                promedio_n= suma_n/cant_Total;
                
                if (matriz[i][j] > nota_maxima) {
                    nota_maxima = matriz[i][j];
                }

                if (matriz[i][j] < nota_minima) {
                    nota_minima = matriz[i][j];
                }
                if (matriz[i][j]> nota_maxima_n) {
                    nota_maxima_n = matriz[i][j];
                }
                if (matriz[i][j] < nota_minima_n) {
                    nota_minima_n = matriz[i][j];
                }
            }
            nota_maxima_n = nota_maxima_n + 0;
            nota_minima_n = nota_minima_n +0;
            System.out.print("");
            System.out.print("" + nota_maxima);
            System.out.print("   " + nota_minima);
            suma = 0;
            nota_maxima = 0;
            nota_minima = 70;
            System.out.println("   " + promedio);
            N++;
        }
        System.out.println("------------------------------------------------");
        System.out.println("Promedio |" + promedio_n);
        System.out.println("Max      |" + nota_maxima_n);
        System.out.println("Min      |" + nota_minima_n);


        for (i = 0; i < matriz.length; i++) {
            System.out.println();
            System.out.print("Notas azules alumno " + (i + 1) + ":");
            for (j = 0; j < matriz[i].length; j++) {
                if ((matriz[i][j] >= 4.0) && (matriz[i][j] < 7.1)) {
                    System.out.print(" " + matriz[i][j]);

                }
            }
        }
        System.out.println();

    }

}
