package PackPLA2PAC1;

public class Test {

	public static void main(String[] args) {
		System.out.println("*********************************************************************");
		System.out.println("*                        << PERSONA >>                              *");
		System.out.println("*                                                                   *");
		System.out.println("*********************************************************************");

		Persona P1 = new Persona("Toto" , new Fecha(9, 9, 2000), new Hora(14, 22), "43888845D", 1.93);
		P1.imprimirDatos();
		
		Persona P2 = new Persona("Pepet" , new Fecha(17, 11, 2001), new Hora(23, 15), "43888844J", 1.66);
		P2.imprimirDatos();
		
		System.out.println("");
		System.out.println("*********************************************************************");
		System.out.println("*                        << CARD CREDIT>>                           *");
		System.out.println("*                                                                   *");
		System.out.println("*********************************************************************");

		Credit CR1 = new Credit("4766642583551762", "0987" , new Fecha(31, 01, 2023), "ES3334455555");
		CR1.imprimirCard();
		CR1.printCurrentLimit();
		
		Credit CR2 = new Credit("4733342583552222", "1112" , new Fecha(11, 03, 2020), "ES5984848484", 2000);
		CR2.imprimirCard();
		CR2.printCurrentLimit();
		
		Credit CR3 = new Credit("4788842583553333", "0455", new Fecha(07, 06, 2019), "ES99048484444");
		CR3.imprimirCard();
		
		CR3.printCurrentLimit();
		
		System.out.println("");
		System.out.println("*********************************************************************");
		System.out.println("*                        << MASCOTA >>                              *");
		System.out.println("*                                                                   *");
		System.out.println("*********************************************************************");

		
		
		
		
		System.out.println("");
		System.out.println("*********************************************************************");
		System.out.println("*                        << ESTUDIANTE >>                           *");
		System.out.println("*                                                                   *");
		System.out.println("*********************************************************************");

		Estudiante E1 = new Estudiante(23990, "Pepet de las Angustias", new Fecha(10, 03, 1973), new Hora(12, 32), "4398735T", 1.45);
		E1.imprimirDatos();
		E1.mayorEdad();
		
		E1.getCreditList().add(CR3);
		E1.imprimirTarjetas();
		
		Estudiante E2 = new Estudiante(23991, "Joan Tortell", new Fecha(8, 9, 2012), new Hora(12, 32), "4398735T", 2.08);
		E2.imprimirDatos();
		E2.mayorEdad();   
	
		E2.getCreditList().add(CR1);
		E2.getCreditList().add(CR2);
		E2.imprimirTarjetas();
		
		E2.soyMasAltoQue(E1);
		
		CR1.increaseCreditLimit(1000);
		E2.getCreditList().get(0).getCreditLimit();
		E2.imprimirTarjetas();
	}

}
