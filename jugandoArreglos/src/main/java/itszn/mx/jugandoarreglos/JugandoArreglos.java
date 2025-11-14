/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/*Probando webhook */
/*Huevo *//*Frijoles*/

package itszn.mx.jugandoarreglos;

/**
 *
 * @author ossii
 */
public class JugandoArreglos {

    public static void main(String[] args) {
        OperacionesArreglos op=new OperacionesArreglos();
        float[] pesos={12f, 45f, 3.5f};
        float sum=op.calcularSuma(pesos);
        System.out.println("La suma es "+sum);
        
        float[] cant={12f, 45f, 3.5f};
        float prom=op.calcularPromedio(cant);
        System.out.println("El promedio es "+prom);
        
        float[] num={4f, 2f, 7f, 9f};
        float lim=5f;
        float res=op.recorridoLimite(num,lim);
        System.out.println("Los numeros que Superan el limite son "+res);
        
        float[] numeros = {1.2f, 3.4f, 5.6f, 7.8f};
        float[] resultado = op.RecorridoInvertido(numeros);
        System.out.println("Arreglo invertido:");
        for(float nume : resultado){
            System.out.print(nume + " ");
        }
        System.out.println(" ");
        
        float[] numer = {2f, -3f, -4f, 5f};
        float[] resu = op.ArregloAbsoluto(numer);
        System.out.println("Arreglo con valores absolutos:");
        for (float numero : resu){
            System.out.print(numero + " ");
        }
        System.out.println(" ");
        
    }
}
