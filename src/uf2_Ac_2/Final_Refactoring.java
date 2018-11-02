package uf2_Ac_2;

import java.util.Scanner;

public class Final_Refactoring {

	public static void main(String[] args) {
		
		Calcular area= new Calcular(); // OBJETO DE TIPO "CALCULO" PARA ACCEDER A LOS M�TODOS DECLARADOS EN LA CLASE "CALCULO"
		
		area.Cabecera(); // M�TODO REFACTORIZADO QUE NO INPRIME LA CABECERA POR CONSOLA.
		
		area.menu(); // M�TODO REFACTORIZADO  QUE NOS IMPRIME EL MEN� POR CONSOLA.
		
	}

}

class Calcular {
	
	Scanner entrada = new Scanner(System.in); // OBJETO DE TIPO SCANNER PARA INTRODUCIR DATOS POR TECLADO
	
	double base;
	double altura;
	double lado;
	double area;         // DECLARACI�N DE VARIABLES
	double radio;
	double diagonalMayor;
	double diagonalMenor;
	private int opcion; 
	
//------ M�TODOS PARA LA CABECERA Y EL MEN� -----------------------------------------------------------------------------------------------------
	
    public void Cabecera() {
			
			System.out.println();
			System.out.println("                           ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println("                           ::: BIENVENIDO AL ASISTENTE PARA CALCULAR EL �REA DE LOS POL�GONOS :::");
			System.out.println("                           ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}
    
    public void menu() {
    	
    	System.out.println();
		System.out.println(" - A continuaci�n ver�s un men�. Escoge una Opci�n, por favor:");
		System.out.println();
		
		System.out.println("\n 1: Cuadrado \n 2: Tri�ngulo \n 3: Rect�ngulo \n 4: C�rculo \n 5: Rombo \n");
		System.out.println();
		
	    opcion = entrada.nextInt();
		
		
		switch(opcion) {
		
		case 1:
			System.out.println(" Esta opci�n te permite calcular el �rea de un Cuadrado: " + "\n");
			aCuadrado();
			break;
		case 2:
			System.out.println("Esta opci�n te permite calcular el �rea de un Tri�ngulo: " + "\n");
			aTriangulo();
			break;
		case 3:
			System.out.println(" Esta opci�n te permite calcular el �rea de un Rect�ngulo: " + "\n");
			aRectangulo();
			break;
		case 4:
			System.out.println(" Esta opci�n te permite calcular el �rea de un C�rculo: " + "\n");
			aCirculo();
			break;
		case 5: 
			System.out.println(" Esta opci�n te permite calcular el �rea de un Rombo: " + "\n");
			aRombo();
			break;
		default:
			System.out.println("La Opci�n que has escogido no existe.");
			break;
		}
    }
    
//------ M�TODOS PARA EL C�LCULO DE LAS AREAS ---------------------------------------------------------------------------------------------------
	
	public void aCuadrado() {
				
		System.out.println("** El �rea del Cuadrado se obtiene multiplicando su lado al cuadrado (Sus lados son iguales) **" + "\n");
		System.out.println("Introduce un lado, por favor: " + "\n");
		lado = entrada.nextDouble();
		
		area = Math.pow(lado, 2);
		System.out.println("                                                           EL AREA DE LA FIGURA ES: " + area);
	}
	
	public void aTriangulo() {
				
		System.out.println("** El �rea del Tri�ngulo se obtiene multiplicando la base por la altura y dividi�ndo el resultado por 2**" + "\n");
		System.out.println("Introduce la base, por favor: " + "\n");
		base = entrada.nextDouble();
		System.out.println("Introduce la altura, por favor: " + "\n");
		altura = entrada.nextDouble();
		
		area = base * altura /2; // RESULTADO DE LA OPERACI�N. �REA
		System.out.println();
		System.out.println("                                                           EL AREA DE LA FIGURA ES: " + area);
	}
	
	public void aRectangulo() { 
				
		System.out.println("** El �rea del rect�ngulo se obtiene multiplicando la base  por la altura **" + "\n");
		System.out.println("Introduce la base, por favor: " + "\n");
		base = entrada.nextDouble();
		System.out.println("Introduce la altura, por favor: " + "\n");
		altura = entrada.nextDouble();
		
		area = base * altura; // RESULTADO DE LA OPERACI�N. �REA
		System.out.println();
		System.out.println("                                                           EL AREA DE LA FIGURA  ES: " + area);
	}
	
	public void aCirculo() {
				
		System.out.println("** El �rea del C�rculo se obtiene multiplicando la constante matem�tica Pi por el radio"
				+ " del c�rculo al cuadrado **" + "\n");
		System.out.println("Introduce el radio, por favor: " + "\n");
		radio = entrada.nextDouble();
		
		area = Math.round(Math.PI * (Math.pow(radio, 2)));
		
		System.out.println("                                                           EL AREA DE LA FIGURA  ES: " + area);
	}
	
	public void aRombo() {
		
		System.out.println("** El �rea del Rombo se obtiene multiplicando su Diagonal  Mayor por su Diagonal Menor"
				+ " y dividiendo el resultado entre 2 **" + "\n");
		System.out.println("Introduce el valor correspondiente a la Diagonal Mayor, por favor:");
		diagonalMayor = entrada.nextDouble();
		System.out.println("Introduce el valor correspondiente a la Diagonal Menor, por favor:");
		diagonalMenor = entrada.nextDouble();
		
		area = diagonalMayor * diagonalMenor/2;
		
		System.out.println("                                                           EL AREA DE LA FIGURA  ES: " + area);
	}
}
