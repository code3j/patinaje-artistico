/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCompetidores;
import java.io.*;
import java.util.*;
/**
 *
 * @author NB-3170
 */
public class Principal_Patinaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int regis= Competidores.cant_reg();
        int califica[][]= new int[regis][6];
        double puntaje []= new double [regis];
        String nombre []=new String [regis];
        int menorValor[]= new int[regis];
        int mayorValor[]=new int[regis];
        Competidores.leoArch(nombre, califica);
        Competidores.mayorValor(califica, mayorValor);
       Competidores.menorValor(califica, menorValor);
       Competidores.calculos(califica, menorValor, mayorValor, puntaje);
       Competidores.mostrar(nombre, califica, menorValor, mayorValor, puntaje);
    }
    
}
