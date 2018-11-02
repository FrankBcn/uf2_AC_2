package uf2_Ac_2;

import java.util.Scanner;

public class Final_Refactoring {

	public static void main(String[] args) {
		
		Calcular area= new Calcular(); // OBJETO DE TIPO "CALCULO" PARA ACCEDER A LOS MÉTODOS DECLARADOS EN LA CLASE "CALCULO"
		
		area.Cabecera(); // MÉTODO REFACTORIZADO QUE NO INPRIME LA CABECERA POR CONSOLA.
		
		area.menu(); // MÉTODO REFACTORIZADO  QUE NOS IMPRIME EL MENÚ POR CONSOLA.
		
	}

}

class Calcular {
	
	Scanner entrada = new Scanner(System.in); // OBJETO DE TIPO SCANNER PARA INTRODUCIR DATOS POR TECLADO
	
	double base;
	double altura;
	double lado;
	double area;         // DECLARACIÓN DE VARIABLES
	double radio;
	double diagonalMayor;
	double diagonalMenor;
	private int opcion; 
	
//------ MÉTODOS PARA LA CABECERA Y EL MENÚ -----------------------------------------------------------------------------------------------------
	
    public void Cabecera() {
			
			System.out.println();
			System.out.println("                           ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println("                           ::: BIENVENIDO AL ASISTENTE PARA CALCULAR EL ÁREA DE LOS POLÍGONOS :::");
			System.out.println("                           ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}
    
    public void menu() {
    	
    	System.out.println();
		System.out.println(" - A continuación verás un menú. Escoge una Opción, por favor:");
		System.out.println();
		
		System.out.println("\n 1: Cuadrado \n 2: Triángulo \n 3: Rectángulo \n 4: Círculo \n 5: Rombo \n");
		System.out.println();
		
	    opcion = entrada.nextInt();
		
		
		switch(opcion) {
		
		case 1:
			System.out.println(" Esta opción te permite calcular el área de un Cuadrado: " + "\n");
			aCuadrado();
			break;
		case 2:
			System.out.println("Esta opción te permite calcular el área de un Triángulo: " + "\n");
			aTriangulo();
			break;
		case 3:
			System.out.println(" Esta opción te permite calcular el área de un Rectángulo: " + "\n");
			aRectangulo();
			break;
		case 4:
			System.out.println(" Esta opción te permite calcular el área de un Círculo: " + "\n");
			aCirculo();
			break;
		case 5: 
			System.out.println(" Esta opción te permite calcular el área de un Rombo: " + "\n");
			aRombo();
			break;
		default:
			System.out.println("La Opción que has escogido no existe.");
			break;
		}
    }
    
//------ MÉTODOS PARA EL CÁLCULO DE LAS AREAS ---------------------------------------------------------------------------------------------------
	
	public void aCuadrado() {
				
		System.out.println("** El área del Cuadrado se obtiene multiplicando su lado al cuadrado (Sus lados son iguales) **" + "\n");
		System.out.println("Introduce un lado, por favor: " + "\n");
		lado = entrada.nextDouble();
		
		area = Math.pow(lado, 2);
		System.out.println("                                                           EL AREA DE LA FIGURA ES: " + area);
	}
	
	public void aTriangulo() {
				
		System.out.println("** El área del Triángulo se obtiene multiplicando la base por la altura y dividiéndo el resultado por 2**" + "\n");
		System.out.println("Introduce la base, por favor: " + "\n");
		base = entrada.nextDouble();
		System.out.println("Introduce la altura, por favor: " + "\n");
		altura = entrada.nextDouble();
		
		area = base * altura /2; // RESULTADO DE LA OPERACIÓN. ÁREA
		System.out.println();
		System.out.println("                                                           EL AREA DE LA FIGURA ES: " + area);
	}
	
	public void aRectangulo() { 
				
		System.out.println("** El área del rectángulo se obtiene multiplicando la base  por la altura **" + "\n");
		System.out.println("Introduce la base, por favor: " + "\n");
		base = entrada.nextDouble();
		System.out.println("Introduce la altura, por favor: " + "\n");
		altura = entrada.nextDouble();
		
		area = base * altura; // RESULTADO DE LA OPERACIÓN. ÁREA
		System.out.println();
		System.out.println("                                                           EL AREA DE LA FIGURA  ES: " + area);
	}
	
	public void aCirculo() {
				
		System.out.println("** El área del Círculo se obtiene multiplicando la constante matemática Pi por el radio"
				+ " del círculo al cuadrado **" + "\n");
		System.out.println("Introduce el radio, por favor: " + "\n");
		radio = entrada.nextDouble();
		
		area = Math.round(Math.PI * (Math.pow(radio, 2)));
		
		System.out.println("                                                           EL AREA DE LA FIGURA  ES: " + area);
	}
	
	public void aRombo() {
		
		System.out.println("** El área del Rombo se obtiene multiplicando su Diagonal  Mayor por su Diagonal Menor"
				+ " y dividiendo el resultado entre 2 **" + "\n");
		System.out.println("Introduce el valor correspondiente a la Diagonal Mayor, por favor:");
		diagonalMayor = entrada.nextDouble();
		System.out.println("Introduce el valor correspondiente a la Diagonal Menor, por favor:");
		diagonalMenor = entrada.nextDouble();
		
		area = diagonalMayor * diagonalMenor/2;
		
		System.out.println("                                                           EL AREA DE LA FIGURA  ES: " + area);
	}
}
