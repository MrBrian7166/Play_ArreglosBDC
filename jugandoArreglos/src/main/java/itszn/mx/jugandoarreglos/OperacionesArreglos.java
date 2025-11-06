/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itszn.mx.jugandoarreglos;

/**
 *
 * @author ossii
 */
public class OperacionesArreglos {
    public float calcularSuma(float[] num){
       if (num==null){
           return 0f;
       }
       float suma=0f;
       //Recorrer el arreglo
       for(int i=0; i<num.length; i++){
           suma = suma + num [i];
       }
       return suma;
    }
    
    public float calcularPromedio(float[] num){
        if (num==null){
           return 0f;
       }
       float suma=0f;
       float prom =0f;
       //Recorrer el arreglo
       for(int i=0; i<num.length; i++){
           suma = suma + num [i];
       }
       //Sacar promedio
       prom = suma / num.length;
       return prom;
    }
    
    public float recorridoLimite(float[] num,float lim){
       if (num==null){
           return 0f;
       }
       float res = 0f;
       //Recorrer el arreglo
       for(int i=0; i<num.length; i++){
           //Aplicar el limite
           if(num[i]> lim){
               res = res + 1;
           }
       }
       return res;
    }
    
     public float[] RecorridoInvertido(float[] arreglo) {
         if (arreglo==null){
           return new float[0];
       }
        int n = arreglo.length;
        float[] invertido = new float[n]; // nuevo arreglo para guardar los valores invertidos
        for (int i = 0; i < n; i++) {
            invertido[i] = arreglo[n - 1 - i]; // copia desde el final hacia el inicio
        }
        return invertido;
    }
     
    public float[] ArregloAbsoluto(float[] arreglo) {
       if (arreglo==null){
        return new float[0];
       }
        int n = arreglo.length;
        float[] absolutos = new float[n];
        for (int i = 0; i < n; i++) {
            absolutos[i] = Math.abs(arreglo[i]); // Math.abs devuelve el valor absoluto
        }
        return absolutos;
    }
}
