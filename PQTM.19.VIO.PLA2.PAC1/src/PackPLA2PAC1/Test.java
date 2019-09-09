package PackPLA2PAC1;

public class Test {

	public static void main(String[] args) {
		System.out.println("*********************************************************************");
		System.out.println("*                        << PERSONA >>                              *");
		System.out.println("*                                                                   *");
		System.out.println("*********************************************************************");

		Persona P1 = new Persona("Toto" , new Fecha(9, 9, 2000), new Hora(14, 22), "43394845D");
		P1.imprimirDatos();
		
		Persona P2 = new Persona("Pepet" , new Fecha(17, 11, 2001), new Hora(23, 15), "43394845D");
		P2.imprimirDatos();
		
		System.out.println("");
		System.out.println("*********************************************************************");
		System.out.println("*                        << ESTUDIANTE >>                           *");
		System.out.println("*                                                                   *");
		System.out.println("*********************************************************************");

		Estudiante E1 = new Estudiante(23990, "Pepet de las Angustias", new Fecha(10, 03, 1973), new Hora(12, 32), "4398735T");
		E1.imprimirDatos();
		E1.mayorEdad();
		
		Estudiante E2 = new Estudiante(23991, "Joan Tortell", new Fecha(8, 9, 2012), new Hora(12, 32), "4398735T");
		E2.imprimirDatos();
		E2.mayorEdad();   
		
		System.out.println("");
		System.out.println("*********************************************************************");
		System.out.println("*                        << CARD >>                                 *");
		System.out.println("*                                                                   *");
		System.out.println("*********************************************************************");

		Card C1 = new Card("4766642583551762", "0987" , new Fecha(31, 01, 2023));
		C1.imprimirCard();
	}

}
