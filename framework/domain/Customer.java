package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2520166020929559661L;
	private List<AProduct> products;
	private List<AProduct> history;

	public Customer(String id, LocalDate dob, String firstName, String lastName, String phoneNumber, Address address) {
		super(id, dob, firstName, lastName, phoneNumber, address);
		products = new ArrayList<>();
		history = new ArrayList<>();
	}

	public void rentProduct(AProduct product) {
		products.add(product);
		history.add(product);
	}

	public void listRentProduct(List<AProduct> product) {
		products.addAll(product);
		history.addAll(product);
	}

	public boolean removeRentProduct(AProduct product) {
		boolean isRemoved = products.remove(product);

		if (isRemoved)
			history.remove(product);

		return isRemoved;
	}

}
