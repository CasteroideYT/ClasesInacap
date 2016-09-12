package ejercicio1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ejecuta1 {
     public static void main(String[]args) throws Exception{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        //Solicitud de tamaño de arreglo\\
        System.out.print("Ingresa tamaño de arreglo  -->");
        int tamanio=Integer.parseInt(bf.readLine());
        int arreglo[]=new int[tamanio];
        //Ingreso de datos a arreglo\\
        Arreglos arr=new Arreglos();
        arr.ingresarDatos(arreglo);
        arr.ordenaDatos(arreglo);
        arr.muestraDatos(arreglo);
     }
}
