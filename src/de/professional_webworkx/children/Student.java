package de.professional_webworkx.children;

import java.util.GregorianCalendar;

import de.professional_webworkx.parent.Person;

/*
 * hier wird nun die Klasse Student erstellt, die alle 
 * Eigenschaften aus unserer Klasse Person erbst, d.h.
 * wir müssen uns hier nicht mehr darum kümmern, wie
 * wir z.B. auf das Geburtsdatum oder den Vornamen 
 * zugreifen 
 */
public class Student extends Person {
	
	/*
	 * Studenten haben in der Regel aber mindestens 2 Attribute mehr,
	 * nämlich einen Matrikelnummer und einen Studiengang
	 * diese beiden Attribute erstellen wir hier in dieser
	 * Klasse neu, denn dadurch hebt sich unser Student ja von der
	 * allgemeinen Person ab
	 */

	private String matNummer;
	private String studiengang;
	
	public Student(String firstName, String lastName, GregorianCalendar birthday, char gender, 
			String matNummer, String studiengang) {
		/*
		 * hier rufen wir den Konstruktor der Klasse Person auf und
		 * reichen ihm die benötigten Argument rüber 
		 * da hilft natürlich die IDE, wenn man eine neue Klasse erstellt
		 * und angibt, das diese von einer anderen Klasse erben soll
		 * man bekommt an der Stelle den Hinweis, einen 
		 * entsprechenden Konstruktor bereitzustellen, der mindestens
		 * die Argumente als Parameter beinhaltet, die die Oberklasse
		 * benötigt.
		 */
		super(firstName, lastName, birthday, gender);
		
		
		/*
		 * Weil unser Student eine Spezialisierung von einer Person ist
		 * spendieren wir ihm 2 weitere Attribute, nämlich 
		 * matrikelNummer und studiengang, daher musste auch der
		 * Studentkonstruktor erweitert werden
		 */
		this.matNummer = matNummer;
		this.studiengang = studiengang;
		
	}

	public String getMatNummer() {
		return matNummer;
	}

	public void setMatNummer(String matNummer) {
		this.matNummer = matNummer;
	}

	public String getStudiengang() {
		return studiengang;
	}

	public void setStudiengang(String studiengang) {
		this.studiengang = studiengang;
	}

	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString() + "\n");
		builder.append("Student [matNummer=");
		builder.append(matNummer);
		builder.append(", studiengang=");
		builder.append(studiengang);
		builder.append("]");
		return builder.toString();
	}

	/*
	 * (non-Javadoc)
	 * @see de.professional_webworkx.parent.Person#sayWhatYouDo()
	 * Diese Methode haben wir aus der Basisklasse geerbt und müssen
	 * sie in der Unterklasse implementieren, d.h. mit etwas
	 * Leben füllen
	 * Später können wir uns eine Liste von Personenobjekten
	 * erstellen, sämtliche Objekte, die Person beerben dort rein
	 * packen und einfach diese sayWhatYouDo() Methode aufrufen 
	 * und landen automatisch bei der richtigen Methoden
	 */
	@Override
	public void sayWhatYouDo() {
		System.out.println("Hallo, ich bin " + firstName + " " + lastName + " und bin fleißig am Studieren!");
	}
	
}
