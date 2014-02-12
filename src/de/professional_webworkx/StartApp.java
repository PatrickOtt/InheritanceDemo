package de.professional_webworkx;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import de.professional_webworkx.children.Professor;
import de.professional_webworkx.children.Student;
import de.professional_webworkx.parent.Person;

public class StartApp {

	public static void main(String[] args) {
		GregorianCalendar birthday = new GregorianCalendar(1970, 0, 1);
		// geht nicht!
		// Person p = new Person("Patrick", "Ott", birthday, 'm');
		
		/*
		 * Array erzeugen, in das Personen aufgenommen werden
		 * können, Personen sind auch Objekte anderer
		 * Klassen, die die Basisklasse Person erweitern
		 */
		Person persons[] = new Person[2];
		Student student = new Student("Patrick", "Ott", birthday, 'm', "4711-0815", "Verwaltungsinformatik");
		Professor professor = new Professor("Max", "Mustermann", birthday, 'm', "W2");
		persons[0] = student;

		// erstellen einer typisierten Liste
		List<Person> personsDemo = new ArrayList<Person>();
		// die Student und Prof Instanz hinzufügen
		personsDemo.add(student);
		personsDemo.add(professor);
		// for each Schleife zum durchgehen der 
		// Personen Liste
		for(Person p : personsDemo) {
			// auf dem extrahierten Person Objekt die 
			// sayWhatYouDo() Methode aufrufen und
			// happy sein :) weil immer die richtige Methode
			// aufgerufen wird.
			p.sayWhatYouDo();
		}
	}
}
