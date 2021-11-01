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
public class Competidores {
    public static int cant_reg() throws IOException{
        int cant_regis=0;
        Scanner leo = new Scanner (new File("Competidores.txt"));
         while(leo.hasNextLine()){
             leo.nextLine();
             cant_regis++;
         }leo.close();
        return cant_regis;
    }
    public static void leoArch(String nombre[],int[][] califica)throws IOException{
        Scanner leo = new Scanner (new File("Competidores.txt"));
        int i=0;
        while(leo.hasNextLine()){
            nombre[i]=leo.next();
            for (int j = 0; j <califica[0].length ; j++) {
                califica[i][j]=leo.nextInt();
            }
            i++;
        }leo.close();
    }
    public static void mayorValor(int[][] califica,int mayoresV[]) throws IOException {
        for (int i = 0; i < califica.length; i++) {
            mayoresV[i]=califica[i][0];
            for (int j = 0; j < califica[0].length; j++) {
                if(califica[i][j]>mayoresV[i]){
                    mayoresV[i]= califica[i][j];
                }
            }
            
        }
    }
    public static void menorValor(int puntos[][],int menorValor[])throws IOException{
        for (int i = 0; i <puntos.length; i++) {
            menorValor[i]=puntos[i][0]; 
            for (int j = 0; j < puntos[0].length; j++) {
                if(puntos[i][j]<menorValor[i]){
                    menorValor[i]=puntos[i][j];
                }
            }
            
        }
        
    }
    public static void calculos(int califica[][],int menorValor[],int mayorValor[],double puntaje[]){
        
        for (int i = 0; i < califica.length; i++) {
            double suma =0; double valor=0;int cont=0;double prom=0;double menor=0;double mayor=0;
            for (int j = 0; j < califica[0].length; j++) {
                valor= califica[i][j];
                suma+=valor;
                cont++;
                if(cont==6){
                     menor=menorValor[i];
                     mayor=mayorValor[i];
                     prom= (suma - mayor - menor) /4;
                     puntaje[i]= prom;
                     
                }
            }
            
        }
    }
    public static void mostrar(String nombre[],int califica[][],int menorValor[],int mayorValor[],double puntaje[]){
        System.out.println("Nombre              Calificaciones          Puntaje");
        for (int i = 0; i < nombre.length; i++) {
           
            System.out.printf("%-10s ",nombre[i]);
            
            for (int j = 0; j < califica[0].length; j++) {
                System.out.printf("%4d ",califica[i][j]);
                
            }
            System.out.printf("%8.2f ",puntaje[i]);
             System.out.println("");
        }
    }
    
    
}
