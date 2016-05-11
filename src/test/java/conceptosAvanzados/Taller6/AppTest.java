package conceptosAvanzados.Taller6;

import conceptosAvanzados.CalcularIntegralError;
import junit.framework.TestCase;

/**
	@author Alvaro Cordoba.
	@version V 1.0
	@since 09/05/2016.
*/

/**
Clase que prueba la clase calcularIntegralError
*/

public class AppTest extends TestCase
{
	
	/*
	Metodo que prueba primer caso de prueba
	 */
	
	public void testCaso1()
    {
		CalcularIntegralError objectoCalculo = new CalcularIntegralError();
		objectoCalculo.setError_aceptable(0.0000001D);
		objectoCalculo.setGradosLibertdad(6);
		objectoCalculo.setP(0.20D);
		objectoCalculo.calcularX();
	
		assertEquals(0.55338D, objectoCalculo.getX(), 0.00001D);
		
    }
    
	/*
	Metodo que prueba el segundo caso de prueba
	 */
	
	public void testCaso2()
    {
		CalcularIntegralError objectoCalculo = new CalcularIntegralError();
		objectoCalculo.setError_aceptable(0.0000001D);
		objectoCalculo.setGradosLibertdad(15);
		objectoCalculo.setP(0.45D);
		objectoCalculo.calcularX();
		
		assertEquals(1.75305D, objectoCalculo.getX(), 0.00001D);
    }
    
	/*
	Metodo que prueba el tercer caso de prueba
	 */
	
	public void testCaso3()
    {
		CalcularIntegralError objectoCalculo = new CalcularIntegralError();
		objectoCalculo.setError_aceptable(0.0000001D);
		objectoCalculo.setGradosLibertdad(4);
		objectoCalculo.setP(0.495D);
		objectoCalculo.calcularX();
		
		assertEquals(4.60409D, objectoCalculo.getX(), 0.01D);
    }
    
}
