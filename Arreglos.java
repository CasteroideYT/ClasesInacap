package ejercicio1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Arreglos {
   public void ingresarDatos(int a[]) throws Exception{
         BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
         for(int i=0;i<a.length;i++){
            System.out.print("Ingresa valor en posición: "+ i+ "--> ");
            a[i]=Integer.parseInt(bf.readLine());  
        }
   }
   public void ordenaDatos(int a[]){
        for(int i=0;i<a.length-1;i++){
              int min=i;
                   for(int j=i+1;j<a.length;j++)     {
                       if(a[j]<a[min])      {
                       min=j;}
                                              }
                  if(i!=min){
                       int aux =a[i];
                       a[i]=a[min];
                       a[min] = aux;}
        }
   }
   public void muestraDatos(int a[]){
       System.out.println("Los datos son:");
       for(int i=0;i<a.length;i++){
            System.out.print("["+ a[i]+"]");
            
        }
    }
}
