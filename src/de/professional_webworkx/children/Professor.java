package de.professional_webworkx.children;

import java.util.GregorianCalendar;

import de.professional_webworkx.parent.Person;

public class Professor extends Person {

	private String entgeldgruppe;
	
	public Professor(String firstName, String lastName, GregorianCalendar birthday, char gender,
			String entgeldgruppe) {
		super(firstName, lastName, birthday, gender);
		this.entgeldgruppe = entgeldgruppe;
	}

	public String getEntgeldgruppe() {
		return entgeldgruppe;
	}

	public void setEntgeldgruppe(String entgeldgruppe) {
		this.entgeldgruppe = entgeldgruppe;
	}

	@Override
	public void sayWhatYouDo() {
		System.out.println("Hallo, ich bin Prof und habe die Entgeldgruppe " + entgeldgruppe);
	}

}
