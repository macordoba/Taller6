package conceptosAvanzados;

import conceptosAvanzados.Operaciones;
import conceptosAvanzados.CalularIntegral;

public class CalcularIntegralError {
	
	private double error_aceptable;
	private double errorActual;
	private double errorAnterior;
	private double valorIncrenental = 0.5D;
	private int numeroCiclo = 2;
	private int gradosLibertdad;
	private double p;
	private double x = 1;

	public double getX() {
		return x;
	}

	public void setP(double p) {
		this.p = p;
	}

	public void setError_aceptable(double error_aceptable) {
		this.error_aceptable = error_aceptable;
	}

	public void setGradosLibertdad(int gradosLibertdad) {
		this.gradosLibertdad = gradosLibertdad;
	}

	public void calcularX()
	{
		CalularIntegral integral = new CalularIntegral();
		
		integral.setDof(gradosLibertdad);
		integral.setNumSeg(10);
		double resultadoIntegral = 0D;
		
		do{	
			integral.setX(x);
			integral.calcularp();
			resultadoIntegral = integral.getP();
			errorActual = p - resultadoIntegral;
			
			if(numeroCiclo == 2)
				errorAnterior = errorActual;
						
			if(Operaciones.validarSigno(errorActual, errorAnterior))
				valorIncrenental = valorIncrenental/2;
			
			if(p > resultadoIntegral)
				x += valorIncrenental;
			else
				x -= valorIncrenental;
			
			errorAnterior = errorActual;
			numeroCiclo += 2;
			
		}while(Math.abs(errorActual) > error_aceptable);
		
	}
	
}
