/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package testjava;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mcasatti
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    /**
     * Test of Sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("Sumar");
        int numero1 = 1;
        int numero2 = 2;
        Calculadora instance = new Calculadora();
        int expResult = 3;
        int result = instance.Sumar(numero1, numero2);
        assertEquals(expResult, result);
    }

    /**
     * Test of Restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("Restar");
        int numero1 = 1;
        int numero2 = 1;
        Calculadora instance = new Calculadora();
        int expResult = 0;
        int result = instance.Restar(numero1, numero2);
        assertEquals(expResult, result);
    }

    /**
     * Test of Mayor method, of class Calculadora.
     */
    @Test
    public void testMayor() {
        System.out.println("Mayor");
        int numero1 = 3;
        int numero2 = 2;
        Calculadora instance = new Calculadora();
        int expResult = 3;
        int result = instance.Mayor(numero1, numero2);
        assertEquals(expResult, result);
    }

    /**
     * Test of Absoluto method, of class Calculadora.
     */
    @Test
    public void testAbsoluto() {
        System.out.println("Absoluto");
        int numero1 = -5;
        Calculadora instance = new Calculadora();
        int expResult = 5;
        int result = instance.Absoluto(numero1);
        assertEquals(expResult, result);
    }

    /**
     * Test of Cuadrado method, of class Calculadora.
     */
    @Test
    public void testCuadrado() {
        System.out.println("Cuadrado");
        int numero = 5;
        Calculadora instance = new Calculadora();
        int expResult = 25;
        int result = instance.Cuadrado(numero);
        assertEquals(expResult, result);
    }

    /**
     * Test of Signo method, of class Calculadora.
     */
    @Test
    public void testSigno() {
        System.out.println("Signo");
        int numero = 22;
        Calculadora instance = new Calculadora();
        int expResult = 1;
        int result = instance.Signo(numero);
        assertEquals(expResult, result);
    }
    
}
