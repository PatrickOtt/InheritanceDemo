package de.professional_webworkx.parent;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/* 
 * hierbei handelt es sich um eine abstrakte Oberklasse,
 * das bedeutet wir können in der main Methode nicht einfach
 * Person p = new Person(...); aufrufen, aber da hilft
 * und die IDE oder spätestens der Compiler beim umwandeln
 * und meldet einen Fehler
 * 
 * Die Oberklasse muss nicht zwingend abstract sein!
 * Das macht nur Sinn, wenn es irgendwie blödsinnig wäre
 * von dieser Klasse Instanzen zu erzeugen
 */
public abstract class Person {

	/*
	 * Die Attribute versehen wir mit dem Modifier protected,
	 * damit können sie von der erbenden Klasse 
	 */
	protected String firstName;
	protected String lastName;
	protected GregorianCalendar birthday;
	protected char gender;
	
	/*
	 * private deklarierte Attribute bleiben private,
	 * d.h. auch in der abgeleiteten Kindklasse
	 * kann man nicht direkt auf dieses Attribut 
	 * zugreifen, wie es bei allen public / protected
	 * Attributen möglich ist
	 * Daher benötigen wir Get/Set Methoden um hier
	 * ebenfalls Werte setzen zu können.
	 */
	private double deposit;
	
	public Person(String firstName, String lastName,
			GregorianCalendar birthday, char gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.gender = gender;
	}

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

	public GregorianCalendar getBirthday() {
		return birthday;
	}

	public void setBirthday(GregorianCalendar birthday) {
		this.birthday = birthday;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	/*
	 *  um gleich noch die Wirkungsweise der Polymorphie zu demonstrieren
	 *  erstellen wir uns eine abstrakte Methode sayWhatYouDo(), die wir 
	 *  in den Unterklassen überschreiben, um sie dort zu implementieren
	 */
	public abstract void sayWhatYouDo();
	
	@Override
	public String toString() {
		SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		StringBuilder builder = new StringBuilder();
		builder.append("Person [firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", birthday=");
		builder.append(df.format(birthday.getTime()));
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", deposit=");
		builder.append(deposit);
		builder.append("EUR]");
		return builder.toString();
	}
}
