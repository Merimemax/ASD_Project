package domain;

import java.time.LocalDate;

public abstract class SystemUsers extends Person {

	private ACredential credentialA;

	public SystemUsers(String id, LocalDate dob, String firstName, String lastName, String phoneNumber, Address address,
			ACredential credentialA) {
		super(id, dob, firstName, lastName, phoneNumber, address);
		this.credentialA = credentialA;
	}

}
