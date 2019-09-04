package person;

/* Class Person   */

public class Person {

	// Attributes 
	// _______________________________
	   private String firstName;
	   private String lastName;
	   private String sex;	   
	   private int age;
	   private double height;
	   private double weight;
	   private String address;
	   private String postalCode;
	   private String nationality;
	   private String documentDni;
	   private String passport;
	   private boolean married;
	   
	// Constructor 
	// _______________________________
	   public Person(String firstName, String lastName, String sex, int age, double height, double weight, String address,
				String postalCode, String nationality, String documentDni, String passport, boolean married) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.sex = sex;
			this.age = age;
			this.height = height;
			this.weight = weight;
			this.address = address;
			this.postalCode = postalCode;
			this.nationality = nationality;
			this.documentDni = documentDni;
			this.passport = passport;
			this.married = married;
		}
	   
	   public Person(String firstName, String lastName, String sex, String documentDni) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.sex = sex;
			this.age = 0;
			this.height = 1.60;
			this.weight = 85.30;
			this.address = "";
			this.postalCode = "";
			this.nationality = "";
			this.documentDni = documentDni;
			this.passport = "";
			this.married = false;		   
	   }

	// Methods 
	// _______________________________	   
	    public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}
		
		public double getWeight() {
			return weight;
		}

		public void setWeight(double weight) {
			this.height = weight;
		}
		
		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPostalCode() {
			return postalCode;
		}

		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}

		public String getNationality() {
			return nationality;
		}

		public void setNationality(String nationality) {
			this.nationality = nationality;
		}

		public String getDocumentDni() {
			return documentDni;
		}

		public void setDocumentDni(String documentDni) {
			this.documentDni = documentDni;
		}

		public String getPassport() {
			return passport;
		}

		public void setPassport(String passport) {
			this.passport = passport;
		}

		public boolean isMarried() {
			return married;
		}

		public void setMarried(boolean married) {
			this.married = married;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}

	    
		public void becomeOlder() {
			age++;
		}
		
		public void isAdult(int age) {
			if (age > 18) {
				System.out.println("he's older");
			} else {
				System.out.println("is a minor");
			}
		}
		
		
		public void bodyMassIndex(double height, double weight) {
			System.out.print("The Body Mass Index is " + weight / (height * height));
		}
}
