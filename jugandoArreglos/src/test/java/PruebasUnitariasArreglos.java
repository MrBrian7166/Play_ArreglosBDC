/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import itszn.mx.jugandoarreglos.OperacionesArreglos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ossii
 */
public class PruebasUnitariasArreglos {
    
    public PruebasUnitariasArreglos() {
    }
    
    private OperacionesArreglos opa;
    @BeforeEach
    public void setUp() {
        opa = new OperacionesArreglos();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void pruebaSuma1(){
        float[] entrada={10f,15f,10f};
        float salidaEsperada=35f;
        
        float salidaReal=opa.calcularSuma(entrada);
        assertEquals(salidaEsperada,salidaReal);
    }
    
    @Test
    public void pruebaSuma2nulo(){
        float[] entrada=null;
        float salidaEsperada=0f;
        
        float salidaReal=opa.calcularSuma(entrada);
        assertEquals(salidaEsperada,salidaReal);
    }
    
    @Test
    public void pruebaPromedio1(){
        float[] entrada={12f, 45f, 3.5f};
        float salidaEsperada=20.166666f;
        
        float salidaReal=opa.calcularPromedio(entrada);
        assertEquals(salidaEsperada,salidaReal);
    }
    
    @Test
    public void pruebaPrimedio2nulo(){
        float[] entrada=null;
        float salidaEsperada=0f;
        
        float salidaReal=opa.calcularPromedio(entrada);
        assertEquals(salidaEsperada,salidaReal);
    }
    
    @Test
    public void pruebaLimite1(){
        float[] entrada={4f, 2f, 7f, 9f};
        float lim=5f;
        float salidaEsperada=2f;
        float salidaReal=opa.recorridoLimite(entrada,lim);
        assertEquals(salidaEsperada,salidaReal);
    }
    
    @Test
    public void pruebaLimite2null(){
        float[] entrada= null;
        float lim=5f;
        float salidaEsperada=0f;
        
        float salidaReal=opa.recorridoLimite(entrada,lim);
        assertEquals(salidaEsperada,salidaReal);
    }
    
    @Test
    public void pruebaInvertidos1(){
        float[] entrada={1.2f, 3.4f, 5.6f, 7.8f};
        float[] salidaEsperada={7.8f,5.6f,3.4f,1.2f};
        
        float[] salidaReal= opa.RecorridoInvertido(entrada);
        assertEquals(salidaEsperada,salidaReal);
    }
    
    @Test
    public void pruebaInvertidos2nulo(){
        float[] entrada=null;
        float[] salidaEsperada={};
        
        float[] salidaReal= opa.RecorridoInvertido(entrada);
        assertEquals(salidaEsperada,salidaReal);
    }
    
    @Test
    public void pruebaAbsoluto1(){
        float[] entrada={2f, -3f, -4f, 5f};
        float[] salidaEsperada={2f, 3f, 4f, 5f};
        
        float[] salidaReal= opa.ArregloAbsoluto(entrada);
        assertEquals(salidaEsperada,salidaReal);
    }
    
    @Test
    public void pruebaAbsoluto2nulo(){
        float[] entrada=null;
        float[] salidaEsperada={};
        float[] salidaReal= opa.ArregloAbsoluto(entrada);
        assertEquals(salidaEsperada,salidaReal);
    }
    
    
}
